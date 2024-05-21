package main;

import java.io.IOException;
import java.util.ArrayList;

import donnees.CD;
import donnees.Magasin;
import donnees.SelecteurArtiste;
import donnees.SelecteurNombre;
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
		ArrayList<CD> res = resultat.chercher(new SelecteurNombre(15));
		//System.out.println(res);
		res = resultat.chercher(new SelecteurArtiste("Bénabar"));
		System.out.println(res);
	}
}
