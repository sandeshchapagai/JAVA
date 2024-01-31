
class  games{
    public  void play(){
        System.out.println("The games");
    }
}
class football extends  games {
    public void play() {
        System.out.println("I like football");
    }
}
class volleyball extends  games{
    public  void play(){
        System.out.println("I like volleyball");
    }
}
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");
       games myobj = new football();
       games myobj1 = new volleyball();
       games myobj2 = new games();
        myobj.play();
        myobj1.play();
        myobj2.play();
    }
}