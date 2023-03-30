public class Potion {
    private static int nbPotion;
    private String name;

    public static int getNbPotion() {
        return nbPotion;
    }

    public static void setNbPotion(int nbPotion) {
        Potion.nbPotion = nbPotion;
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
