/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;
import metier.Appel;

/**
 *
 * @author Ayoub MOUSTAID
 */
public interface IAppelRemote extends Remote {
    double consulterMoyenneDurees() throws RemoteException;
    Map<Integer,Appel> consulterAppelsExpediteur(String expediteur) throws RemoteException;
}
