public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish("Shark","Dark-blue");
        Fish fish1 = new Fish("Whale","Dark-blue, white");
        Fish fish2 = new Fish("Amur","White");
        Fish fish3 = new Fish("Piranha","Red-blue");
       fish.sayHello();
       fish.eat();
        Fish.Inhabitat fishHab = fish.new Inhabitat("water bodies");
        fishHab.live();

        System.out.println("\n------------------------------");

        System.out.println("Entity: "+ Fish.getCount());
    }
}