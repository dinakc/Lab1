public class Creature {

    // ---- Fields ----
    private String name;
    private int size;

    // ---- Constructor ----

    /**
     * Creates a Creature with a name and size.
     * @param name Name of the creature.
     * @param size Size of the creature.
     */
    public Creature(String name, int size) {
        this.name = name;
        this.size = size;
    }

    // ---- Methods ----

    /**
     * Creature speaks.
     */
    public void talk() {
        System.out.println(name + " says: Hello!");
    }

    /**
     * Creature eats something.
     * @param food The food the creature will eat.
     */
    public void eat(String food) {
        System.out.println(name + " eats " + food + ".");
    }

    /**
     * Creature moves around.
     */
    public void move() {
        System.out.println(name + " is moving around.");
    }

    /**
     * Main method showing the Creature in action.
     * @param args Command line arguments (unused).
     */
    public static void main(String[] args) {
        Creature c = new Creature("Fluffy", 5);
        c.talk();
        c.eat("berries");
        c.move();
    }
}