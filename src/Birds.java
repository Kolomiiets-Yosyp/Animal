public class Birds extends Animal{
    public Birds(String view, String color) {
        super(view, color);
    }

    @Override
    public void sayHello() {
        System.out.println("I`m bird!");
    }


}
