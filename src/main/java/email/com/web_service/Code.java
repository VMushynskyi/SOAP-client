//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.10.27 at 03:02:06 PM EET 
//


package email.com.web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for code complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="code"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "code", propOrder = {
    "codeStatus",
    "codeMessage"
})
public class Code {

    protected String codeStatus;
    protected String codeMessage;

    /**
     * Gets the value of the codeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeStatus() {
        return codeStatus;
    }

    /**
     * Sets the value of the codeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeStatus(String value) {
        this.codeStatus = value;
    }

    /**
     * Gets the value of the codeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeMessage() {
        return codeMessage;
    }

    /**
     * Sets the value of the codeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeMessage(String value) {
        this.codeMessage = value;
    }

}
