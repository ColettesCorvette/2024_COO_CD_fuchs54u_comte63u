package donnees;


public class SelecteurArtiste implements Selecteur
{
    private String nomArtiste;

    public SelecteurArtiste(String n)
    {
        this.nomArtiste=n;
    }

    @Override
    public boolean garderCD(CD cd)
    {
        return cd.getNomArtiste().equals(nomArtiste);
    }
}
