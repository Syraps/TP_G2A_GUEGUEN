public class Character {
    private String name;
    private int hp, maxHp;

    public String getName() {
        return name;
    }
    public int getPDV() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPDV(int PDV) {
        this.hp = hp;
    }
    public Character(String name, int maxHp){
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
    }
}
