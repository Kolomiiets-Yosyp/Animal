public class Animal {
    private String name;
    private String color;
    public Animal(String name){
        this.name=name;
    }
    public Animal(String name, String color){
        this.name=name;
        this.color=color;
    }
    public void sayHello(){
        System.out.println("Hi i'm "+ name+ " my color is "+ color);
    }
    public String getColor(){
        return color;
    }
    public String getName(){
        return name;
    }
}
