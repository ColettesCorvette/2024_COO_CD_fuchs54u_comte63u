package test;
import org.junit.Test;
import XML.ChargeurMagasin;
import donnees.Magasin;
// Remove the conflicting import statement
// import org.junit.jupiter.api.Test;
public class testChargerMagasin {
    // testChargerMagasin valide
    @Test
    public void testChargerMagasinMethod()  {
        try{
            String repertoire = "musicbrainzSimple/";
            ChargeurMagasin charge = new ChargeurMagasin(repertoire);
            Magasin resultat = charge.chargerMagasin();
            // On vérifie que le magasin a bien été chargé
            assert(resultat != null);
        }catch(Exception e){
            assert(false);
        }
    }
    public void lancerTests(){
        testChargerMagasinMethod();
    }
    @Test
    // testChargerMagasin invalide
    public void testChargerMagasinInvalide()  {
        try{
            String repertoire = "musicbrainzimple/";
            ChargeurMagasin charge = new ChargeurMagasin(repertoire);
            Magasin resultat = charge.chargerMagasin();
            // On vérifie que le magasin a bien été chargé
            assert(resultat != null);
        }catch(Exception e){
            assert(true);
        }
    }
}
