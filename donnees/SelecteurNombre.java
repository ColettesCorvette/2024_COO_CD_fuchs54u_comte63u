package donnees;

public class SelecteurNombre implements Selecteur
{

    private int nbPistes;

    public SelecteurNombre(int i)
    {
        this.nbPistes=i;
    }


    public boolean garderCD(CD cd)
    {
        return cd.getNbPistes()==nbPistes;
    }


}



