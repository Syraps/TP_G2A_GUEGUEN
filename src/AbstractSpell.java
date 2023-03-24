import javax.jws.soap.SOAPBinding;

public class AbstractSpell {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public AbstractSpell (String name){
        this.name = name;
    }
}
