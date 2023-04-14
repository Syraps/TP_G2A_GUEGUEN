public class Spell extends AbstractSpell {
    private int counter;
    public Spell(String name, int counter) {
        super(name);
        this.counter = counter;
    }
   public static void  WinLev(Enemy enemy, Boss boss, Wizard wizard){
        double accuracy = Math.random() * (101 - 1);
       if (accuracy <= wizard.getHouse().getAccuracy() && enemy.getName() != "Dementor" && boss.getName() == "Nothing"){
               System.out.print("your object is up the head of an enemy, You drop it");
               GameLogic.anythingToContinue();
               wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
               enemy.setHp((int) (enemy.getHp() - 25 * wizard.getCoefDamage() * wizard.getHouse().getSpellF()));
               System.out.print("the enemy took " + 25 * wizard.getCoefDamage() * wizard.getHouse().getSpellF() + " Damage");
               System.out.print("\nyou took " + enemy.getDamage() * wizard.getHouse().getResistance() + " from " + enemy.getName());
               GameLogic.anythingToContinue();

       }else if(accuracy > wizard.getHouse().getAccuracy() && boss.getName() == "Nothing" || enemy.getName().equals("Dementor")){
           System.out.print("You failed your attack.");
           GameLogic.anythingToContinue();
           wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
           System.out.print(enemy.getName() + " is attacking.");
           GameLogic.anythingToContinue();

       }else if(accuracy <= wizard.getHouse().getAccuracy() && enemy.getName() == "Nada"){
           System.out.print("your object is up the head of an enemy, You drop it");
           GameLogic.anythingToContinue();
           boss.setHp((int) (boss.getHp() - 25 * wizard.getCoefDamage() * wizard.getHouse().getSpellF()));
           System.out.print("the enemy took " + 25 * wizard.getCoefDamage() * wizard.getHouse().getSpellF() + " damage");
           GameLogic.anythingToContinue();
       }else if(accuracy > wizard.getHouse().getAccuracy() && enemy.getName() == "Nada"){
           System.out.print("You failed your attack.");
           GameLogic.anythingToContinue();
       }
    }
    public static void Accio (Enemy enemy, Boss boss, Wizard wizard ){
        double accuracy = Math.random() * (101 - 1);
        Spell sword = new Spell("Fang", 0);
        if (accuracy <= wizard.getHouse().getAccuracy() && enemy.getName().equals("Basilisk") && boss.getName() == "Nothing"){
            for (int i=0; i<wizard.getSpell().size(); i++) {
                if (wizard.getSpell().get(i).getName().equals("Accio")) {
                    wizard.getSpell().get(i).setCounter(wizard.getSpell().get(i).getCounter() - 50);
                        wizard.getSpell().remove(1);
                        wizard.getSpell().add(sword);
                        System.out.println("You have the fang of the Basilisk");
                        GameLogic.anythingToContinue();}
            }} else if (accuracy <= wizard.getHouse().getAccuracy() && boss.getName().equals("Peter Petigrow and Voldemort") && enemy.getName() == "Nada"){
            for (int i=0; i<wizard.getSpell().size(); i++) {
                if (wizard.getSpell().get(i).getName().equals("Accio")) {
                    if (wizard.getSpell().get(i).getCounter() > 0) {
                        wizard.getSpell().get(i).setCounter(wizard.getSpell().get(i).getCounter() - 50);
                    }
                    if (wizard.getSpell().get(i).getCounter() <= 0) {
                        System.out.print("You have reached the portkey and you used it");
                        boss.setHp(-10);
                    } else {
                        System.out.print("The portkey is " + wizard.getSpell().get(i).getCounter() + "m away from you !");
                    }
                    GameLogic.anythingToContinue();
                }
            }
        }else if (accuracy > wizard.getHouse().getAccuracy() && boss.getName() ==  "Nothing") {
            System.out.print("You failed your attack.");
            wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
            System.out.print("\n" + enemy.getName() + " is attacking.");
            GameLogic.anythingToContinue();
        }else if(accuracy > wizard.getHouse().getAccuracy() && enemy.getName() == "Nada") {
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
            wizard.setHp((int) (wizard.getHp() - enemy.getDamage() * wizard.getHouse().getResistance()));
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
    public static void Expelliarmus (Boss boss, Wizard wizard){
        double accuracy = Math.random() * (101 - 1);
        if (accuracy <= wizard.getHouse().getAccuracy() && wizard.getStun() == 0){
            wizard.setStun(2);
            System.out.println("You stunned " +  boss.getName() + ".");
            GameLogic.anythingToContinue();
        } else if (accuracy <= wizard.getHouse().getAccuracy() && wizard.getStun() != 0) {
            System.out.println(boss.getName() + " are already stunned.");
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
