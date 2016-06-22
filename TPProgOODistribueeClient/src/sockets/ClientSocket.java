package sockets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class ClientSocket {

    public static void main(String[] args) {
        try {
            Socket s=new Socket("localhost",5453);
            InputStream is=s.getInputStream();
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader br=new BufferedReader(isr);
            OutputStream os=s.getOutputStream();
            PrintWriter pw=new PrintWriter(os,true);
            Scanner clavier=new Scanner(System.in);
            String rep=br.readLine();
            System.out.println(rep);
            while (true) {
                System.out.println("Expediteur : ");
            String text=clavier.next();
            pw.println(text);   
            Iterator it=br.lines().iterator();
            //while(br.readLine()!=null)
            //System.out.println("reponse : "+br.readLine());
            
            while(it.hasNext()){
            //rep=br.readLine();
                System.out.println("icihaut");
               rep=it.next().toString();
            System.out.println("Reponse : "+rep);
                System.out.println("ici"+it.hasNext());
            }
             System.out.println("ici2");
            
            }
            
                        
        } catch (IOException ex) {
            Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
