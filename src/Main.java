import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FishNemo fishNemo= new FishNemo("Nemo","Orange-white","Nemo");
    fishNemo.sayHello();
    fishNemo.eat();
    FishDori fishDori=new FishDori("Dory","Blue-black-yellow","Dori");
    fishDori.sayHello();

    Fish fish= new Fish("Shark", "Blue-wite");



        System.out.println(fish.Home()+"\n-----------------");



    BirdRed birdRed[]={
            new BirdRed("Red Cardinal","Blue","RED"),
        new BirdRed("Red Cardinal","Red","RED"),
        new BirdRed("Red Cardinal","Yellow","RED"),
    };
        Arrays.sort(birdRed);

            System.out.println(Arrays.toString(birdRed));

//    birdRed.sayHello();



    }
}