public class chess {
    public static void main(String args[]){
       queen q = new queen ();
       q.moves();
       king k = new king ();
       k.moves();
       knight kn = new knight ();
       kn.moves();
       bishop b = new bishop ();
       b.moves();
       rock r = new rock ();
       r.moves();
       pawn p = new pawn ();
       p.moves();
    }
}
interface chessplayer {
    void moves();
}
class queen implements chessplayer {
    public void moves() {
        System.out.println("quen moves . left , right , cross ");   
    }
}
class king implements chessplayer {
    public void moves() {
        System.out.println("king moves . left , right , cross only one moves");   
    }
}
class knight implements chessplayer {
    public void moves() {
        System.out.println("knight moves in L  ");   
    }
}
class bishop implements chessplayer {
    public void moves() {
        System.out.println("bishop moves in X direction ");   
    }
}
class rock implements chessplayer {
    public void moves() {
        System.out.println("rock moves in + direction ");   
    }
}
class pawn implements chessplayer {
    public void moves() {
        System.out.println("pawn moves 1 step and kill in cross 1 step ");   
    }
}