/**
 * Created by association on 13/01/17.
 */
public class AdaptateurDindon implements Canard {

    Dindon dindon;

    public AdaptateurDindon(Dindon dindon) {
        this.dindon = dindon;
    }

    @Override
    public void cancaner() {
        dindon.glouglouter();
    }

    @Override
    public void voler() {
        for (int i = 0; i < 5; i++) {
            dindon.voler();
        }
    }
}
