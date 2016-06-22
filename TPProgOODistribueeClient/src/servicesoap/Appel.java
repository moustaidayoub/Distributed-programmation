
package servicesoap;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for appel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="appel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="destinataire" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="duree" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="expediteur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "appel", propOrder = {
    "date",
    "destinataire",
    "duree",
    "expediteur",
    "numero"
})
public class Appel {

    @XmlSchemaType(name = "dateTime")
    protected Date date;
    protected String destinataire;
    protected double duree;
    protected String expediteur;
    protected int numero;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(Date value) {
        this.date = value;
    }

    /**
     * Gets the value of the destinataire property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinataire() {
        return destinataire;
    }

    /**
     * Sets the value of the destinataire property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinataire(String value) {
        this.destinataire = value;
    }

    /**
     * Gets the value of the duree property.
     * 
     */
    public double getDuree() {
        return duree;
    }

    /**
     * Sets the value of the duree property.
     * 
     */
    public void setDuree(double value) {
        this.duree = value;
    }

    /**
     * Gets the value of the expediteur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpediteur() {
        return expediteur;
    }

    /**
     * Sets the value of the expediteur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpediteur(String value) {
        this.expediteur = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

}
