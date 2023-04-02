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
        if (accuracy <= boss.getAccuracy() && wizard.isDefense() == false) {
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
        if (accuracy <= boss.getAccuracy() && !wizard.isDefense()) {
            for (int i = 0; i < boss.getForbiddenSpell().size(); i++) {
                if (boss.getForbiddenSpell().get(i).getName().equals("Doloris")) {
                    wizard.setHp(wizard.getHp() - boss.getForbiddenSpell().get(i).getDamage());
                    System.out.println("You took " + boss.getForbiddenSpell().get(i).getDamage() + " from " + boss.getName());
                }
            }
        }else {
            System.out.println(boss.getName() + " failed their attack.");
        }
    }
    public static void AvadaKedavra (Boss boss, Wizard wizard) {
        double accuracy = Math.random() * (101 - 1);
        if (accuracy <= boss.getAccuracy() && !boss.isAction()) {
            System.out.println("Voldemort is setting up for a big spell, be careful !");
            boss.setAction(true);
            GameLogic.anythingToContinue();
        } else if (accuracy <= boss.getAccuracy() && boss.isAction() && !wizard.isDefense()) {
            for (int i = 0; i < boss.getForbiddenSpell().size(); i++) {
                if (boss.getForbiddenSpell().get(i).getName().equals("Avada Kedavra")) {
                    wizard.setHp(wizard.getHp() - boss.getForbiddenSpell().get(i).getDamage());
                    System.out.println("AVADA KEDAVRA !");
                    GameLogic.anythingToContinue();
                }
            }
        }
        else if (accuracy <= boss.getAccuracy() && boss.isAction() && wizard.isDefense()) {
            System.out.println("AVADA KEDAVRA !");
            GameLogic.anythingToContinue();
            System.out.println("You successfully defend yourself !");
            GameLogic.anythingToContinue();
        }else {
            System.out.println("Seems like Voldemort can't focus at all.");
            GameLogic.anythingToContinue();
        }
    }

}
