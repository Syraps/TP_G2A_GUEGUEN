public class Enemy extends Character{
    private static int damage;
    private static int position;
    public Enemy(String name, int maxHp, int damage, int position) {
        super(name, maxHp);
        this.damage = damage;
        this.position = position;
    }

    public static int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public static int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
