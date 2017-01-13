/**
 * Created by association on 13/01/17.
 */
public class AdaptateurCanard implements Dindon{
    Canard canard;

    public AdaptateurCanard(Canard canard) {
        this.canard = canard;
    }

    @Override
    public void glouglouter() {
        canard.cancaner();
    }

    @Override
    public void voler() {
        canard.voler();
    }
}
