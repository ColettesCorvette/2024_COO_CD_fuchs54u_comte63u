package donnees;

public class ComparateurNombre implements ComparateurCD
{
    @Override
    public boolean etreAvant(CD cd1, CD cd2)
    {
        return cd1.getNbPistes() > cd2.getNbPistes();
    }
}
