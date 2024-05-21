package donnees;

public class CompareTitre implements ComparateurCd{
    public int etreAvant(CD cd1, CD cd2){){
        return cd1.getNomArtiste().compareTo(cd2.getNomArtiste());
    }
}