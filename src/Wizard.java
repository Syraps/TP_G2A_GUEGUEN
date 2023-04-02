import java.util.ArrayList;
import java.util.List;

public class Wizard extends Character {
    Potion potionL = new Potion(2,"low Hp potion");
    Potion potionM = new Potion(2,"mid Hp potion");
    Potion potionH = new Potion(2,"high Hp potion");
    Spell WinLev = new Spell("Wingardium Leviosa", 0);
    SortingHat hat = new SortingHat(null);
    Wand Pwand = new Wand(null, 0);
    Spell sword = new Spell("Sword", 0);
    Spell portoloin = new Spell("Accio",550);
    Spell ExpectroPatronum = new Spell("Expectro Patronum", 0);
    Spell Sectumsempra = new Spell("Sectumsempra", 0);
    Spell Expelliarmus = new Spell("Expelliarmus", 0);
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownspells;
    private List<Potion> potions;
    private float coefDamage;
    private boolean defense;
    private int stun;

    public Pet getPet() {
        return pet;
    }

    public Wand getWand() {
        return wand;
    }

    public House getHouse() {
        return house;
    }

    public List<Spell> getSpell() {
        return knownspells;
    }

    public List<Potion> getPotion() {
        return potions;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void setSpell(List<Spell> knownspells) {
        this.knownspells = knownspells;
    }

    public void setPotion(List<Potion> potions) {
        this.potions = potions;
    }

    public Wizard(Pet pet, Wand wand, House house, List<Spell> knownspells, List<Potion> potions, String name, float coefDamage, boolean defense, int stun) {
        //constructeur du wizard
        super(name, 100);
        this.pet = pet;
        this.wand = wand;
        this.house = house;
        this.knownspells = knownspells;
        this.potions = potions;
        this.coefDamage = coefDamage;
        this.defense = defense;
        this.stun = stun;
    }
    public void Introduction(Wizard wizard){
        GameLogic.printHeading("Harry Potter at Home");
        GameLogic.anythingToContinue();
        System.out.println("There is 7 levels, you have 2 potions of every type and your starting gear is random");
        System.out.println("What is your name Wizard ?");
        //on obtient le nom du joueur
        GameLogic.readString(wizard);
        wizard.setPotion(new ArrayList<>());
        wizard.setSpell(new ArrayList<>());
        wizard.getSpell().add(WinLev);
        wizard.getPotion().add(potionL);
        wizard.getPotion().add(potionM);
        wizard.getPotion().add(potionH);
        System.out.println("You go to buy some furniture before going to your school");
        GameLogic.anythingToContinue();
        GameLogic.printHeading("Olivander's shop:");
        System.out.println("Oh, a wand has chosen you !");
        //appel de la fonction pour obtenir la taille et le coeur de la baguette
        wizard.setWand(Pwand.chooseWand());
        GameLogic.anythingToContinue();
        System.out.println("Humm... This pet seems to be fit for your taste.");
        GameLogic.anythingToContinue();
        //appel de la fonction qui donne l'animal du joueur
        wizard.choosePet(wizard);
        GameLogic.anythingToContinue();
        System.out.println("It is now time for the sorting hat to put you in one of our prestigious house !");
        //appel de la fonction qui te mets dans une maison
        wizard.setHouse(hat.chooseHouse());
        GameLogic.anythingToContinue();

    }
    public Pet choosePet(Wizard wizard) {
        System.out.print("Here is your pet...");
        //valeur random entre 1 et 5
        double var = Math.random() * (6 - 1);
        Pet choosePet = null;
        if (var <= 1) {
            //on assigne le chat a choose pet
            choosePet = Pet.CAT;
            wizard.setPet(choosePet);
            System.out.print("\nYour pet is a  " + choosePet);
        } else if (var <= 2) {
            //on assigne le hibou a choose pet
            choosePet = Pet.OWL;
            wizard.setPet(choosePet);
            System.out.print("\nYour pet is a  " + choosePet);
        } else if (var <= 3) {
            //on assigne le rat a choose pet
            choosePet = Pet.RAT;
            wizard.setPet(choosePet);
            System.out.print("\nYour pet is a  " + choosePet);
        } else if (var <= 4) {
            //on assigne le lapin a choose pet
            choosePet = Pet.RABBIT;
            wizard.setPet(choosePet);
            System.out.print("\nYour pet is a  " + choosePet);
        } else if (var <= 5) {
            //on assigne le crapeau a choose pet
            choosePet = Pet.TOAD;
            wizard.setPet(choosePet);
            System.out.print("\nYour pet is a  " + choosePet);
        }
        return choosePet;
    }

    public void getBetter(Wizard wizard) {
        int choice = GameLogic.readInt(" ", 2);
        if (choice == 1) {
            wizard.setMaxHp((int) (wizard.getMaxHp() * 1.2));
            wizard.setHp((wizard.getMaxHp()));
            System.out.print("your Hp are now " + wizard.getHp() + "/" + wizard.getMaxHp());
            GameLogic.anythingToContinue();
        } else if (choice == 2) {
            wizard.setCoefDamage(wizard.getCoefDamage() + 0.5f);
            System.out.print("Your damage is now " + wizard.getCoefDamage() + " times better");
            GameLogic.anythingToContinue();
        }
    }

    public void usePotion(Wizard wizard) {
        int choice = GameLogic.readInt(" ", wizard.getPotion().size());
        if (wizard.getPotion().get(choice - 1).getnbPotion() != 0) {
            if (wizard.getPotion().get(choice - 1).getName().equals("low Hp potion")) {
                System.out.print("You used a low Hp potion");
                wizard.setHp((int) (wizard.getHp() + 20 * house.getPotionF()));
                wizard.getPotion().get(choice - 1).setNbPotion(wizard.getPotion().get(choice - 1).getNbPotion() - 1);
                GameLogic.anythingToContinue();
            } else if (wizard.getPotion().get(choice - 1).getName().equals("mid Hp potion")) {
                System.out.print("You used a mid Hp potion");
                wizard.setHp((int) (wizard.getHp() + 40 * house.getPotionF()));
                wizard.getPotion().get(choice - 1).setNbPotion(wizard.getPotion().get(choice - 1).getNbPotion() - 1);
                GameLogic.anythingToContinue();
            } else if (wizard.getPotion().get(choice - 1).getName().equals("high Hp potion")) {
                System.out.print("You used a high Hp potion");
                this.setHp((int) (wizard.getHp() + 60 * house.getPotionF()));
                wizard.getPotion().get(choice - 1).setNbPotion(wizard.getPotion().get(choice - 1).getNbPotion() - 1);
                GameLogic.anythingToContinue();
            }
        } else {
            System.out.println("You don't have this potion !");
            GameLogic.anythingToContinue();
        }

        if (wizard.getHp() > wizard.getMaxHp()) {
            wizard.setHp(wizard.getMaxHp());
        }
    }

    public void defend(Wizard wizard) {
        System.out.print("PROTEGO !");
        wizard.setDefense(true);
        GameLogic.anythingToContinue();
    }


    public void Level1(Enemy enemy, Boss boss, Wizard wizard) {

        GameLogic.clearConsole();
        GameLogic.printHeading("You encountered the Troll ! You will have to use Wingardium Leviosa to fight it.");
        GameLogic.anythingToContinue();
        battle(enemy, boss, wizard);
        wizard.getSpell().add(portoloin);
    }

    public void Level2(Enemy enemy, Boss boss, Wizard wizard) {

        GameLogic.clearConsole();
        System.out.println("During your second year at school, you learned the spell Accio.\n" +
                " But a monster is roarming inside the chamber of secrets... ");
        GameLogic.anythingToContinue();
        GameLogic.printHeading(" OH NO !\n You encountered the Basilisk in the Chamber of secrets !");
        GameLogic.anythingToContinue();
        if (wizard.getHouse().getName().equals("Gryffindor")) {
            System.out.print("you have the sword of Godric Gryffindor to slay the Basilisk !");
            wizard.getSpell().add(sword);
            for (int i = 0; i < wizard.getSpell().size(); i++) {
                if (wizard.getSpell().get(i).getName().equals("Accio")) {
                    wizard.getSpell().get(i).setCounter(wizard.getSpell().get(i).getCounter() - 50);
                }
            }
        } else {
            System.out.print("you have to rip off one of the fangs of the Basilisk to slay it !");
        }
        GameLogic.anythingToContinue();
        battle(enemy, boss, wizard);
        wizard.getSpell().remove(sword);
        wizard.getSpell().add(portoloin);
        wizard.getSpell().add(ExpectroPatronum);

    }

    public void Level3(Enemy enemy, Boss boss, Wizard wizard) {
        GameLogic.clearConsole();
        System.out.println("You go to your 3rd year of magic school where you learn a new spell: Expectro Patronum");
        GameLogic.anythingToContinue();
        System.out.println("\n When Wandering into the Forbbidden Forest's lake, you are surrounded by 6 Dementor !");
        System.out.println("\n Use the spell that you learned this year !\n it will make them flee");
        GameLogic.anythingToContinue();
        battle(enemy, boss, wizard);

    }

    public void Level4(Boss boss, Enemy enemy, Wizard wizard) {
        GameLogic.clearConsole();
        System.out.println("During your 4th year of magic school, the great tournament of the fire cup takes place.");
        System.out.println("\n Weirdly, you were chosen to represent your school and because of your bravery, you go to the final of the fire cup.");
        GameLogic.anythingToContinue();
        System.out.println("\n OH Noo !  It was a scheme from the evil side of the force. You have to flee from Peter Petigrow and Voldemort");
        System.out.println("\n the portkey is 500 meters away from you ! Use a spell to attract the portkey to you !");
        GameLogic.anythingToContinue();
        battleB(boss, enemy, wizard);
    }
    public void Level5(Enemy enemy,Boss boss, Wizard wizard){
        GameLogic.clearConsole();
        System.out.println("During your 5th year of magic school, Dolores Umbridge is your new professor but she is evil.");
        System.out.println("\n You must distract her by getting the fireworks of Fred and Georges !");
        GameLogic.anythingToContinue();
        battle(enemy, boss, wizard);
        System.out.println("\n You distracted Ms.Umbridge enough to lit the fireworks and to let the world know that Voldemort is back.");
        GameLogic.anythingToContinue();
        wizard.getSpell().add(Sectumsempra);
    }
    public void Level6(Boss boss, Enemy enemy, Wizard wizard){
        GameLogic.clearConsole();
        System.out.println("It is now your 5th year of magic school, war is at the door and you now that there is some Death eaters Among Us.");
        System.out.println("\n You learned in secret the spell Sectumsempra that will bring a lot of damage to your enemies");
        GameLogic.anythingToContinue();
        if (wizard.getHouse().getName().equals("Slytherin")){
            System.out.println("Oh, so you are a Slytherin. Would you like to join the Death eaters ?");
            System.out.println(" 1. Yes\n 2. No");
            int input = GameLogic.readInt(" ", 2);
            if (input == 1){
                System.out.println(" You joined the side of Voldemort !\n Therefore, he will not kill you and your family !");
                GameLogic.anythingToContinue();
                GameLogic.clearConsole();
                GameLogic.printHeading("Victory ...?");
                GameLogic.anythingToContinue();
                System.exit(0);
            }else{
                System.out.println("You did not joined the side of the Death eaters.\n They decided to attack you.");
                GameLogic.anythingToContinue();
            }

        }
        System.out.println("\n The Death eaters are coming to kill you ! defeat them using your spells !");
        GameLogic.anythingToContinue();
        battleB(boss, enemy, wizard);
        System.out.println("\n You successfully defeated them ! But a last trial is awaiting you next year...");
        wizard.getSpell().add(Expelliarmus);
    }
    public void Level7(Boss boss,Enemy enemy, Wizard wizard){
        GameLogic.clearConsole();
        System.out.println(" This is the final battle between you and Voldemort\n Belatrix Lestrange is participating too to destroy you. ");
        System.out.println("\n You are lucky to know the spell Expelliarmus to disarm your opponent and stun him for a short periode of time.");
        GameLogic.anythingToContinue();
        System.out.println("\n Because Voldemort knows the spell Avada Kedavra which kill you instantly.");
        System.out.println("\n Go and fight " + wizard.getName() + "! And return victorious !");
        GameLogic.anythingToContinue();
        battleB(boss,enemy, wizard);
        GameLogic.printHeading("Victory !!");
        GameLogic.anythingToContinue();
        System.exit(0);

    }
    public void battle(Enemy enemy,Boss boss, Wizard wizard) {
        wizard.setHp(wizard.getMaxHp());
        enemy.setHp(enemy.getMaxHp());
        while (enemy.getHp() > 0) {
            if (enemy.getCounter() < 10 && enemy.getName() == "Dolores Umbridge"){
                enemy.setCounter(enemy.getCounter() + 1);
            }
            if (enemy.getCounter() == 10){
                break;
            }
            wizard.setDefense(false);
            if (wizard.getHp() <= 0) {
                System.out.println("You are dead... Not a big surprise.");
                GameLogic.anythingToContinue();
                System.exit(0);
            }
            GameLogic.clearConsole();
            GameLogic.printHeading(enemy.getName() + "\nHP:" + enemy.getHp() + "/" + enemy.getMaxHp());
            GameLogic.printHeading(wizard.getName() + "\nHP:" + wizard.getHp() + "/" + wizard.getMaxHp());
            System.out.print("(1) Spell \n(2) Defend \n(3) Use potion");
            int input = GameLogic.readInt(" ", 3);
            if (input == 1) {
                for (int i = 0; i < wizard.getSpell().size(); i++) {
                    System.out.println(i + 1 + ". " + wizard.getSpell().get(i).getName());
                }
                cast(boss, enemy, wizard);

            } else if (input == 2) {
                defend(wizard);
            } else {
                System.out.print("(1) Low Hp potion\n(2) Mid Hp Potion\n(3) High Hp Potion");
                usePotion(wizard);
            }
        }
        GameLogic.clearConsole();
        System.out.print(" You defeated the " + enemy.getName() + ". \nWould you like to \n(1) Upgrade your life \n(2) Upgrade your damage");
        getBetter(wizard);
    }
    public void battleB(Boss boss,Enemy enemy, Wizard wizard) {
        wizard.setHp(wizard.getMaxHp());
        boss.setHp(boss.getMaxHp());
        while (boss.getHp() > 0) {
            wizard.setDefense(false);
            if (wizard.getHp() <= 0){
                System.out.println("You are dead... Not a big surprise.");
                GameLogic.anythingToContinue();
                System.exit(0);
            }
            if (wizard.getStun() != 0){
                wizard.setStun(wizard.getStun() -1);
            }
            GameLogic.clearConsole();
            GameLogic.printHeading(boss.getName() + "\nHP:" + boss.getHp() + "/" + boss.getMaxHp());
            GameLogic.printHeading(wizard.getName() + "\nHP:" + wizard.getHp() + "/" + wizard.getMaxHp());
            System.out.print("(1) Spell \n(2) Defend \n(3) Use potion");
            int input = GameLogic.readInt(" ", 3);
            if (input == 1) {
                for (int i=0; i<wizard.getSpell().size(); i++) {
                    System.out.println(i+1 + ". " + wizard.getSpell().get(i).getName());
                }
                cast(boss,enemy, wizard);
                if (boss.getHp() > 0) {
                    badCast(boss, wizard);
                }
            } else if (input == 2) {
                defend(wizard);
                badCast(boss, wizard);
            } else {
                System.out.print("(1) Low Hp potion\n(2) Mid Hp Potion\n(3) High Hp Potion");
                usePotion(wizard);
                badCast(boss, wizard);
            }
        }
        GameLogic.clearConsole();
        System.out.print(" You defeated the " + boss.getName() + ". \nWould you like to \n(1) Upgrade your life \n(2) Upgrade your damage");
        getBetter(wizard);
}
    public void cast(Boss boss, Enemy enemy, Wizard wizard) {
        int choice = GameLogic.readInt(" ", wizard.getSpell().size());
        if (this.getSpell().get(choice - 1).getName().equals("Wingardium Leviosa")) {
            System.out.println("You are using Wingardium Leviosa");
            Spell.WinLev(enemy, boss, wizard);
        } else if (this.getSpell().get(choice-1).getName().equals("Accio")){
            System.out.println("You are using Accio");
            Spell.Accio(enemy, boss, wizard);
        } else if (this.getSpell().get(choice-1).getName().equals("Expectro Patronum")) {
            System.out.println("You are using Expectro Patronum");
                Spell.ExpectroPatronum(enemy, wizard);
        } else if (this.getSpell().get(choice-1).getName().equals("Sword")){
            System.out.println("You are trying to pierce the Basilisk using the sword");
                Spell.Sword(enemy, wizard);
        }else if (this.getSpell().get(choice-1).getName().equals("Fang")){
            System.out.println("You are trying to pierce the Basilisk using his fang");
                Spell.Sword(enemy, wizard);
        }else if (this.getSpell().get(choice-1).getName().equals("Sectumsempra")){
            System.out.println("You are using Sectumsempra");
            Spell.Sectumsempra(boss, wizard);
        }else if (this.getSpell().get(choice-1).getName().equals("Expelliarmus")) {
            System.out.println("You are using Expelliarmus");
            Spell.Expelliarmus(boss, wizard);
        }

    }
    public void badCast(Boss boss, Wizard wizard){
        double cast = Math.random() * (4 - 1);
        if (cast < 1 && cast >= 0 || boss.getName().equals("Peter Petigrow and Voldemort") && !boss.isAction()){
            System.out.println(boss.getName() + " has used Imperium to make yourself hurt.");
            GameLogic.anythingToContinue();
            ForbiddenSpell.Imperium(boss, wizard);
        } else if (cast < 2 && cast >= 1 && boss.getName() != "Peter Petigrow and Voldemort") {
            System.out.println(boss.getName() + " has used Doloris to inflict you pain.");
            GameLogic.anythingToContinue();
            ForbiddenSpell.Doloris(boss, wizard);
        } else if (cast < 3 && cast >= 2 && boss.getName().equals("Death Eaters")) {
            System.out.println(boss.getName() + " has used Doloris to inflict you pain.");
            GameLogic.anythingToContinue();
            ForbiddenSpell.Doloris(boss, wizard);
    }else if (cast < 3 && cast >= 2 && boss.getName().equals("Bellatrix Lestrange and Voldemort") || boss.isAction()){
            ForbiddenSpell.AvadaKedavra(boss, wizard);
        }
    }

    public float getCoefDamage() {
        return coefDamage;
    }

    public void setCoefDamage(float coefDamage) {
        this.coefDamage = coefDamage;
    }

    public boolean isDefense() {
        return defense;
    }

    public void setDefense(boolean defense) {
        this.defense = defense;
    }

    public int getStun() {
        return stun;
    }

    public void setStun(int stun) {
        this.stun = stun;
    }
}