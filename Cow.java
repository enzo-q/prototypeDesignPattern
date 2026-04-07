public class Cow implements Animal {
    private Integer legs = 4; 
    private String sound = "Moo"; 
    private String food = "Grass";

    public Animal clone() {
        try { return (Animal) super.clone(); } catch (Exception e) { return null; }
    }
    public void makeSound() { System.out.println(sound); }
    public String getType() { return "Cow"; }
    
    // Properties accessible only via Concrete Reference
    public String getFood() { return food; }
    public Integer getLegs() { return legs; }
}