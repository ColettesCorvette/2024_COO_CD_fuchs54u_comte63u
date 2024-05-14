package test;

import XML.ChargeurMagasin;
import donnees.CD;
import donnees.Magasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class TestTriAlbum {

    @Test
    public void testTriAlbum() throws FileNotFoundException {

        String repertoire = "musicbrainzSimple/";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        Magasin resultat = charge.chargerMagasin();

        resultat.trierAlbum();

        assertEquals(resultat.getCd(0).getNomArtiste(),"Believe");
        assertEquals(resultat.getCd(1).getNomArtiste(), "Bénabar");
        assertEquals(resultat.getCd(2).getNomArtiste(), "Demon Days");

    }

}