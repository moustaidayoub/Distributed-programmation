
package servicesoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicesoap package. 
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

    private final static QName _GetAppelsByExpResponse_QNAME = new QName("http://servicesoap/", "getAppelsByExpResponse");
    private final static QName _Appel_QNAME = new QName("http://servicesoap/", "appel");
    private final static QName _AddAppel_QNAME = new QName("http://servicesoap/", "addAppel");
    private final static QName _AddAppelResponse_QNAME = new QName("http://servicesoap/", "addAppelResponse");
    private final static QName _GetAppelsByExp_QNAME = new QName("http://servicesoap/", "getAppelsByExp");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicesoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Appel }
     * 
     */
    public Appel createAppel() {
        return new Appel();
    }

    /**
     * Create an instance of {@link GetAppelsByExpResponse }
     * 
     */
    public GetAppelsByExpResponse createGetAppelsByExpResponse() {
        return new GetAppelsByExpResponse();
    }

    /**
     * Create an instance of {@link AddAppel }
     * 
     */
    public AddAppel createAddAppel() {
        return new AddAppel();
    }

    /**
     * Create an instance of {@link AddAppelResponse }
     * 
     */
    public AddAppelResponse createAddAppelResponse() {
        return new AddAppelResponse();
    }

    /**
     * Create an instance of {@link GetAppelsByExp }
     * 
     */
    public GetAppelsByExp createGetAppelsByExp() {
        return new GetAppelsByExp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppelsByExpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicesoap/", name = "getAppelsByExpResponse")
    public JAXBElement<GetAppelsByExpResponse> createGetAppelsByExpResponse(GetAppelsByExpResponse value) {
        return new JAXBElement<GetAppelsByExpResponse>(_GetAppelsByExpResponse_QNAME, GetAppelsByExpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Appel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicesoap/", name = "appel")
    public JAXBElement<Appel> createAppel(Appel value) {
        return new JAXBElement<Appel>(_Appel_QNAME, Appel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAppel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicesoap/", name = "addAppel")
    public JAXBElement<AddAppel> createAddAppel(AddAppel value) {
        return new JAXBElement<AddAppel>(_AddAppel_QNAME, AddAppel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAppelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicesoap/", name = "addAppelResponse")
    public JAXBElement<AddAppelResponse> createAddAppelResponse(AddAppelResponse value) {
        return new JAXBElement<AddAppelResponse>(_AddAppelResponse_QNAME, AddAppelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppelsByExp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicesoap/", name = "getAppelsByExp")
    public JAXBElement<GetAppelsByExp> createGetAppelsByExp(GetAppelsByExp value) {
        return new JAXBElement<GetAppelsByExp>(_GetAppelsByExp_QNAME, GetAppelsByExp.class, null, value);
    }

}
