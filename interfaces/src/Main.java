abstract class Game{
public  abstract void  print();
}

class  Football extends  Game {

    @Override
    public void print() {
        System.out.println("k xaaa");
    }
}

class  Main{
    public static   void main(String[] args){
        Football myGame = new Football();
        myGame.print();
    }
}