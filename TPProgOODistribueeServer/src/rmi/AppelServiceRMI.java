/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Map;
import java.util.Map.Entry;
import metier.Appel;
import metier.IOperateurMetier;
import metier.OperateurMetier;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class AppelServiceRMI extends UnicastRemoteObject implements IAppelRemote {
private  IOperateurMetier operateurMetier=new OperateurMetier();
    public AppelServiceRMI() throws RemoteException {
        super();
    }

    
    @Override
    public double consulterMoyenneDurees() throws RemoteException{
            double sumDurees=0;
        for(Entry<Integer,Appel> e:operateurMetier.consulterAppels().entrySet())
            sumDurees+=e.getValue().getDuree();
        return sumDurees/operateurMetier.consulterAppels().size();
    }

    @Override
    public Map<Integer, Appel> consulterAppelsExpediteur(String expediteur) throws RemoteException {
        return operateurMetier.consulterAppelsExpediteur(expediteur);
    }
    
}
