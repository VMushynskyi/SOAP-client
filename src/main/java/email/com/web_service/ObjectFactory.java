//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.27 at 10:25:54 AM EET 
//


package email.com.web_service;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the email.com.web_service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: email.com.web_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmailByAddressRequest }
     * 
     */
    public GetEmailByAddressRequest createGetEmailByAddressRequest() {
        return new GetEmailByAddressRequest();
    }

    /**
     * Create an instance of {@link GetEmailBySubjectRequest }
     * 
     */
    public GetEmailBySubjectRequest createGetEmailBySubjectRequest() {
        return new GetEmailBySubjectRequest();
    }

    /**
     * Create an instance of {@link GetEmailResponse }
     * 
     */
    public GetEmailResponse createGetEmailResponse() {
        return new GetEmailResponse();
    }

    /**
     * Create an instance of {@link Code }
     * 
     */
    public Code createCode() {
        return new Code();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link DeleteEmailRequest }
     * 
     */
    public DeleteEmailRequest createDeleteEmailRequest() {
        return new DeleteEmailRequest();
    }

    /**
     * Create an instance of {@link DeleteEmailResponse }
     * 
     */
    public DeleteEmailResponse createDeleteEmailResponse() {
        return new DeleteEmailResponse();
    }

    /**
     * Create an instance of {@link GetAllEmailRequest }
     * 
     */
    public GetAllEmailRequest createGetAllEmailRequest() {
        return new GetAllEmailRequest();
    }

    /**
     * Create an instance of {@link GetAllEmailResponse }
     * 
     */
    public GetAllEmailResponse createGetAllEmailResponse() {
        return new GetAllEmailResponse();
    }

    /**
     * Create an instance of {@link EmailsList }
     * 
     */
    public EmailsList createEmailsList() {
        return new EmailsList();
    }

    /**
     * Create an instance of {@link SetEmailRequest }
     * 
     */
    public SetEmailRequest createSetEmailRequest() {
        return new SetEmailRequest();
    }

    /**
     * Create an instance of {@link SetEmailResponse }
     * 
     */
    public SetEmailResponse createSetEmailResponse() {
        return new SetEmailResponse();
    }

}
