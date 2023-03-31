import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortingHat hat = new SortingHat(null);
        Wizard player = new Wizard(null, null, null, null, null, null, 1);
        Potion potionL = new Potion(2,"low Hp potion");
        Potion potionM = new Potion(2,"mid Hp potion");
        Potion potionH = new Potion(2,"high Hp potion");
        Enemy dementor = new Enemy("Dementor",6, 5,3);
        Enemy troll = new Enemy( "Troll",100, 5, 1);
        Enemy basilisk = new Enemy( "Basilisk",200, 15, 1);
        Spell portoloin = new Spell("Accio",550);
        Spell WinLev = new Spell("Wingardium Leviosa", 0);
        Spell ExpectroPatronum = new Spell("Expectro Patronum", 0);
        player.setPotion(new ArrayList<>());
        player.setSpell(new ArrayList<>());
        player.getSpell().add(WinLev);
        player.getPotion().add(potionL);
        player.getPotion().add(potionM);
        player.getPotion().add(potionH);
        player.chooseWand();
        GameLogic.anythingToContinue();
        player.setHouse(hat.chooseHouse());
        GameLogic.anythingToContinue();
        player.choosePet();
        player.Level1(troll, player);
        player.getSpell().add(portoloin);
        player.Level2(basilisk, player);
        //player.getSpell().remove();
        player.getSpell().add(ExpectroPatronum);
        player.Level3(dementor, player);
    }
}

