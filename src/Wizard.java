import java.util.List;
public class Wizard extends Character{
    private Pet pet;
    private Wand wand;
    private static House house;
    private List<Spell> knownspells;
    private List<Potion> potions;


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

    public Wizard(Pet pet, Wand wand, House house, List<Spell> knownspells, List<Potion> potions, String name){
        super(name,100);
        this.pet = pet;
        this.wand = wand;
        this.house = house;
        this.knownspells = knownspells;
        this.potions = potions;
    }
    public  Wand chooseWand(){
        System.out.print("A wand will choose its owner");
        GameLogic.anythingToContinue();
        int size = (int) (Math.random() * (20 - 10) +10);
        double var = Math.random() * (6 - 1);
        Wand chooseWand = null;
        if (var <= 1){
            chooseWand = new Wand(Core.PHOENIX_FEATHER,size);
            System.out.print("Votre baguette fait " + chooseWand.getSize() + "cm. Et votre coeur de baguette est faite en " + chooseWand.getCore());
        } else if ( var <= 2){
            chooseWand = new Wand(Core.DRAGON_HEARTSTRING,size);
            System.out.print("Votre baguette fait " + chooseWand.getSize() + "cm. Et votre coeur de baguette est faite en " + chooseWand.getCore());
        } else if ( var <= 3){
            chooseWand = new Wand(Core.UNICORN_TAIL_HAIR,size);
            System.out.print("Votre baguette fait " + chooseWand.getSize() + "cm. Et votre coeur de baguette est faite en " + chooseWand.getCore());
        } else if (var <= 4){
            chooseWand = new Wand(Core.BASILISK_HORN,size);
            System.out.print("Votre baguette fait " + chooseWand.getSize() + "cm. Et votre coeur de baguette est faite en " + chooseWand.getCore());
        } else if (var <= 5){
            chooseWand = new Wand(Core.THUNDERBIRD_TAIL_FEATHER, size);
            System.out.print("Votre baguette fait " + chooseWand.getSize() + "cm. Et votre coeur de baguette est faite en " + chooseWand.getCore());
        }
        return chooseWand;
    }
    public  Pet choosePet(){
        System.out.print("Here is your pet...");
        GameLogic.anythingToContinue();
        double var = Math.random() * (6 - 1);
        Pet choosePet = null;
        if (var <= 1){
             choosePet =  Pet.CAT;
            System.out.print("Your pet is a  " + choosePet);
        } else if ( var <= 2){
            choosePet = Pet.OWL;
            System.out.print("Your pet is a  " + choosePet);
        } else if ( var <= 3){
            choosePet = Pet.RAT;
            System.out.print("Your pet is a  " + choosePet);
        } else if (var <= 4){
            choosePet = Pet.RABBIT;
            System.out.print("Your pet is a  " + choosePet);
        } else if (var <= 5){
            choosePet = Pet.TOAD;
            System.out.print("Your pet is a  " + choosePet);
        }
        return choosePet;
    }
    public Potion usePotion(int choice) {
        switch (choice) {
            case 1:
                this.setHp((int) (this.getHp() + 40 * house.getPotionF()));
                if (this.getHp() > this.getMaxHp()){
                    this.setHp(this.getMaxHp());
                }
                break;
            case 2:
                house.setAccuracy(house.getAccuracy() + 0.1f * house.getPotionF());
                break;
            case 3:
                house.setResistance(house.getResistance() + 0.2f * house.getPotionF());
                break;
        }
        return null;
    }
}
