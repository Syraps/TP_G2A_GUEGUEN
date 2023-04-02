import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Création des objets pour les ennemis, le joueur et les sorts interdits
        Wizard player = new Wizard(null, null, null, null, null, null, 1, false, 0);
        Enemy dementor = new Enemy("Dementor",6, 5, 0);
        Enemy troll = new Enemy( "Troll",100, 10, 0);
        Enemy basilisk = new Enemy( "Basilisk",200, 40, 0);
        Enemy Nada = new Enemy("Nada", 10, 0, 0);
        Boss Nothing = new Boss("Nothing", 10, null, false,0);
        Boss PetigroVoldemort = new Boss("Peter Petigrow and Voldemort", 400,null,false, 75);
        Boss DeathEaters = new Boss("Death Eaters", 600, null, false, 80);
        Boss FinalBoss = new Boss("Bellatrix Lestrange and Voldemort", 1000, null, false, 90);
        Enemy Dolores = new Enemy("Dolores Umbridge", 500, 30, 0);
        ForbiddenSpell Imperium = new ForbiddenSpell("Imperium", 20);
        ForbiddenSpell Doloris = new ForbiddenSpell("Doloris", 40);
        ForbiddenSpell AvadaKedavra = new ForbiddenSpell("Avada Kedavra",99999999);
        PetigroVoldemort.setForbiddenSpell(new ArrayList<>());
        PetigroVoldemort.getForbiddenSpell().add(Imperium);
        DeathEaters.setForbiddenSpell(new ArrayList<>());
        DeathEaters.getForbiddenSpell().add(Imperium);
        DeathEaters.getForbiddenSpell().add(Doloris);
        FinalBoss.setForbiddenSpell(new ArrayList<>());
        FinalBoss.getForbiddenSpell().add(Imperium);
        FinalBoss.getForbiddenSpell().add(Doloris);
        FinalBoss.getForbiddenSpell().add(AvadaKedavra);
        //Lancement de l'introduction et de chaque niveau
        player.Introduction(player);
        player.Level1(troll, Nothing, player);
        player.Level2(basilisk, Nothing, player);
        player.Level3(dementor, Nothing, player);
        player.Level4(PetigroVoldemort, Nada, player);
        player.Level5(Dolores, Nothing, player);
        player.Level6(DeathEaters, Nada, player);
        player.Level7(FinalBoss, Nada, player);

    }
}

