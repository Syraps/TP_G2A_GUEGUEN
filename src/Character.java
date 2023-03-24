public class Character {
    private String name;
    private static int Hp;
    private int maxHp;

    public String getName() {
        return name;
    }
    public static int getHp() {
        return Hp;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int Hp) {
        this.Hp = 100;
    }
    public Character(String name, int maxHp){
        this.name = name;
        this.maxHp = maxHp;
        this.Hp = maxHp;

    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
}
