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
public class AgentsTest {
    
    public AgentsTest() {
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
     * Test of getIdAgent method, of class Agents.
     */
    @Test
    public void testGetIdAgent() {
        System.out.println("getIdAgent");
        Agents instance = null;
        int expResult = 0;
        int result = instance.getIdAgent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdAgent method, of class Agents.
     */
    @Test
    public void testSetIdAgent() {
        System.out.println("setIdAgent");
        int idAgent = 0;
        Agents instance = null;
        instance.setIdAgent(idAgent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomAgent method, of class Agents.
     */
    @Test
    public void testGetNomAgent() {
        System.out.println("getNomAgent");
        Agents instance = null;
        String expResult = "";
        String result = instance.getNomAgent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomAgent method, of class Agents.
     */
    @Test
    public void testSetNomAgent() {
        System.out.println("setNomAgent");
        String nomAgent = "";
        Agents instance = null;
        instance.setNomAgent(nomAgent);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLesClients method, of class Agents.
     */
    @Test
    public void testGetLesClients() {
        System.out.println("getLesClients");
        Agents instance = null;
        ArrayList<Client> expResult = null;
        ArrayList<Client> result = instance.getLesClients();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLesClients method, of class Agents.
     */
    @Test
    public void testSetLesClients() {
        System.out.println("setLesClients");
        ArrayList<Client> lesClients = null;
        Agents instance = null;
        instance.setLesClients(lesClients);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AjouterClient method, of class Agents.
     */
    @Test
    public void testAjouterClient() {
        System.out.println("AjouterClient");
        Client unClient = null;
        Agents instance = null;
        instance.AjouterClient(unClient);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CalculerLeMontantDeLaDerniereConsommationPourUnClient method, of class Agents.
     */
    @Test
    public void testCalculerLeMontantDeLaDerniereConsommationPourUnClient() {
         Date d = new Date(2021, 03, 22);
    Date d1 = new Date(2021, 03, 27);
    Releve r1 = new Releve(d, 120);
    Releve r2 = new Releve(d1, 150);
    Client c= new Client(1, "Alain");
    c.AjouterReleve(r1);c.AjouterReleve(r2);
    Agents agt = new Agents(1, "Aline");
    agt.AjouterClient(c);
    
    int attendu = 30;
    
    int reel = agt.CalculerLeMontantDeLaDerniereConsommationPourUnClient(c);
    assertEquals(attendu, reel);
    
    Client c2 = new Client(2, "Dede");
    attendu =0;
    reel = agt.CalculerLeMontantDeLaDerniereConsommationPourUnClient(c2);
    assertEquals(attendu, reel);
    
   // c2.AjouterReleve(r1);c2.AjouterReleve(r2);
   // Agents agt1 = new Agents(2, "Marie");
   // agt1.AjouterClient(c2);
    
    //int attendu1 = 30;
    
   // int reel1 = agt1.CalculerLeMontantDeLaDerniereConsommationPourUnClient(c2);
    //assertEquals(attendu1, reel1);
    }
    
}
