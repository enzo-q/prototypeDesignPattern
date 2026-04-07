public class AnimalRegistry {
    private Sheep sheep = new Sheep();
    private Cow cow = new Cow();
    private Horse horse = new Horse();

    public Animal createSheep(String name) {
        Sheep clone = (Sheep) sheep.clone();
        clone.setName(name);
        return clone;
    }

    public Animal createCow() { 
        return cow.clone(); 
    }

    public Animal createHorse() { 
        return horse.clone(); }
}