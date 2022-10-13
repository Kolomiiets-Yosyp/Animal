public class BirdRed extends Birds implements Comparable<Birds>{
    public String name;

    public BirdRed(String view, String color, String name) {
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



    @Override
    public int compareTo(Birds o) {
        if (this.getColor().compareTo(o.getColor())!=0)
            return this.getName().compareTo(o.getColor());
        else
            return CharSequence.compare(this.getColor(),o.getColor());
    }
}
