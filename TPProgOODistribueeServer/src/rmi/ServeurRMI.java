/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class ServeurRMI {
    
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            AppelServiceRMI objetDistant=new AppelServiceRMI();
            Naming.rebind("rmi://localhost:1099/AppelService", objetDistant);
            System.out.println("ref : "+objetDistant);
        } catch (Exception ex) {
            Logger.getLogger(ServeurRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
