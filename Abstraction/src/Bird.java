public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Bird!~~Bird!!");
    }

    @Override
    public void breathe() {
        System.out.println("Beeee BBBBeeee");
    }

    public abstract void fly();

}

