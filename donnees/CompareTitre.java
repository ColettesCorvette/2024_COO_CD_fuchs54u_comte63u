package donnees;

public class CompareTitre implements ComparateurCD{
    public boolean etreAvant(CD cd1, CD cd2){
        return cd1.getNomArtiste().compareTo(cd2.getNomArtiste()) < 0;
    }
}