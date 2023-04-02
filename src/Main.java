import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SortingHat hat = new SortingHat(null);
        Wizard player = new Wizard(null, null, null, null, null, null, 1, false);
        Potion potionL = new Potion(2,"low Hp potion");
        Potion potionM = new Potion(2,"mid Hp potion");
        Potion potionH = new Potion(2,"high Hp potion");
        Enemy dementor = new Enemy("Dementor",6, 5, 0);
        Enemy troll = new Enemy( "Troll",100, 5, 0);
        Enemy basilisk = new Enemy( "Basilisk",200, 15, 0);
        Spell portoloin = new Spell("Accio",550);
        Spell WinLev = new Spell("Wingardium Leviosa", 0);
        Spell ExpectroPatronum = new Spell("Expectro Patronum", 0);
        Spell Sectumsempra = new Spell("Sectumsempra", 0);
        Boss PetigroVoldemort = new Boss("Peter Petigrow and Voldemort", 400,null,false, 75);
        Boss DeathEaters = new Boss("Death Eaters", 600, null, false, 80);
        Enemy Dolores = new Enemy("Dolores Umbridge", 500, 30, 0);
        ForbiddenSpell Imperium = new ForbiddenSpell("Imperium", 20);
        ForbiddenSpell Doloris = new ForbiddenSpell("Doloris", 40);
        ForbiddenSpell AvadaKedavra = new ForbiddenSpell("Avada Kedavra",99999999);
        PetigroVoldemort.setForbiddenSpell(new ArrayList<>());
        PetigroVoldemort.getForbiddenSpell().add(Imperium);
        DeathEaters.setForbiddenSpell(new ArrayList<>());
        DeathEaters.getForbiddenSpell().add(Imperium);
        DeathEaters.getForbiddenSpell().add(Doloris);
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
        player.getSpell().add(portoloin);
        player.getSpell().add(ExpectroPatronum);
        player.Level3(dementor, player);
        player.Level4(PetigroVoldemort, player);
        player.Level5(Dolores, player);
        player.getSpell().add(Sectumsempra);

    }
}

