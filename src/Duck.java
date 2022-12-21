public class Duck extends Animal implements Flyable{

    public String sound(){
        return"quack";
    }
    public void dive(){
        System.out.println("jom jom");
    }

    @Override
    public void fly() {
        System.out.println("pb pb");
    }

    @Override
    public void glide() {
        System.out.println("few feww");
    }

    public void clean(Animal animal){
        System.out.println(this.toString()+"is cleaning"+animal.toString());
    }
}
