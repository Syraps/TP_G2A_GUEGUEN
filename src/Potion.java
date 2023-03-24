public class Potion {
    private int potion;
    private String name;
    public int getPotion() {
        return potion;
    }
    public void setPotion(int Potion) {
        this.potion = potion;
    }
    public Potion (int potion, String name) {
        this.potion = potion;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
