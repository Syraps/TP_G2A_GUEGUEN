public class SortingHat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public SortingHat (String name) {
        this.name = name;
    }
    public static House chooseHouse(){
        double var = Math.random() * (5 - 1);
        House chooseHouse = null;
        if (var <= 1){
            System.out.print("Gryffindor");
            chooseHouse = new House("Gryffindor", 0.75f, 1.0f, 1.0f, 1.5f);
        } else if ( var <= 2){
            System.out.print("Slytherin");
            chooseHouse = new House("Slytherin", 0.75f, 1.0f, 1.5f, 1.0f );
        } else if ( var <= 3){
            System.out.print("Ravenclaw");
            chooseHouse = new House("Ravenclaw", 0.9f, 1.0f, 1.0f, 1.0f );
        } else if (var <= 4) {
            System.out.print("Hufflepuff");
            chooseHouse = new House("Hufflepuff", 0.75f, 1.5f,1.0f,1.0f );

        }
        return chooseHouse;
    }
}