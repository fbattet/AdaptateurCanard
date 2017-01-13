/**
 * Created by association on 13/01/17.
 */
public class TestCanard {
    public static void main(String[] args) {
        Colvert canard = new Colvert();

        DindonSauvage dindon = new DindonSauvage();
        Canard adapteurDindon = new AdaptateurDindon(dindon);

        System.out.println("Dindon dit ...");
        dindon.glouglouter();
        dindon.voler();

        System.out.println("\nCanard dit ...");
        testerCanard(canard);

        System.out.println("\nAdaptateurDindon dit ...");
        testerCanard(adapteurDindon);
    }

    static void testerCanard(Canard canard) {
        canard.cancaner();
        canard.voler();
    }
}
