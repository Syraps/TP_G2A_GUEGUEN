import java.util.List;

public class Boss extends Character {
    private List<ForbiddenSpell> forbiddenSpell;
    private boolean action;
    private int accuracy;
    private Wand wand;

    public Boss(String name, int maxHp, List<ForbiddenSpell> forbiddenSpell, boolean action, int accuracy, Wand wand) {
        super(name, maxHp);
        this.forbiddenSpell = forbiddenSpell;
        this.action = action;
        this.accuracy = accuracy;
        this.wand = wand;
    }

    public boolean isAction() {
        return action;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    public List<ForbiddenSpell> getForbiddenSpell() {
        return forbiddenSpell;
    }

    public void setForbiddenSpell(List<ForbiddenSpell> forbiddenSpell) {
        this.forbiddenSpell = forbiddenSpell;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }
}
