package animals;

import java.util.List;
import zoo8.Crocodile;

public class Animal {

    protected String name;
    protected int age;
    protected String cage;
    static int numOfAnimalas;

    public Animal() {
        super();
        //System.out.println("Animal created");

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String cage) {
        this.name = name;
        this.age = age;
        this.cage = cage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        int age = 10;
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCage() {
        return cage;
    }

    public void setCage(String cage) {
        this.cage = cage;
    }

    public void move() {
        System.out.println("Animal is moving");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void play() {
        System.out.println("Animal is playing");
    }

    public static Animal getOldestAnimal(List<Animal> animals) {
        Animal max = animals.get(0);
        for (Animal i : animals) {
            if (i.getAge() > max.getAge()) {
                max = i;
            }
        }
        return max;
    }

    public static Crocodile getOldestCrocodile(List<Crocodile> crocos) {
        Crocodile max = crocos.get(0);
        for (Crocodile i : crocos) {
            if (i.getAge() > max.getAge()) {
                max = i;
            }
        }
        return max;
    }

    public static void sayHello() {

    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + ", cage=" + cage + '}';
    }

}
