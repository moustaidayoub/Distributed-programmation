/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicesoap;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class ClientWS {
    public static void main(String[] args) {
        AppelWS stub=new AppelServiceSoapService().getAppelWSPort();
        //test method d'ajout d'appel
        Appel ap=new Appel();
        ap.setNumero(20);
        ap.setDate(new Date());
        ap.setDuree(40);
        ap.setExpediteur("Moustaid");
        ap.setDestinataire("Ayoub");
        stub.addAppel(ap);
        //stub.addAppel(20,40,"Moustaid","Ayoub");
        //test method de consultation d'appels 
        List<Appel> appels=stub.getAppelsByExp("Moustaid");
        System.out.println("Les appels de Moustaid");
        for(Appel a:appels)
        {
        System.out.println("Numero appel:"+a.numero+"-Expediteur:"+a.expediteur+"-Destinataire:"+a.getDestinataire()+"-Duree:"+a.getDuree()+"-Date:"+a.getDate());
        }
    }
}
