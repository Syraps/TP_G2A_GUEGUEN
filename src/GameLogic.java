import java.util.Scanner;
public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    public static int readInt(String prompt, int userChoices){
        int input;

        do{
            System.out.println(prompt);
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e) {
                input = -1;
                System.out.println("Entrez un chiffre s'il vous plaît !");
            }
            }while(input < 1 || input > userChoices);
            return input;
        } public static void clearConsole(){
        for(int i = 0; i < 100; i++)
            System.out.println();
    }
    public static void printSeparator(int n){
        for (int i = 0;i < n; i++)
            System.out.print("-");
        System.out.println();
    }
    public static void printHeading(String title){
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }
    public static void anythingToContinue() {
        System.out.println("\nAppuyez sur Entrée pour continuer...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
    //public static void heal(){
        //if (Wizard.getHouse().getName()== "Hufflepuff")
      //  { Wizard.getHp() = Wizard.getHp() + Potion.getBonus();}

    }
    //}
