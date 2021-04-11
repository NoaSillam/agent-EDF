/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classMetier;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author noasillam
 */
public class Agents {
    
     private int idAgent;
    private String nomAgent;
    private ArrayList<Client> lesClients;
    
    
    public Agents(int unId, String unNom)
    {
        idAgent = unId;
        nomAgent = unNom;
        lesClients = new ArrayList<Client>();
    }

    public int getIdAgent() {
        return idAgent;
    }

    public void setIdAgent(int idAgent) {
        this.idAgent = idAgent;
    }

    public String getNomAgent() {
        return nomAgent;
    }

    public void setNomAgent(String nomAgent) {
        this.nomAgent = nomAgent;
    }

    public ArrayList<Client> getLesClients() {
        return lesClients;
    }

    public void setLesClients(ArrayList<Client> lesClients) {
        this.lesClients = lesClients;
    }
    public void AjouterClient(Client unClient)
    {
        lesClients.add(unClient);
    }

    // Si le client passé en paramètre n'est pas un client de l'agent
    // Le montant sera de 0
    // Sinon on calcule le montant de la dernière consommation
    public int CalculerLeMontantDeLaDerniereConsommationPourUnClient(Client unClient)
    {
        int montant = 0;
        if(unClient.getLesReleves().size() == 1)
        {
            montant = unClient.getLesReleves().get(0).getValeurReleve();
        }
       else
        {
             for(Client c : lesClients)
        {
            if(c.getIdClient() == unClient.getIdClient())
            {
              //  nb = c.getLesReleves().size();
                //montant = c.getLesReleves().get(nb-1).getValeurReleve() - c.getLesReleves().get(nb-2).getValeurReleve();
                 montant = c.getLesReleves().get(c.getLesReleves().size()-1).getValeurReleve() - c.getLesReleves().get(c.getLesReleves().size()-2).getValeurReleve();
           }
       }
       
   }
         return montant;
    
        
       

         
    
}
}

