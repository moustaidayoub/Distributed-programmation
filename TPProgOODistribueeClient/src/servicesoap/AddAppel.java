
package servicesoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addAppel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addAppel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="appel" type="{http://servicesoap/}appel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addAppel", propOrder = {
    "appel"
})
public class AddAppel {

    protected Appel appel;

    /**
     * Gets the value of the appel property.
     * 
     * @return
     *     possible object is
     *     {@link Appel }
     *     
     */
    public Appel getAppel() {
        return appel;
    }

    /**
     * Sets the value of the appel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appel }
     *     
     */
    public void setAppel(Appel value) {
        this.appel = value;
    }

}
