public class Fish extends Animal implements Eat, Sleep{
    public Fish(String view, String color) {
        super(view, color);
    }

    @Override
    public void sayHello() {
        System.out.println("Fish don`t say :) ");
    }

    @Override
    public void eat() {
        System.out.println(" Fish eat algae and fish ");
    }

    @Override
    public String Home() {
        String SleepHome= "Slepp in cave ir aquarium :)";
        return SleepHome;
    }
}
