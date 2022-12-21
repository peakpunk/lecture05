public class Owl extends Animal implements Flyable {
    public String sound(){
        return "hook hook";
    }

    @Override
    public void fly() {
        System.out.println("pb pb");
    }

    @Override
    public void glide() {
        System.out.println("few feww");
    }
}
