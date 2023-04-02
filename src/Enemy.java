public class Enemy extends Character{
    private int damage;
    private int counter;
    public Enemy(String name, int maxHp, int damage, int counter) {
        super(name, maxHp);
        this.damage = damage;
        this.counter = counter;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
