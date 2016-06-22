/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Ayoub MOUSTAID
 */
public class OperateurMetier implements IOperateurMetier {
    private Map<Integer,Appel> appels=new HashMap();

    public OperateurMetier() {
        this.ajouterAppel(new Appel(1,new Date(),10,"Ayoub","Said"));
        this.ajouterAppel(new Appel(2,new Date(),25,"Ayoub","Ahmed"));
        this.ajouterAppel(new Appel(3,new Date(),20.5,"Soufiane","Karim"));
         this.ajouterAppel(new Appel(4,new Date(),28,"Soufiane","Taha"));
    }
    
    
    @Override
    public void ajouterAppel(Appel appel) {
        appels.put(appel.getNumero(), appel);  
    }

    @Override
    public Map<Integer,Appel> consulterAppels() {
        return appels;
    }

    @Override
    public Map<Integer,Appel> consulterAppelsExpediteur(String expediteur) {
            Map<Integer,Appel> appelsOfExp=new HashMap();
            System.out.println("exp : "+expediteur);
            System.out.println("size : "+appels.size());
            for(Entry<Integer,Appel> e:appels.entrySet())
            { 
                System.out.println("num :"+e.getValue().getNumero()+",date:"+e.getValue().getDate()+",duree :"+e.getValue().getDuree()+",destinataire :"+e.getValue().getDestinataire()+",expediteur:"+e.getValue().getExpediteur()+"key : "+e.getKey());
            if(e.getValue().getExpediteur().equals(expediteur))
                appelsOfExp.put(e.getKey(), e.getValue());
            }
            return appelsOfExp;
    }
    
}
