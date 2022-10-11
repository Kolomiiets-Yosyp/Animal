abstract public class Animal{
    private String view;
    private String color;
    public Animal(String view, String color){
        this.view =view;
        this.color=color;
    }

    public abstract void sayHello();
    public String getColor(){
        return color;
    }
    public String getView(){
        return view;
    }
}
