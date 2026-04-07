public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        // --- Interface References (First set of clones) ---
        Animal sheep1 = registry.createSheep("Dolly"); 
        Animal cow1 = registry.createCow();
        Animal horse1 = registry.createHorse();

        System.out.print(sheep1.getType() + " says: ");
        sheep1.makeSound();
        
        System.out.print(cow1.getType() + " says: ");
        cow1.makeSound();
        
        System.out.print(horse1.getType() + " says: ");
        horse1.makeSound();

        System.out.println();

        Sheep sheep2 = (Sheep) registry.createSheep("Shawn"); 
        Cow cow2 = (Cow) registry.createCow();
        Horse horse2 = (Horse) registry.createHorse();

        System.out.println(sheep2.getType() + " is named " + sheep2.getName() + " and eats " + sheep2.getFood() + ".");
        System.out.println(cow2.getType() + " has " + cow2.getLegs() + " legs.");
        System.out.println(horse2.getType() + " is the color " + horse2.getColor() + ".");
    }
}