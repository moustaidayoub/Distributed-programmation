/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicesoap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import metier.Appel;
import metier.IOperateurMetier;
import metier.OperateurMetier;

/**
 *
 * @author Ayoub MOUSTAID
 */
@WebService(name="AppelWS")
public class AppelServiceSoap {
    private IOperateurMetier operateurMetier=new OperateurMetier();
    
    @WebMethod(operationName = "addAppel")
    public void ajouterAppel(@WebParam(name="appel")Appel appel/*@WebParam(name="numero")int numero,@WebParam(name="duree")double duree,@WebParam(name="expediteur")String expediteur,@WebParam(name="destinataire")String destinataire*/)
    {
        //Appel appel=new Appel(numero,new Date(),duree,expediteur,destinataire);
    operateurMetier.ajouterAppel(appel);
    }
    
    @WebMethod(operationName="getAppelsByExp")
     public List<Appel> consulterAppelsExpediteur(@WebParam(name="expediteur")String expediteur)
     {
         List<Appel> appels=new ArrayList();
         for(Entry<Integer,Appel> e:operateurMetier.consulterAppelsExpediteur(expediteur).entrySet())
             appels.add(e.getValue());
        return appels;
     }
}
