/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Naming;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Appel;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class ClientRMI {
    public static void main(String[] args) {
        try {
            IAppelRemote stub=(IAppelRemote)Naming.lookup("rmi://localhost:1099/AppelService");
            System.out.println("Total durees : "+stub.consulterMoyenneDurees());
            System.out.println("Appels de - Ayoub ");
            for(Entry<Integer,Appel> e:stub.consulterAppelsExpediteur("Ayoub").entrySet())
                System.out.println("Numero appel:"+e.getKey()+"-Expediteur:"+e.getValue().getExpediteur()+"-Destinataire:"+e.getValue().getDestinataire()+"-Duree:"+e.getValue().getDuree()+"-Date:"+e.getValue().getDate());
                    

        } catch (Exception ex) {
            Logger.getLogger(ClientRMI.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
