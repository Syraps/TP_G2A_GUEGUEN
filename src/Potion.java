public class Potion {
    private int nbPotion;
    private String name;

    public int getNbPotion() {
        return nbPotion;
    }

    public void setNbPotion(int nbPotion) {
        this.nbPotion = nbPotion;
    }

    public int getnbPotion() {
        return nbPotion;
    }

    public Potion ( int nbPotion, String name) {
        this.nbPotion = nbPotion;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
