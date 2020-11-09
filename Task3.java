//-----------------------------------------------Hassan Hameed P176157 Section A-------------------------------------

public abstract class Animal {

    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("This animal walk by " + legs + " legs.");
    }

    public abstract void eat();
}

public class Cat extends Animal implements Pet {
    private String catName;

    public Cat() {
        this("");
    }

    public Cat(String name) {
        super(4);
        catName = name;
    }

    public void eat() {
        System.out.println("Cat eat fishes");
    }

    public String getName() {
        return catName;
    }

    public void setName(String name) {
        catName = name;
    }

    public void play() {
        System.out.println("Dont play");
    }
}

public class Fish extends Animal implements Pet {

    public Fish() {
        super(0);
    }

    private String fishName;

    // Override
    public void eat() {
        System.out.println("Fish eat plants");
    }

    public String getName() {
        return fishName;
    }

    public void setName(String name) {
        fishName = name;
    }

    public void play() {
        System.out.println("Dont play");
    }

    // @Override
    public void walk() {
        System.out.println("Fish has no legs.");
    }
}

public class Spider extends Animal {
    public Spider() {
        super(8);
    }

    public void eat() {
        System.out.println("Spider eat insects");
    }
}

public interface Pet {
    public String getName();

    public void setName(String name);

    public void play();
}

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet pol = new Cat();
        d.setName("Dolfan");
        d.eat();
        System.out.println("This fish's name is" + d.getName());
        d.walk();
        c.eat();
        System.out.println("This fish's name is" + c.getName());
        c.walk();
        ((Fish) a).setName("Shark");
        ((Fish) a).eat();
        System.out.println("This fish's name is" + ((Fish) a).getName());
        ((Fish) a).walk();
        ((Spider) e).eat();
        ((Spider) e).walk();
        ((Cat) pol).setName("Hassy");
        ((Cat) pol).eat();
        System.out.println(" name is" + ((Cat) pol).getName());

        ((Cat) p).walk();
    }
}
