package test;

import XML.ChargeurMagasin;
import donnees.CompareCD;
import donnees.CompareTitre;
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

        resultat.trier(new CompareCD());

        assertEquals(resultat.getCd(0).getNomCD(),"Believe");
        assertEquals(resultat.getCd(1).getNomCD(), "Bénabar");
        assertEquals(resultat.getCd(2).getNomCD(), "Demon Days");

    }
    @Test
    public void testTriArtiste() throws FileNotFoundException {

        String repertoire = "musicbrainzSimple/";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        Magasin resultat = charge.chargerMagasin();

        resultat.trier(new CompareTitre());
        assertEquals(resultat.getCd(0).getNomArtiste(),"Bénabar");
        assertEquals(resultat.getCd(1).getNomArtiste(), "Bénabar");
        assertEquals(resultat.getCd(2).getNomArtiste(), "Céline Dion");
    }
}