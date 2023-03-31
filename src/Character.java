public class Character {
    private String name;
    private int Hp;
    private int maxHp;

    public String getName() {
        return name;
    }
    public int getHp() {
        return Hp;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int Hp) {
        this.Hp = Hp;
    }
    public Character(String name, int maxHp){
        this.name = name;
        this.maxHp = maxHp;
        this.Hp = Hp;

    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
}
