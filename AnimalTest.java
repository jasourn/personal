
public class AnimalTest {

	// Attributes for (make sure all is private) name, age, weight, and sound(String)
	private String name;
	private int age;
	private double weight;
	private String sound;

	// Provide 2 constructors, one default with no inputs
	// to insantiate a default Animal
	// 1 That has 4 inputs to instantiate the Animal

	public AnimalTest() {

	}

	public AnimalTest(String name, int age, double weight, String sound) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.sound = sound;
	}

	// Provide getter and setters for each variable
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		
		if (age < 0) {
			this.age = 0;
		}
		else {
			this.age = age;
		}
	}

	public double getWeight() {
		return this.weight;
	}

	public String getSound() {
		return this.sound;
	}

	// Provide 4 methods below:
	// 1. return a string that the animal is eating input food
	// 2. return a string Animal is sleeping
	// 3. return a string a sound from input sound
	public String eating(String food) {
		return name + " is eating " + food + ".";
	}

	public String isSleeping() {
		return name + " is sleeping."
	}

	public String makeSound() {
		return name + " makes the sound " + sound + ".";
	}

	// toString method
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