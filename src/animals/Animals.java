package animals;

public abstract class Animals {
    public String makeapackage ;

    public static class Tiger extends Animal {
        @Override
        public String makeSound() {
            return "Tiger: roarrrrr!";
        }
    }


}