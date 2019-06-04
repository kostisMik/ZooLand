package zoo8;

import animals.Animal;
import java.util.List;

public class Crocodile extends Animal {

    private int legs;

    //This constructor calls the default constructor in Animal
    //by using "super()".
    public Crocodile() {
        super();
        //System.out.println("Crocodile is created");
    }

    //This constructor calls the constructor in Animal
    //that has 2 arguments by using "super(name, age)"
    public Crocodile(String name, int age) {
        super(name, age);
    }

    public void printVariables() {
        System.out.println("name is " + name);
        System.out.println("age is " + age);
        System.out.println("cage is " + cage);
        play();
    }

    public void play() {
        System.out.println("Crocodile is playing");
    }

    public static Crocodile getOldestAnimal(List<Animal> animals) {
        Crocodile max = (Crocodile) animals.get(0);
        for (Animal i : animals) {
            if (i.getAge() > max.getAge()) {
                max = (Crocodile) i;
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

    @Override
    public String toString() {
        return super.toString() + "Crocodile{" + "legs=" + legs + '}';
    }

}
