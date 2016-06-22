/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Ayoub MOUSTAID
 */
public interface IOperateurMetier {
    void ajouterAppel(Appel appel);
    Map<Integer,Appel> consulterAppels();
    Map<Integer,Appel> consulterAppelsExpediteur(String expediteur);
}
