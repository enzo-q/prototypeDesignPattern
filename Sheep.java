public class Sheep implements Animal {
    private Integer legs = 4; 
    private String sound = "Baa"; 
    private String food = "Grass"; 
    private String name;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public Animal clone() {
        try { return (Animal) super.clone(); } catch (Exception e) { return null; }
    }
    public void makeSound() { System.out.println(sound); }
    public String getType() { return "Sheep"; }
    
    // Properties accessible only via Concrete Reference
    public String getFood() { return food; }
    public Integer getLegs() { return legs; }
}