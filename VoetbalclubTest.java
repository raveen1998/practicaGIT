package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    @Test
    public void geenNaam(){
        Voetbalclub feyenoord = new Voetbalclub();
        assertEquals("Fc", feyenoord.getnaam());
    }
@Test
    public void verwerkResultaatW(){
        Voetbalclub feyenoord = new Voetbalclub();
        feyenoord.verwerkResultaat('w');
        assertEquals(3, feyenoord.aantalPunten());


}
@Test
        public void verwerkResultaatG() {
    Voetbalclub feyenoord = new Voetbalclub();
    feyenoord.verwerkResultaat('g');
    assertEquals(1, feyenoord.aantalPunten());



}
@Test
    public void verwerkResultaatV() {
        Voetbalclub feyenoord = new Voetbalclub();
        feyenoord.verwerkResultaat('v');
        assertEquals(0, feyenoord.aantalPunten());
    }

    @Test
    public void verwerkResultaat() {
        Voetbalclub feyenoord = new Voetbalclub();
        feyenoord.verwerkResultaat('w');
        assertEquals("Fc 1 1 0 0 3",  feyenoord.toString());
    }
    @Test
    public void aantalPuntenT() {
        Voetbalclub feyenoord = new Voetbalclub();
        feyenoord.verwerkResultaat('w');
        feyenoord.verwerkResultaat('g');
        feyenoord.verwerkResultaat('v');
        assertEquals(4, feyenoord.aantalPunten());
    }
}
