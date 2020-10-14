package test;

import com.emails.client.config.Config;
import com.emails.client.connector.SOAPConnector;
import email.com.web_service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class, loader = AnnotationConfigContextLoader.class)
public class EmailsTest {
    @Autowired
    SOAPConnector client;

    @Test
    public void verifyAllEmailsRequest() {
        GetAllEmailRequest request = new GetAllEmailRequest();
        GetAllEmailResponse response = (GetAllEmailResponse) client.callWebService(request);
        int size = response.getEmailsList().getEmail().size();
         assertEquals(6, size);
    }

    @Test
    public void verifyEmailRequestByAddress() {
        GetEmailByAddressRequest request = new GetEmailByAddressRequest();
        request.setAddress("email@gmail.com");
        GetEmailResponse response = (GetEmailResponse) client.callWebService(request);
        String codeStatus = response.getCode().getCodeStatus();
        assertEquals(codeStatus, "200");
    }

    @Test
    public void verifyEmailRequestBySubject() {
        GetEmailBySubjectRequest request = new GetEmailBySubjectRequest();
        request.setSubject("Second subject");
        GetEmailResponse response = (GetEmailResponse) client.callWebService(request);
        String codeStatus = response.getCode().getCodeStatus();
        assertEquals(codeStatus, "200");
    }

    @Test
    public void verifyDeleteRequest() {
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
    public void verifySetRequest() {
        SetEmailRequest request = new SetEmailRequest();
        request.setAddress("temp@email.com");
        request.setSubject("Subject new");
        request.setBody("Hello new buddy");
        SetEmailResponse response = (SetEmailResponse) client.callWebService(request);
        String codeResponse = response.getCode().getCodeStatus();
        assertEquals(codeResponse, "200");
    }
}
