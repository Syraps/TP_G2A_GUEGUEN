import java.util.List;
public class Wizard {
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownspells;
    private List<Potion> potions;


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

    public Wizard(Pet pet, Wand wand, House house, List<Spell> knownspells, List<Potion> potions){
        this.pet = pet;
        this.wand = wand;
        this.house = house;
        this.knownspells = knownspells;
        this.potions = potions;
    }
}
