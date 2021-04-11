/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classMetier;

import java.util.ArrayList;

/**
 *
 * @author noasillam
 */
public class Client {
        private int idClient;
    private String nomClient;
    private ArrayList<Releve> lesReleves;
    
    public Client(int unId, String unNom)
    {
        idClient = unId;
        nomClient = unNom;
        lesReleves = new ArrayList<Releve>();
    }
    public int getIdClient() {
        return idClient;
    }
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    public String getNomClient() {
        return nomClient;
    }
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }
    public ArrayList<Releve> getLesReleves() {
        return lesReleves;
    }
    public void setLesReleves(ArrayList<Releve> lesReleves) {
        this.lesReleves = lesReleves;
    }
    public void AjouterReleve(Releve unReleve)
    {
        lesReleves.add(unReleve);
    }
    // Si le client n'a qu'un seul relevé : le montant est la valeur du relevé
    // Sinon le montant est la différence entre la valeur du dernier relevé
    // et la valeur de l'avant dernier relevé
    public int CalculerLeMontantDeLaDerniereConsommation()
    {
      //  double releveAncien = 0;
        //double releveNouveau = 0;
      //double montantReleve = releveAncien - releveNouveau;
      //if(releveAncien)
      
     // return montantReleve;
        int montant =0;
        if(lesReleves.size()==0)
        {
            montant = 0;
        }
        else if(lesReleves.size()==1)
        {
            montant = lesReleves.get(0).getValeurReleve();
        }
        else
        {
           montant = lesReleves.get(lesReleves.size()-1).getValeurReleve()-lesReleves.get(lesReleves.size()-2).getValeurReleve(); 
        }
        
        
        return montant;
        
        
    }
    // Le montant max est calculé en fonction des relevés
    // On compare la différence entre le relevé n+1 et n avec le relevé suivant
    // à savoir n+2 et n+1 
    public int CalculerLeMontantMaximumConsomme()
    {
        int montant = 0;
        int max = 0;
        if(lesReleves.size() == 0)
        {
            max = 0;
        }
        else if(lesReleves.size() == 1)
        {
            max = lesReleves.get(0).getValeurReleve();
        }
        else
        {
            for(int i = 0; i <lesReleves.size()-1; i++)
            {
                montant = lesReleves.get(i+1).getValeurReleve() - lesReleves.get(i).getValeurReleve();
            
            if(montant > max)
            {
                max = montant;
            }
            }
        }
        return max;
    }
    
}
