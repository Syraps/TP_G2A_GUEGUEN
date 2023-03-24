import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortingHat hat = new SortingHat(null);
        Wizard player = new Wizard(null, null, null, null, null, null);

        player.chooseWand();
        GameLogic.anythingToContinue();
        hat.chooseHouse();
        GameLogic.anythingToContinue();
        player.choosePet();
    }
}