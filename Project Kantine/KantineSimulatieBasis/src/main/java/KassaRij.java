
import java.util.LinkedList;

public class KassaRij {

    private LinkedList<Dienblad> kassaRij;

    /**
     * Constructor
     */
    public KassaRij() {
        // method body omitted
        kassaRij = new LinkedList<>();
    }

    /**
     * Persoon sluit achter in de rij aan
     *
     * @param klant
     */
    public void sluitAchteraan(Dienblad klant) {
        // method body omitted
        kassaRij.add(klant);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit de rij verwijderen en retourneren. Als er
     * niemand in de rij staat geeft deze null terug.
     *
     * @return Eerste klant in de rij of null
     */
    public Dienblad eerstePersoonInRij() {
        // method body omitted
        if(erIsEenRij()) {
            Dienblad eerstePersoon = kassaRij.get(0);
            kassaRij.remove(0);
            return eerstePersoon;

        }
        else{
            return null;
        }
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() {
        // method body omitted
        if(kassaRij.size() >= 1){
            return true;
        }
        else{
            return false;
        }
    }
}