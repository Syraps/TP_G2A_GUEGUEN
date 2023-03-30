import java.util.List;
public class Wizard extends Character {
    private Pet pet;
    private Wand wand;
    private static House house;
    private List<Spell> knownspells;
    private List<Potion> potions;
    private int coefDamage;


    public Pet getPet() {
        return pet;
    }

    public Wand getWand() {
        return wand;
    }

    public static House getHouse() {
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
    public Wizard getBetter() {
        int choice = GameLogic.readInt("->", 2);
        if (choice == 1){
            this.setMaxHp((int) (this.getMaxHp() * 1.2));
            this.setHp((this.getMaxHp()));
            System.out.print("your Hp are now " + this.getHp() + "/" + this.getMaxHp());
            GameLogic.anythingToContinue();
        }else if (choice == 2){
            this.setCoefDamage((int) (this.getCoefDamage() + 0.25));
            System.out.print("Your damage is now " + this.getCoefDamage() + " times better");
            GameLogic.anythingToContinue();
        }
        return null;
    }

    public Potion usePotion() {
        int choice = GameLogic.readInt("->", 3);
        if (this.getPotion().get(choice).getName().equals("low Hp potion")) {
            System.out.print("You used a low Hp potion");
            this.setHp((int) (this.getHp() + 20 * house.getPotionF()));
            if (this.getHp() > this.getMaxHp()) {
                this.setHp(this.getMaxHp());
            }
            GameLogic.anythingToContinue();
        } else if (this.getPotion().get(choice).getName().equals("mid Hp potion")) {
            System.out.print("You used a mid Hp potion");
            this.setHp((int) (this.getHp() + 40 * house.getPotionF()));
            if (this.getHp() > this.getMaxHp()) {
                this.setHp(this.getMaxHp());
            }
            GameLogic.anythingToContinue();
        } else if (this.getPotion().get(choice).getName().equals("high Hp potion")) {
            System.out.print("You used a high Hp potion");
            this.setHp((int) (this.getHp() + 60 * house.getPotionF()));
            if (this.getHp() > this.getMaxHp()) {
                this.setHp(this.getMaxHp());
            }
            GameLogic.anythingToContinue();
        }
    return usePotion();
    }
    public Wizard defend(){
    this.setHp((int) (this.getHp() - Enemy.getDamage() * 0.25));
    System.out.print("Vous vous défendez.");
    return defend();
    }



    public void Battle1() {

        GameLogic.clearConsole();
        GameLogic.printHeading("You encountered the Troll ! You will have to use Wingardium Leviosa to fight it.");
        GameLogic.anythingToContinue();
        this.battle();

    }

    public void battle() {
        this.setHp(this.getMaxHp());
        Enemy.setHp(Enemy.getMaxHp());
        while (Enemy.getHp() != 0) {
            GameLogic.clearConsole();
            GameLogic.printHeading(Enemy.getName() + "\nHP:" + Enemy.getHp() + "/" + Enemy.getMaxHp());
            GameLogic.printHeading(this.getName() + "\nHP:" + this.getHp() + "/" + this.getMaxHp());
            System.out.print("(1) Spell \n(2) Defend \n(3) Use potion");
            int input = GameLogic.readInt("-> ", 3);
            if (input == 1) {
                //Spell
            } else if (input == 2) {
                defend();
            } else {
                System.out.println("(1) Potion of low Hp \n(2) Potion of mid Hp \n(3) Potion of high Hp");
                usePotion();
            }
        }
        GameLogic.clearConsole();
        System.out.print(" You defeated the " + Enemy.getName() + ". \nWould you like to \n(1) Upgrade your life \n(2) Upgrade your damage");
        getBetter();
    }

    public int getCoefDamage() {
        return coefDamage;
    }

    public void setCoefDamage(int coefDamage) {
        this.coefDamage = coefDamage;
    }
}