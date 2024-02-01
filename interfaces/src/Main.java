import java.util.ArrayList;

class Main{
    public  static  void main(String[] args) {
        ArrayList<String> games = new ArrayList<>();
        games.add("dajksf");
        games.add("bsdakj");
        games.add("jnvsdakj");
        games.add("kjbakj");
//        games.set(2, "whats up");
//        games.set(3, "nono");
//        games.set(0, "knakjf");
        for (int i = 0; i < games.size(); i++) {
            System.out.println(games.get(i));
        }
    }
}