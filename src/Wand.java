import com.sun.glass.ui.Size;

public class Wand {
    private Core core;
    private int size;

    public Core getCore() {
        return core;
    }
    public int getSize() {
        return size;
    }

    public void setCore(Core core) {
        this.core = core;
    }
    public void setSize(int size) {
        this.size = size;
} public Wand (Core core, int size){
        this.core = core;
        this.size = size;
    }
    public Wand chooseWand(Boss boss) {
        int size = (int) (Math.random() * (20 - 10) + 10);
        double var = Math.random() * (6 - 1);
        Wand chooseWand = null;
        if (boss.getName() == "Nothing"){
            if (var <= 1) {
                chooseWand = new Wand(Core.PHOENIX_FEATHER, size);
                System.out.print("Your wand measures " + chooseWand.getSize() + "cm.\nAnd the heart of your wand is made of " + chooseWand.getCore());
            } else if (var <= 2) {
                chooseWand = new Wand(Core.DRAGON_HEARTSTRING, size);
                System.out.print("Your wand measures " + chooseWand.getSize() + "cm.\nAnd the heart of your wand is made of " + chooseWand.getCore());
            } else if (var <= 3) {
                chooseWand = new Wand(Core.UNICORN_TAIL_HAIR, size);
                System.out.print("Your wand measures " + chooseWand.getSize() + "cm.\nAnd the heart of your wand is made of " + chooseWand.getCore());
            } else if (var <= 4) {
                chooseWand = new Wand(Core.BASILISK_HORN, size);
                System.out.print("Your wand measures " + chooseWand.getSize() + "cm.\nAnd the heart of your wand is made of " + chooseWand.getCore());
            } else if (var <= 5) {
                chooseWand = new Wand(Core.THUNDERBIRD_TAIL_FEATHER, size);
                System.out.print("Your wand measures " + chooseWand.getSize() + "cm.\nAnd the heart of your wand is made of " + chooseWand.getCore());
            }
        } else if (boss.getName() == "Bellatrix Lestrange and Voldemort") {
            if (var <= 1) {
                chooseWand = new Wand(Core.PHOENIX_FEATHER, size);
            } else if (var <= 2) {
                chooseWand = new Wand(Core.DRAGON_HEARTSTRING, size);
            } else if (var <= 3) {
                chooseWand = new Wand(Core.UNICORN_TAIL_HAIR, size);
            } else if (var <= 4) {
                chooseWand = new Wand(Core.BASILISK_HORN, size);
            } else if (var <= 5) {
                chooseWand = new Wand(Core.THUNDERBIRD_TAIL_FEATHER, size);
            }

        }
        return chooseWand;
    }


    }
