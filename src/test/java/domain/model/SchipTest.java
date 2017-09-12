package domain.model;

import domain.model.Schip.Schip;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SchipTest {
    private Schip vliegdek, onderzeeër, slagschip,torpedobootjager,patrouilleschip;

    @Before
    public void setUp(){
        vliegdek = Schip.Vliegdekschip;
        onderzeeër = Schip.Onderzeeër;
        slagschip = Schip.Slagschip;
        torpedobootjager = Schip.Torpedobootjager;
        patrouilleschip = Schip.Patrouilleschip;
    }

    @Test
    public void vliegdekschip_heeft_groote_5(){
        assertEquals(vliegdek.getGroote(),5);
    }
    @Test
    public void onderzeeër_heeft_groote_4(){
        assertEquals(onderzeeër.getGroote(),3);
    }
    @Test
    public void slagschip_heeft_groote_3(){
        assertEquals(slagschip.getGroote(),4);
    }
    @Test
    public void torpedobootjager_heeft_groote_3(){
        assertEquals(torpedobootjager.getGroote(),3);
    }
    @Test
    public void patrouilleschip_heeft_groote_2(){
        assertEquals(patrouilleschip.getGroote(),2);
    }
    @Test (expected = DomainException.class)
    public void een_compartiment_neerschieten_buiten_de_range_geet_een_error(){
        vliegdek.hit(5);
    }
    @Test
    public void een_nieuw_schip_is_niet_gezonken(){
        assertFalse(vliegdek.isGezonken());
    }
    @Test
    public void een_scip_met_alle_compartimenten_gezonken_is_gezonken(){
        patrouilleschip.hit(0);
        patrouilleschip.hit(1);
        assertTrue(patrouilleschip.isGezonken());
    }
    @Test
    public void een_schip_met_een_aantal_compartimenten_gezonken_is_niet_gezonken(){
        vliegdek.hit(0);
        vliegdek.hit(3);
        vliegdek.hit(4);
        assertFalse(vliegdek.isGezonken());
    }


}
