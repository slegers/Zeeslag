package domain.model;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpelersTest {
    private Speler speler;

    @Before
    public void setUp(){
        speler = new Speler("bob");
    }

    @Test (expected = NullPointerException.class)
    public void speler_zijn_naam_mag_niet_null_zijn(){
        new Speler(null);
    }
    @Test (expected = DomainException.class)
    public void speler_zijn_naam_mag_niet_leeg_zijn(){
        new Speler("");
    }
    @Test (expected = DomainException.class)
    public void speler_zijn_naam_mag_niet_enkel_spaties_bevatten(){
        new Speler("      ");
    }
    @Test
    public void speler_zijn_naam_is_hetzelfde_na_creatie_object(){
        assertEquals("bob",speler.getNaam());
    }
}
