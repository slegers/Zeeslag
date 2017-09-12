package domain.model;

import domain.model.Schip.Compartiment;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class CompartimentTest {

    private Compartiment compartiment;
    @Before
    public void setUp(){
        compartiment = new Compartiment();
    }

    @Test
    public void een_nieuw_compartiment_is_nog_niet_geraakt(){
        assertFalse(compartiment.isGeraakt());
    }
    @Test
    public void bij_een_hit_is_een_compartiment_geraakt(){
        compartiment.hit();
        assertTrue(compartiment.isGeraakt());
    }
    @Test (expected = DomainException.class)
    public void een_compartiment_twee_keer_raken_geeft_een_exception(){
        compartiment.hit();
        compartiment.hit();
    }
}
