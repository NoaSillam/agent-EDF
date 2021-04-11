/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classMetier;

import java.util.Date;

/**
 *
 * @author noasillam
 */
public class Releve {
    
     private Date dateReleve;
    private int valeurReleve;
    
    public Releve() { }
    public Releve(Date uneDate, int uneValeur)
    {
        dateReleve = uneDate;
        valeurReleve = uneValeur;
    }
    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public int getValeurReleve() {
        return valeurReleve;
    }

    public void setValeurReleve(int valeurReleve) {
        this.valeurReleve = valeurReleve;
    }
    
}
