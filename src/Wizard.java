import java.util.List;
public class Wizard extends Character {
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownspells;
    private List<Potion> potions;
    private int coefDamage;

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

    public Wizard(Pet pet, Wand wand, House house, List<Spell> knownspells, List<Potion> potions, String name, int coefDamage) {
        super(name, 100);
        this.pet = pet;
        this.wand = wand;
        this.house = house;
        this.knownspells = knownspells;
        this.potions = potions;
        this.coefDamage = coefDamage;
    }

    public Wand chooseWand() {
        System.out.print("A wand will choose its owner");
        GameLogic.anythingToContinue();
        int size = (int) (Math.random() * (20 - 10) + 10);
        double var = Math.random() * (6 - 1);
        Wand chooseWand = null;
        if (var <= 1) {
            chooseWand = new Wand(Core.PHOENIX_FEATHER, size);
            System.out.print("Votre baguette fait " + chooseWand.getSize() + "cm. Et votre coeur de baguette est faite en " + chooseWand.getCore());
        } else if (var <= 2) {
            chooseWand = new Wand(Core.DRAGON_HEARTSTRING, size);
            System.out.print("Votre baguette fait " + chooseWand.getSize() + "cm. Et votre coeur de baguette est faite en " + chooseWand.getCore());
        } else if (var <= 3) {
            chooseWand = new Wand(Core.UNICORN_TAIL_HAIR, size);
            System.out.print("Votre baguette fait " + chooseWand.getSize() + "cm. Et votre coeur de baguette est faite en " + chooseWand.getCore());
        } else if (var <= 4) {
            chooseWand = new Wand(Core.BASILISK_HORN, size);
            System.out.print("Votre baguette fait " + chooseWand.getSize() + "cm. Et votre coeur de baguette est faite en " + chooseWand.getCore());
        } else if (var <= 5) {
            chooseWand = new Wand(Core.THUNDERBIRD_TAIL_FEATHER, size);
            System.out.print("Votre baguette fait " + chooseWand.getSize() + "cm. Et votre coeur de baguette est faite en " + chooseWand.getCore());
        }
        return chooseWand;
    }

    public Pet choosePet() {
        System.out.print("Here is your pet...");
        GameLogic.anythingToContinue();
        double var = Math.random() * (6 - 1);
        Pet choosePet = null;
        if (var <= 1) {
            choosePet = Pet.CAT;
            System.out.print("Your pet is a  " + choosePet);
        } else if (var <= 2) {
            choosePet = Pet.OWL;
            System.out.print("Your pet is a  " + choosePet);
        } else if (var <= 3) {
            choosePet = Pet.RAT;
            System.out.print("Your pet is a  " + choosePet);
        } else if (var <= 4) {
            choosePet = Pet.RABBIT;
            System.out.print("Your pet is a  " + choosePet);
        } else if (var <= 5) {
            choosePet = Pet.TOAD;
            System.out.print("Your pet is a  " + choosePet);
        }
        return choosePet;
    }
    public Wizard getBetter(Wizard wizard) {
        int choice = GameLogic.readInt("->", 2);
        if (choice == 1){
            wizard.setMaxHp((int) (wizard.getMaxHp() * 1.2));
            wizard.setHp((wizard.getMaxHp()));
            System.out.print("your Hp are now " + wizard.getHp() + "/" + wizard.getMaxHp());
            GameLogic.anythingToContinue();
        }else if (choice == 2){
            wizard.setCoefDamage((int) (wizard.getCoefDamage() + 0.25));
            System.out.print("Your damage is now " + wizard.getCoefDamage() + " times better");
            GameLogic.anythingToContinue();
        }
        return null;
    }

    public void usePotion(Wizard wizard) {
        int choice = GameLogic.readInt(" ", wizard.getPotion().size());
        if (wizard.getPotion().get(choice - 1 ).getnbPotion() != 0){
            if (wizard.getPotion().get(choice- 1).getName().equals("low Hp potion")) {
                System.out.print("You used a low Hp potion");
                wizard.setHp((int) (wizard.getHp() + 20 * house.getPotionF()));
                wizard.getPotion().get(choice - 1 ).setNbPotion(wizard.getPotion().get(choice - 1 ).getNbPotion() - 1);
                GameLogic.anythingToContinue();
            } else if (wizard.getPotion().get(choice - 1).getName().equals("mid Hp potion")) {
                System.out.print("You used a mid Hp potion");
                wizard.setHp((int) (wizard.getHp() + 40 * house.getPotionF()));
                wizard.getPotion().get(choice - 1 ).setNbPotion(wizard.getPotion().get(choice - 1 ).getNbPotion() - 1);
                GameLogic.anythingToContinue();
            } else if (wizard.getPotion().get(choice - 1).getName().equals("high Hp potion")) {
                System.out.print("You used a high Hp potion");
                this.setHp((int) (wizard.getHp() + 60 * house.getPotionF()));
                wizard.getPotion().get(choice - 1 ).setNbPotion(wizard.getPotion().get(choice - 1 ).getNbPotion() - 1);
                GameLogic.anythingToContinue();
            }
        }else{
            System.out.println("You don't have this potion !");
            GameLogic.anythingToContinue();
        }

        if (wizard.getHp() > wizard.getMaxHp()) {
            wizard.setHp(wizard.getMaxHp());
        }
    }
    public void defend(){
    System.out.print("PROTEGO !");
    GameLogic.anythingToContinue();
    }



    public void Level1(Enemy enemy, Wizard wizard) {

        GameLogic.clearConsole();
        GameLogic.printHeading("You encountered the Troll ! You will have to use Wingardium Leviosa to fight it.");
        GameLogic.anythingToContinue();
        battle(enemy, wizard);
    }
    public void Level2(Enemy enemy, Wizard wizard) {

        GameLogic.clearConsole();
        System.out.println("During your second year at school, you learned the spell Accio.\n" +
                " But a monster is roarming inside the chamber of secrets... ");
        GameLogic.anythingToContinue();
        GameLogic.printHeading(" OH NO !\n You encountered the Basilisk in the Chambers of secrets !");
        GameLogic.anythingToContinue();
        if (wizard.getHouse().getName() == "Gryffindor"){
            System.out.print("you have the sword of Godric Gryffindor to slay the Basilisk !");
            Spell sword = new Spell("Sword", 0);
            wizard.getSpell().add(sword);
            for (int i=0; i<wizard.getSpell().size(); i++) {
                if (wizard.getSpell().get(i).getName().equals("Accio")) {
                    wizard.getSpell().get(i).setCounter(wizard.getSpell().get(i).getCounter() - 50);
                }
            } GameLogic.anythingToContinue();
        }else {
            System.out.print("you have to rip off one of the fangs of the Basilisk to slay it !");
        } GameLogic.anythingToContinue();
        battle(enemy, wizard);
        //wizard.getSpell().remove(sword);

    }
    public void Level3(Enemy enemy, Wizard wizard){
        GameLogic.clearConsole();
        System.out.println("You go to your 3rd year of magic school where you learn a new spell: Expectro Patronum");
        GameLogic.anythingToContinue();
        System.out.println("\n When Wandering into the Forbbidden Forest's lake, you are surrounded by 6 Dementor !");
        System.out.println("\n Use the spell that you learned this year !\n it will make them flee");
        GameLogic.anythingToContinue();
        battle(enemy, wizard);

    }

    public void battle(Enemy enemy, Wizard wizard) {
        wizard.setHp(wizard.getMaxHp());
        enemy.setHp(enemy.getMaxHp());
        while (enemy.getHp() > 0) {
            if (wizard.getHp() <= 0){
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
                for (int i=0; i<wizard.getSpell().size(); i++) {
                    System.out.println(i+1 + ". " + wizard.getSpell().get(i).getName());
                }
                cast(enemy, wizard);
            } else if (input == 2) {
                defend();
            } else {
                System.out.print("(1) Low Hp potion\n(2) Mid Hp Potion\n(3) High Hp Potion");
                    usePotion(wizard);
                }
            }
        GameLogic.clearConsole();
        System.out.print(" You defeated the " + enemy.getName() + ". \nWould you like to \n(1) Upgrade your life \n(2) Upgrade your damage");
        getBetter(wizard);
    }
    public void cast(Enemy enemy, Wizard wizard){
        int choice = GameLogic.readInt(" ", wizard.getSpell().size());
        if (this.getSpell().get(choice-1).getName().equals("Wingardium Leviosa")){
            System.out.println("You are using Wingardium Leviosa");
            Spell.WinLev(enemy, wizard);
        } else if (this.getSpell().get(choice-1).getName().equals("Accio")){
            System.out.println("You are using Accio");
            Spell.Accio(enemy, wizard);
        } else if (this.getSpell().get(choice-1).getName().equals("Expectro Patronum")) {
            System.out.println("You are using Expectro Patronum");
            Spell.ExpectroPatronum(enemy, wizard);
        } else if (this.getSpell().get(choice-1).getName().equals("Sword")){
            System.out.println("You are trying to pierce the Basilisk using the sword");
            Spell.Sword(enemy, wizard);
        }else if (this.getSpell().get(choice-1).getName().equals("Fang")){
            System.out.println("You are trying to pierce the Basilisk using his fang");
            Spell.Sword(enemy, wizard);
            GameLogic.anythingToContinue();
        }

    }

    public int getCoefDamage() {
        return coefDamage;
    }

    public void setCoefDamage(int coefDamage) {
        this.coefDamage = coefDamage;
    }
}