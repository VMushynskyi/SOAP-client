package test;

import com.emails.client.config.Config;
import com.emails.client.connector.SOAPConnector;
import email.com.web_service.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class, loader = AnnotationConfigContextLoader.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmailsTest {
    @Autowired
    SOAPConnector client;

    @Test()
    @Description("verify that all emails request")
    public void test_1() {
        GetAllEmailRequest request = new GetAllEmailRequest();
        GetAllEmailResponse response = (GetAllEmailResponse) client.callWebService(request);
        int size = response.getEmailsList().getEmail().size();
         assertEquals(6, size);
    }

    @Test
    @Description("verify that email request by address")
    public void test_2() {
        GetEmailByAddressRequest request = new GetEmailByAddressRequest();
        request.setAddress("email@gmail.com");
        GetEmailResponse response = (GetEmailResponse) client.callWebService(request);
        String codeStatus = response.getCode().getCodeStatus();
        assertEquals(codeStatus, "200");
    }

    @Test
    @Description("verify that email request by subject")
    public void test_3() {
        GetEmailBySubjectRequest request = new GetEmailBySubjectRequest();
        request.setSubject("Second subject");
        GetEmailResponse response = (GetEmailResponse) client.callWebService(request);
        String codeStatus = response.getCode().getCodeStatus();
        assertEquals(codeStatus, "200");
    }

    @Test
    @Description("verify that email delete request")
    public void test_4() {
        DeleteEmailRequest request = new DeleteEmailRequest();
        request.setId(0);
        DeleteEmailResponse response = (DeleteEmailResponse) client.callWebService(request);
        String codeStatus = response.getCode().getCodeStatus();
        assertEquals(codeStatus, "204");
        GetAllEmailRequest getRequest = new GetAllEmailRequest();
        GetAllEmailResponse getResponse = (GetAllEmailResponse) client.callWebService(getRequest);
        int size = getResponse.getEmailsList().getEmail().size();
        assertEquals(5, size);
    }

    @Test
    @Description("verify that email delete request")
    public void test_5() {
        SetEmailRequest request = new SetEmailRequest();
        SetEmailResponse response = (SetEmailResponse) client.callWebService(request);
        String codeResponse = response.getCode().getCodeStatus();
        assertEquals(codeResponse, "200");
    }
}
