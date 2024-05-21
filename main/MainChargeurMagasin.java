package main;

import java.io.IOException;

import donnees.ComparateurNombre;
import donnees.CompareTitre;
import donnees.Magasin;
import XML.ChargeurMagasin;

/**
 * permet de charger un magasin de test
 */
public class MainChargeurMagasin {

	/**
	 * methode principale
	 * 
	 * @param args
	 *            inutilise
	 * @throws IOException
	 *             en cas de probleme de lecture entree/sortie
	 */
	public static void main(String args[]) throws IOException {
		String repertoire = "musicbrainzSimple/";
		ChargeurMagasin charge = new ChargeurMagasin(repertoire);
		Magasin resultat = charge.chargerMagasin();
		resultat.trier(new CompareTitre());
		System.out.println(resultat);


		resultat.trier(new ComparateurNombre());
		System.out.println(resultat);



	}
}
