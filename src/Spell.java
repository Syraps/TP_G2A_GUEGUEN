public class Spell extends AbstractSpell {
    private int counter;
    public Spell(String name, int counter) {
        super(name);
        this.counter = counter;
    }
   public static void  WinLev(Enemy enemy, Wizard wizard){
        double accuracy = Math.random() * (101 - 1);
       if (accuracy <= wizard.getHouse().getAccuracy() && enemy.getName() != "dementor"){
           System.out.print("You lifted an object, Would you like to put it in position:\n(1) \n(2) \n(3) \n(4) \n(5)");
           int place = GameLogic.readInt(" ", 5);
           if (place == Enemy.getPosition()) {
               System.out.print("your object is up the head of an enemy, You drop it");
               GameLogic.anythingToContinue();
               wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
               enemy.setHp((int) (enemy.getHp() - 25 * wizard.getCoefDamage() * wizard.getHouse().getSpellF()));
               System.out.print("the enemy took " + 25 * wizard.getCoefDamage() * wizard.getHouse().getSpellF() + " Damage");
               System.out.print("\nyou took " + enemy.getDamage() * wizard.getHouse().getResistance() + " from " + enemy.getName());
               GameLogic.anythingToContinue();
           }else{
               System.out.print("your object dropped on nothing");
               GameLogic.anythingToContinue();
               wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
               System.out.print("you took " + enemy.getDamage() * wizard.getHouse().getResistance() + " from " + enemy.getName());
               GameLogic.anythingToContinue();
           }
       }else{
           System.out.print("You failed your attack.");
           GameLogic.anythingToContinue();
           wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
           System.out.print(enemy.getName() + " is attacking.");
           GameLogic.anythingToContinue();

       }
    }
    public static void Accio (Enemy enemy,Wizard wizard ){
        double accuracy = Math.random() * (101 - 1);
        Spell sword = new Spell("Fang", 0);
        if (accuracy <= wizard.getHouse().getAccuracy() && enemy.getName() != "dementor"){
            for (int i=0; i<wizard.getSpell().size(); i++) {
                if (wizard.getSpell().get(i).getName().equals("Accio")) {
                    wizard.getSpell().get(i).setCounter(wizard.getSpell().get(i).getCounter() - 50);
                    if (wizard.getSpell().get(i).getCounter() == 500){
                        wizard.getSpell().remove(-1);
                        wizard.getSpell().add(sword);
                        System.out.println("You have the fang of the Basilisk");
                        GameLogic.anythingToContinue();
                    }else if (499 > wizard.getSpell().get(i).getCounter() && wizard.getSpell().get(i).getCounter() > 0){
                        System.out.print("The portkey is "+ wizard.getSpell().get(i).getCounter()+ "m away from you !");
                        GameLogic.anythingToContinue();
                        wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
                    }else if (wizard.getSpell().get(i).getCounter() <= 0){
                        System.out.print("You have reached the portkey and you used it");
                        enemy.setHp(-10);
                        GameLogic.anythingToContinue();
                    }
                }

            }
        }else {
            System.out.print("You failed your attack.");
            GameLogic.anythingToContinue();
            wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
            System.out.print(enemy.getName() + " is attacking.");
            GameLogic.anythingToContinue();

        }
    }
    public static void ExpectroPatronum (Enemy enemy, Wizard wizard){
        double accuracy = Math.random() * (101 - 1);
        if (accuracy <= wizard.getHouse().getAccuracy()){
            enemy.setHp((int) (enemy.getHp() - 1 * wizard.getCoefDamage() * wizard.getHouse().getSpellF()));
            System.out.println("using your Patronum, you successfully make " + 6 + -enemy.getHp() + " Dementors run away !" );
            GameLogic.anythingToContinue();
        }else{
            System.out.print("You failed your attack.");
            GameLogic.anythingToContinue();
            System.out.print(enemy.getName() + " is attacking.");
            wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
            GameLogic.anythingToContinue();

        }
    }
    public static void Sword (Enemy enemy, Wizard wizard){
        double accuracy = Math.random() * (101 - 1);
        if (accuracy <= wizard.getHouse().getAccuracy()){
            enemy.setHp((int) (enemy.getHp() - 200 * wizard.getCoefDamage() * wizard.getHouse().getSpellF()));
            System.out.println("You pierced the heart of the Basilisk");
            GameLogic.anythingToContinue();
        }else{
            System.out.print("You failed your attack.");
            GameLogic.anythingToContinue();
            System.out.print(enemy.getName() + "is attacking.");
            GameLogic.anythingToContinue();
            wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
        }
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
