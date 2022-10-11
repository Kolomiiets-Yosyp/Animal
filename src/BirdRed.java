public class BirdRed extends Birds{
    public static String name;

    public BirdRed(String view, String color,String name) {
        super(view, color);
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void sayHello() {
        System.out.println("Hi i`m "+ getView()+" my name \""+getName()+"\" my color is "+ getColor());
    }

}
