package com.waleed.jets;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JetTest {

    @Test
    public void testJetCreation() {
        Jet jet = new Jet("F-22 Raptor", 2.25, 3000);
        assertEquals("F-22 Raptor", jet.getModel());
        assertEquals(2.25, jet.getSpeed());
        assertEquals(3000, jet.getRange());
    }

    @Test
    public void testIsSupersonic() {
        Jet raptor = new Jet("F-22 Raptor", 2.25, 3000);
        Jet cessna = new Jet("Cessna 172", 0.2, 1200);
        
        assertTrue(raptor.isSupersonic(), "F-22 should be supersonic");
        assertFalse(cessna.isSupersonic(), "Cessna should not be supersonic");
    }

    @Test
    public void testToString() {
        Jet jet = new Jet("F-35", 1.6, 2200);
        String expected = "Jet{model='F-35', speed=1.6, range=2200}";
        assertEquals(expected, jet.toString());
    }
}
