public class Horse implements Animal {
    private Integer legs = 4; 
    private String sound = "Neigh"; 
    private String food = "Hay"; 
    private String color = "Brown";

    public Animal clone() {
        try { return (Animal) super.clone(); } catch (Exception e) { return null; }
    }
    public void makeSound() { System.out.println(sound); }
    public String getType() { return "Horse"; }
    
    // Properties accessible only via Concrete Reference
    public String getFood() { return food; }
    public Integer getLegs() { return legs; }
    public String getColor() { return color; } 
}