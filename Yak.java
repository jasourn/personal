public class Yak extends AnimalTest {

    private double strength;
    private boolean hasChildren;
    private int hunger;

    public Yak() {
    }

    public Yak(String name, int age, double weight, String sound, double strength, boolean hasChildren, int hunger) {
        super(name, age, weight, sound);
        this.strength = strength;
        this.hasChildren = hasChildren;
        this.hunger = hunger;
    }

    public double getStrength() {
        return this.strength;
    }

    public void setStrength() {
        this.strength = strength;
    }

    public boolean getHasChildren() {
        return this.hasChildren;
    }

    public void setHasChildren() {
        this.hasChildren = hasChildren;
    }

    public int getHunger() {
        return this.hunger = hunger;
    }

    public void setHunger() {
        if (hunger < 0) {
            this.hunger = 0;
        }
        else {
            this.hunger = hunger;
        }
    }

    public String isTraveling() {
        return name + " is traveling";
    }

    @Override
    public String makeSound() {
        return getName() +name+ " makes a sound: " +getSound();
    }
    @Override
    public String toString() {
        return "Animal{" + "\n" +
                "name=" + name + "\n" +
                "age=" + age + "\n" +
                "weight=" + weight + "\n" +
                "sound=" + sound + "\n" +
                '}';
    }
}