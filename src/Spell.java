public class Spell extends AbstractSpell {
    private int counter;
    public Spell(String name, int counter) {
        super(name);
        this.counter = counter;
    }
   public static void  WinLev(Enemy enemy, Boss boss, Wizard wizard){
        double accuracy = Math.random() * (101 - 1);
       if (accuracy <= wizard.getHouse().getAccuracy() && enemy.getName() != "Dementor" && boss == null){
               System.out.print("your object is up the head of an enemy, You drop it");
               GameLogic.anythingToContinue();
               wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
               enemy.setHp((int) (enemy.getHp() - 25 * wizard.getCoefDamage() * wizard.getHouse().getSpellF()));
               System.out.print("the enemy took " + 25 * wizard.getCoefDamage() * wizard.getHouse().getSpellF() + " Damage");
               System.out.print("\nyou took " + enemy.getDamage() * wizard.getHouse().getResistance() + " from " + enemy.getName());
               GameLogic.anythingToContinue();

       }else if(accuracy > wizard.getHouse().getAccuracy() && enemy.getName() != "Dementor" && boss == null){
           System.out.print("You failed your attack.");
           GameLogic.anythingToContinue();
           wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
           System.out.print(enemy.getName() + " is attacking.");
           GameLogic.anythingToContinue();

       }else if(accuracy <= wizard.getHouse().getAccuracy() && enemy == null){
           System.out.print("your object is up the head of an enemy, You drop it");
           GameLogic.anythingToContinue();
           boss.setHp((int) (boss.getHp() - 25 * wizard.getCoefDamage() * wizard.getHouse().getSpellF()));
           System.out.print("the enemy took " + 25 * wizard.getCoefDamage() * wizard.getHouse().getSpellF() + " damage");
           GameLogic.anythingToContinue();
       }else if(accuracy > wizard.getHouse().getAccuracy() && enemy == null){
           System.out.print("You failed your attack.");
           GameLogic.anythingToContinue();
       }
    }
    public static void Accio (Enemy enemy, Boss boss, Wizard wizard ){
        double accuracy = Math.random() * (101 - 1);
        Spell sword = new Spell("Fang", 0);
        if (accuracy <= wizard.getHouse().getAccuracy() && enemy.getName() != "Dementor" && boss.getName() != "Dolores Ombrage"){
            for (int i=0; i<wizard.getSpell().size(); i++) {
                if (wizard.getSpell().get(i).getName().equals("Accio")) {
                    wizard.getSpell().get(i).setCounter(wizard.getSpell().get(i).getCounter() - 50);
                    if (wizard.getSpell().get(i).getCounter() == 500){
                        wizard.getSpell().remove(1);
                        wizard.getSpell().add(sword);
                        System.out.println("You have the fang of the Basilisk");
                        GameLogic.anythingToContinue();
                    }else if (499 > wizard.getSpell().get(i).getCounter() && wizard.getSpell().get(i).getCounter() > 0){
                        System.out.print("The portkey is "+ wizard.getSpell().get(i).getCounter()+ "m away from you !");
                        GameLogic.anythingToContinue();
                    }else if (wizard.getSpell().get(i).getCounter() <= 0){
                        System.out.print("You have reached the portkey and you used it");
                        enemy.setHp(-10);
                        GameLogic.anythingToContinue();
                    }
                }
            }
        }else if (accuracy > wizard.getHouse().getAccuracy() && boss == null ) {
            System.out.print("You failed your attack.");
            wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
            System.out.print("\n" + enemy.getName() + " is attacking.");
            GameLogic.anythingToContinue();
        }else if(accuracy > wizard.getHouse().getAccuracy() && boss != null) {
            for (int i=0; i<wizard.getSpell().size(); i++) {
                if (wizard.getSpell().get(i).getName().equals("Accio") && wizard.getSpell().get(i).getCounter() > 0) {
                    wizard.getSpell().get(i).setCounter(wizard.getSpell().get(i).getCounter() - 15);
                    System.out.print("You failed your attack but you walked toward the portkey");
                    GameLogic.anythingToContinue();
                } else if (wizard.getSpell().get(i).getName().equals("Accio") && wizard.getSpell().get(i).getCounter() <= 0){
                    System.out.print("You failed your attack");
                    GameLogic.anythingToContinue();
                }
            }
        }
    }
    public static void ExpectroPatronum (Enemy enemy, Wizard wizard){
        double accuracy = Math.random() * (101 - 1);
        if (accuracy <= wizard.getHouse().getAccuracy() && enemy.getName() == "Dementor"){
            enemy.setHp( enemy.getHp() - 1 );
            System.out.println("There is now " + enemy.getHp() + " Dementors left !" );
            GameLogic.anythingToContinue();
            wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * enemy.getHp() * wizard.getHouse().getResistance() / 2));
        }else if (accuracy > wizard.getHouse().getAccuracy() && enemy.getName() != null) {
            System.out.print("You failed your attack.");
            GameLogic.anythingToContinue();
            System.out.print(enemy.getName() + " is attacking.");
            wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * enemy.getHp() * wizard.getHouse().getResistance() / 2));
            GameLogic.anythingToContinue();

        }else {
            System.out.print("You failed your attack.");
            GameLogic.anythingToContinue();
        }
    }
    public static void Sword (Enemy enemy, Wizard wizard){
        double accuracy = Math.random() * (101 - 1);
        if (accuracy <= wizard.getHouse().getAccuracy()){
            enemy.setHp((int) (enemy.getHp() - 200 * wizard.getCoefDamage() * wizard.getHouse().getSpellF()));
            System.out.println("You pierced the heart of the Basilisk");
            wizard.getSpell().remove(1);
            GameLogic.anythingToContinue();
        }else{
            System.out.print("You failed your attack.");
            GameLogic.anythingToContinue();
            System.out.print(enemy.getName() + "is attacking.");
            GameLogic.anythingToContinue();
        }
    }
    public static void Sectumsempra (Boss boss, Wizard wizard){
        double accuracy = Math.random() * (101 - 1);
        if (accuracy <= wizard.getHouse().getAccuracy()){
            boss.setHp((int) (boss.getHp() - 80 * wizard.getCoefDamage() * wizard.getHouse().getSpellF()));
            System.out.println(" They took " + 80 * wizard.getCoefDamage() * wizard.getHouse().getSpellF() + " damage");
            GameLogic.anythingToContinue();
        }else{
            System.out.print("You failed your attack.");
            GameLogic.anythingToContinue();
        }

    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
