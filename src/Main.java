import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortingHat hat = new SortingHat(null);
        Wizard player = new Wizard(null, null, null, null, null, null, 1);
        Potion potionR = new Potion(0,"low Hp potion");
        Potion potionA = new Potion(0,"mid Hp potion");
        Potion potionL = new Potion(0,"high Hp potion");
        Enemy troll = new Enemy( "Troll",250, 10, 1);
        player.getPotion().add(potionL);
        player.getPotion().add(potionR);
        player.getPotion().add(potionA);
        player.chooseWand();
        GameLogic.anythingToContinue();
        hat.chooseHouse();
        GameLogic.anythingToContinue();
        player.choosePet();
    }
}