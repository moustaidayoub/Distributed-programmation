/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ayoub MOUSTAID
 */
@XmlRootElement
public class Appel implements Serializable {

    private int numero;
    private Date date;
    private double duree;
    private String expediteur;
    private String destinataire;

    public Appel() {
    }

    public Appel(int numero, Date date, double duree, String expediteur, String destinataire) {
        this.numero = numero;
        this.date = date;
        this.duree = duree;
        this.expediteur = expediteur;
        this.destinataire = destinataire;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getDuree() {
        return duree;
    }

    public void setDuree(double duree) {
        this.duree = duree;
    }

    public String getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }

}
