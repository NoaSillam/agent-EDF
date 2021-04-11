/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classMetier;

import java.util.ArrayList;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author noasillam
 */
public class ClientTest {
    
    public ClientTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdClient method, of class Client.
     */
    @Test
    public void testGetIdClient() {
        System.out.println("getIdClient");
        Client instance = null;
        int expResult = 0;
        int result = instance.getIdClient();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setIdClient method, of class Client.
     */
    @Test
    public void testSetIdClient() {
        System.out.println("setIdClient");
        int idClient = 0;
        Client instance = null;
        instance.setIdClient(idClient);
        
    }

    /**
     * Test of getNomClient method, of class Client.
     */
    @Test
    public void testGetNomClient() {
        System.out.println("getNomClient");
        Client instance = null;
        String expResult = "";
        String result = instance.getNomClient();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setNomClient method, of class Client.
     */
    @Test
    public void testSetNomClient() {
        System.out.println("setNomClient");
        String nomClient = "";
        Client instance = null;
        instance.setNomClient(nomClient);
       
    }

    /**
     * Test of getLesReleves method, of class Client.
     */
    @Test
    public void testGetLesReleves() {
        System.out.println("getLesReleves");
        Client instance = null;
        ArrayList<Releve> expResult = null;
        ArrayList<Releve> result = instance.getLesReleves();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setLesReleves method, of class Client.
     */
    @Test
    public void testSetLesReleves() {
        System.out.println("setLesReleves");
        ArrayList<Releve> lesReleves = null;
        Client instance = null;
        instance.setLesReleves(lesReleves);
      
    }

    /**
     * Test of AjouterReleve method, of class Client.
     */
    @Test
    public void testAjouterReleve() {
        System.out.println("AjouterReleve");
        Releve unReleve = null;
        Client instance = null;
        instance.AjouterReleve(unReleve);
       
    }

    /**
     * Test of CalculerLeMontantDeLaDerniereConsommation method, of class Client.
     */
    @Test
    public void testCalculerLeMontantDeLaDerniereConsommation() {
         Date d = new Date(2021, 03, 22);
            Date d1 = new Date(2021, 03, 27);
     Releve r1 = new Releve(d, 120);
    Releve r2 = new Releve(d1, 150);
    Client c= new Client(1, "Alain");
    c.AjouterReleve(r1);c.AjouterReleve(r2);
    int attendu = 30;
    //1 er test avec 2 ou plusieur relevé 
    int reel = c.CalculerLeMontantDeLaDerniereConsommation();
    assertEquals(attendu, reel);
    //2 eme test avec 1 seul releve
    Client c1= new Client(2, "Polo");
    c1.AjouterReleve(r1);
    attendu = 120;
    reel= c1.CalculerLeMontantDeLaDerniereConsommation();
    assertEquals(attendu, reel);
    
    Client c2 =  new Client(3, "aaa");
    attendu = 0;
    reel= c2.CalculerLeMontantDeLaDerniereConsommation();
    assertEquals(attendu, reel);
    }

    /**
     * Test of CalculerLeMontantMaximumConsomme method, of class Client.
     */
    @Test
    public void testCalculerLeMontantMaximumConsomme() {
        Date d = new Date(2021, 03, 22);
            Date d1 = new Date(2021, 03, 27);
            
        Client c= new Client(1, "Alain");
        int attendu = 0;
        int reel = c.CalculerLeMontantMaximumConsomme();
        assertEquals(attendu, reel);
        
       // 1 seul releve
        Releve r1 = new Releve(d, 120);
         c.AjouterReleve(r1);
        attendu = 120;
         reel = c.CalculerLeMontantMaximumConsomme();
         assertEquals(attendu, reel);
         
         //plusieur releve
         Client c2 = new Client(2, "azerty");
         Releve r2 = new Releve(d1, 50);
         Releve r3 = new Releve(d1, 200);
         Releve r4 = new Releve(d1, 210);
         Releve r5 = new Releve(d1, 220);
         Releve r6 = new Releve(d1, 230);
         Releve r7 = new Releve(d1, 240);
         Releve r8 = new Releve(d1, 250);
         c.AjouterReleve(r2);c.AjouterReleve(r3);c.AjouterReleve(r4);
         c.AjouterReleve(r5);c.AjouterReleve(r6);c.AjouterReleve(r7);
         c.AjouterReleve(r8);
         attendu = 150;
         reel = c.CalculerLeMontantMaximumConsomme();
         assertEquals(attendu, reel);
    }
    
}
