
package servicesoap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AppelWS", targetNamespace = "http://servicesoap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AppelWS {


    /**
     * 
     * @param appel
     */
    @WebMethod
    @RequestWrapper(localName = "addAppel", targetNamespace = "http://servicesoap/", className = "servicesoap.AddAppel")
    @ResponseWrapper(localName = "addAppelResponse", targetNamespace = "http://servicesoap/", className = "servicesoap.AddAppelResponse")
    @Action(input = "http://servicesoap/AppelWS/addAppelRequest", output = "http://servicesoap/AppelWS/addAppelResponse")
    public void addAppel(
        @WebParam(name = "appel", targetNamespace = "")
        Appel appel);

    /**
     * 
     * @param expediteur
     * @return
     *     returns java.util.List<servicesoap.Appel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAppelsByExp", targetNamespace = "http://servicesoap/", className = "servicesoap.GetAppelsByExp")
    @ResponseWrapper(localName = "getAppelsByExpResponse", targetNamespace = "http://servicesoap/", className = "servicesoap.GetAppelsByExpResponse")
    @Action(input = "http://servicesoap/AppelWS/getAppelsByExpRequest", output = "http://servicesoap/AppelWS/getAppelsByExpResponse")
    public List<Appel> getAppelsByExp(
        @WebParam(name = "expediteur", targetNamespace = "")
        String expediteur);

}