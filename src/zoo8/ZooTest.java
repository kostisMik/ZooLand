package zoo8;

import animals.Animal;
import java.util.ArrayList;
import java.util.List;
import zoo8.Crocodile;

public class ZooTest {

    public static void main(String[] args) {
        Crocodile croco = new Crocodile();
        //croco.play();
        croco.toString();
        //System.out.println(croco);
        Animal a1 = new Animal("Dogy", 13);
        Animal a2 = new Animal("Caty", 18);
        Animal a3 = new Animal("Frogy", 15);
        a3.setAge(30);

//System.out.println("Frogy is age "+ a3.getAge());
        List<Animal> animals = new ArrayList();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);

        Animal tempAnimal = Animal.getOldestAnimal(animals);
        //System.out.println("Oldest animal is " + tempAnimal);

        Crocodile c1 = new Crocodile("Croco1", 14);
        Crocodile c2 = new Crocodile("Croco2", 16);
        Crocodile c3 = new Crocodile("Croco3", 34);
        List<Crocodile> crocos = new ArrayList();
        crocos.add(c1);
        crocos.add(c2);
        crocos.add(c3);
        Crocodile tempCrocodile = Animal.getOldestCrocodile(crocos);

        Animal crocodile = new Crocodile();
        Animal lion = new Lion();
        Animal zebra = new Zebra();
        Animal tiger = new Tiger();

        List<Animal> animals2 = new ArrayList();
        animals2.add(lion);
        animals2.add(crocodile);
        animals2.add(zebra);
        animals2.add(tiger);

        for (Animal a : animals2) {
            a.play();
        }

        Zebra z = new Zebra();
        z.zebraMethod();

        Animal a10 = z;
        a10.play();

    }

}
