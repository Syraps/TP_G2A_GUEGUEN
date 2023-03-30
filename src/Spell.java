public class Spell extends AbstractSpell {
    public Spell(String name) {
        super(name);
    }
   private Spell WinLev(){
        int accuracy = (int) (Math.random() +(1 - 0));
        System.out.print("You lifted an object, Would you like to put it in position:\n(1) \n(2) \n(3) \n(4) \n(5)");
            int place = GameLogic.readInt("->", 5);
            if (place == Enemy.getPosition()) {
                System.out.print("your object is up the head of an enemy, You drop it");
                GameLogic.anythingToContinue();
                Enemy.setHp(Enemy.getHp() - 25);
                return WinLev();
            }else{
                System.out.print("your object dropped on nothing");
                GameLogic.anythingToContinue();
                return WinLev();
            }



    }
}
