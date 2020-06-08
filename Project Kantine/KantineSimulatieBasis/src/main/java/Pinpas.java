
public class Pinpas extends Betaalwijze {

    private double kredietlimiet;

    /**
     * Methode om kredietlimiet te zetten
    *
    * @param kredietlimiet
     */
    public void setKredietLimiet(double kredietlimiet) {
        this.kredietlimiet = kredietlimiet;
    }

    /**
     * Methode om betaling af te handelen
     */
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        // method body omitted
        if(saldo+kredietlimiet >= tebetalen){
            setSaldo(saldo - tebetalen);

        }
        else{
            throw new TeWeinigGeldException();
        }
    }
}