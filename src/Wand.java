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
    public void Wizard (){
    System.out.print("A wand will choose its owner");
    //for
    System.out.println(" 1. PHOENIX_FEATHER\n 2.DRAGON_HEARTSTRING\n 3.UNICORN_TAIL_HAIR\n 4.BASILISK_HORN\n 5.THUNDERBIRD_TAIL_FEATHER");
    }}
