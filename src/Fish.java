public class Fish extends Animal{
    public Fish(String view, String color) {
        super(view, color);
    }

    @Override
    public void sayHello() {
        System.out.println("Fish don`t say :) ");
    }

}
