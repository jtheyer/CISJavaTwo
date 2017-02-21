/**
 * Use inheritance for pet petdog and petcat. 
 * @author 55heyerjt01
 */
package Week4;

public abstract class C11Pet {
    private String petName;
    public abstract String speak();

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "C11Pet{" + "petName=" + petName + '}';
    }
}
