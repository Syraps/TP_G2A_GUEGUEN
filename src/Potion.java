public class Potion {
    private int petitePotion, moyennePotion, grandePotion;
    public int getPetitePotion(){
        return petitePotion;
    }
    public int getMoyennePotion() {
        return moyennePotion;
    }
    public int getGrandePotion() {
        return grandePotion;
    }
    public void setPetitePotion(int petitePotion) {
        this.petitePotion = petitePotion;
    }
    public void setMoyennePotion(int moyennePotion) {
        this.moyennePotion = moyennePotion;
    }
    public void setGrandePotion(int grandePotion) {
        this.grandePotion =grandePotion;
    }
    public Potion (int petitePotion, int moyennePotion, int grandePotion){
        this.petitePotion = petitePotion;
        this.moyennePotion = moyennePotion;
        this.grandePotion =grandePotion;
    }
}
