import org.junit.jupiter.api.Test;
import practicum.week_twee.Voetbalclub;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubbTest {

    @Test
    public void legeNaam(){
        Voetbalclub v1=new Voetbalclub();
        assertEquals("Fc",v1.getNaam());
    }

    @Test
    public void resultaatW(){
        Voetbalclub feij=new Voetbalclub();

        feij.verwerkResultaat('w');


        assertEquals(3,feij.aantalPunten());

    }
    @Test
    public void resultaatG(){
        Voetbalclub feij=new Voetbalclub();

        feij.verwerkResultaat('g');


        assertEquals(1,feij.aantalPunten());

    }
    @Test
    public void resultaatV(){
        Voetbalclub feij=new Voetbalclub();

        feij.verwerkResultaat('v');


        assertEquals(0,feij.aantalPunten());

    }

    @Test
    public void toStringTest(){
        Voetbalclub feij=new Voetbalclub("feij");

        feij.verwerkResultaat('w');
        feij.verwerkResultaat('v');
        feij.verwerkResultaat('w');
        feij.verwerkResultaat('g');



        assertEquals("feij 4 2 1 1 7",feij.toString());



    }


}