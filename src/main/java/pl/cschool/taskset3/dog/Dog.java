package pl.cschool.taskset3.dog;

import java.util.Objects;

public class Dog {
    private String name;
    private String breed;
    private int birthYear;

    public Dog(String name, String breed, int birthYear) {
        this.name = name;
        this.breed = breed;
        this.birthYear = birthYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return birthYear == dog.birthYear &&
                Objects.equals(name, dog.name) &&
                Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, breed, birthYear);
    }

    /*
   	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + birthYear;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	*/

    @Override
    public String toString() {
        return "Dog{" +
                "name: " + name +
                ", breed: " + breed +
                ", birthYear: " + birthYear +
                '}';
    }
}
