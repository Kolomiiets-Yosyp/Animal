public class Fish extends Animal implements Eat{
    public Fish(String view, String color) {
        super(view, color);
    }

    public class Inhabitat{
        private String habitat;

        public Inhabitat(String habitat) {
            this.habitat = habitat;
        }
        public void live(){
            System.out.println("fish lives in "+ habitat);
        }
    }

    class Entity{
        private static int count= 0;

        public Entity() {
            new Counter().setCount();
        }

        public static int getCount() {
            return count;
        }

        private static class Counter{
            private void setCount(){
                count =count+ 1;
            }
        }
    }
    @Override
    public void sayHello() {
        System.out.println("Fish don`t say :) ");
    }

    @Override
    public void eat() {
        System.out.println(" Fish eat algae and fish ");
    }


}
