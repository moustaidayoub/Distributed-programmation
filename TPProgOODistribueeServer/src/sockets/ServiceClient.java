package sockets;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;
import metier.Appel;
import metier.IOperateurMetier;
import metier.OperateurMetier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayoub MOUSTAID
 */
public class ServiceClient extends Thread {
    private Socket client;
    private List<Socket> clients;
    private IOperateurMetier operateurMetier;

    public ServiceClient(Socket client,List<Socket> clients,IOperateurMetier operateurMetier) {
        this.client = client;
        this.clients=clients;
        this.operateurMetier=operateurMetier;
    }

    @Override
    public void run() {
        try {
            InputStream is = client.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            OutputStream os=client.getOutputStream();
            PrintWriter pw=new PrintWriter(os,true);
            System.out.println("Connexion d'un client ");
            pw.println("vous etes connecté");
            while (true) {
                String req=br.readLine();
                Map<Integer,Appel> appels=operateurMetier.consulterAppelsExpediteur(req);
                if(appels.size()>0)
                {
                    for(Entry<Integer,Appel> e:appels.entrySet())
                    {
                        for(Socket cl:clients)
                        { 
                            if(cl.isConnected())
                        new PrintWriter(cl.getOutputStream(),true).println("Numero appel:"+e.getKey()+"-Expediteur:"+e.getValue().getExpediteur()+"-Destinataire:"+e.getValue().getDestinataire()+"-Duree:"+e.getValue().getDuree()+"-Date:"+e.getValue().getDate());
                               
                        }
                    }
                 }
                else
                {
                pw.println("pas d'appels pour cet expediteur ! ");
                }
             
            }
        } catch (IOException ex) {
            Logger.getLogger(ServiceClient.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    
}
