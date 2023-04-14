public class ForbiddenSpell extends AbstractSpell {
    private int damage;

    public ForbiddenSpell(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public static void Imperium(Boss boss, Wizard wizard) {
        double accuracy = Math.random() * (101 - 1);
        if (accuracy <= boss.getAccuracy() && wizard.isDefense() == false && wizard.getStun() == 0) {
            for (int i = 0; i < boss.getForbiddenSpell().size(); i++) {
                if (boss.getForbiddenSpell().get(i).getName().equals("Imperium")) {
                    wizard.setHp(wizard.getHp() - boss.getForbiddenSpell().get(i).getDamage());
                    System.out.println("You took " + boss.getForbiddenSpell().get(i).getDamage() + " from " + boss.getName());
                }
            }
        }else {
            System.out.println(boss.getName() + " failed their attack.");
        }
    }
    public static void Doloris(Boss boss, Wizard wizard){
        double accuracy = Math.random() * (101 - 1);
        if (accuracy <= boss.getAccuracy() && !wizard.isDefense() && wizard.getStun() == 0) {
            for (int i = 0; i < boss.getForbiddenSpell().size(); i++) {
                if (boss.getForbiddenSpell().get(i).getName().equals("Doloris")) {
                    wizard.setHp(wizard.getHp() - boss.getForbiddenSpell().get(i).getDamage());
                    System.out.println("You took " + boss.getForbiddenSpell().get(i).getDamage() + " from " + boss.getName());
                }
            }
        }else {
            System.out.println(boss.getName() + " failed their attack.");
            GameLogic.anythingToContinue();
        }
    }
    public static void AvadaKedavra (Boss boss, Wizard wizard) {
        double accuracy = Math.random() * (101 - 1);
        if (accuracy <= boss.getAccuracy() && !boss.isAction()) {
            System.out.println("Voldemort is setting up for a big spell, be careful !");
            boss.setAction(true);
        } else if (accuracy <= boss.getAccuracy() && boss.isAction() && !wizard.isDefense() && wizard.getStun() == 0) {
            for (int i = 0; i < boss.getForbiddenSpell().size(); i++) {
                if (boss.getForbiddenSpell().get(i).getName().equals("Avada Kedavra")) {
                    wizard.setHp(wizard.getHp() - boss.getForbiddenSpell().get(i).getDamage());
                    System.out.println("AVADA KEDAVRA !");
                }
            }
        }
        else if (accuracy <= boss.getAccuracy() && boss.isAction() && wizard.isDefense()) {
            System.out.println("AVADA KEDAVRA !");
            boss.setAction(false);
            GameLogic.anythingToContinue();
            System.out.println("You successfully defend yourself !");
        } else if (accuracy <= boss.getAccuracy() && boss.isAction() && wizard.getStun() != 0) {
            System.out.println("Voldemort is stunned, so he failed his attack.");
            boss.setAction(false);
        } else {
            System.out.println("Seems like Voldemort can't focus at all.");
            boss.setAction(false);
        }
    }

}
