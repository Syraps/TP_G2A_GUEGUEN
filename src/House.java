public class House {
    private String name;
    private float resistance;
    private float potionF;
    private float spellF;
    private float accuracy;

    public String getName(){
        return name;
    }
    public void setName(String name){

        this.name = name;
    }
    public House (String name, float accuracy, float potionF, float spellF, float resistance){
        this.name = name;
        this.accuracy = accuracy;
        this.potionF = potionF;
        this.spellF = spellF;
        this.resistance = resistance;
    }

    public float getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

    public float getSpellF() {
        return spellF;
    }

    public void setSpellF(float spellF) {
        this.spellF = spellF;
    }

    public float getPotionF() {
        return potionF;
    }

    public void setPotionF(float potionF) {
        this.potionF = potionF;
    }

    public float getResistance() {
        return resistance;
    }

    public void setResistance(float resistance) {
        this.resistance = resistance;
    }
}
