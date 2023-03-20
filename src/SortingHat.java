public class SortingHat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static House  chooseHouse(){
        double var = Math.random() * (5 - 1);
        House chooseHouse = null;
        if (var <= 1){
            System.out.print("Gryffindor");
            chooseHouse = new House("Gryffindor");
        } else if ( var <= 2){
            System.out.print("Slytherin");
            chooseHouse = new House("Slytherin");
        } else if ( var <= 3){
            System.out.print("Ravenclaw");
            chooseHouse = new House("Ravenclaw");
        } else if (var <= 4){
            System.out.print("Hufflepuff");
            chooseHouse = new House("Hufflepuff");

        }
        return chooseHouse;
    }
}