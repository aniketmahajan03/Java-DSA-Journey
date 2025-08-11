// Abstract class
// Just make only one's abstract class and use it multiple
// time know as abstraction
abstract class Media {
   abstract void play(); 
}

// Override doing same work but with its different features or Paramaters
class Music extends Media {
    @Override 
    void play() {
        System.out.println("Playing Music...");
    }
}

// Vedio class 
class Vedio extends Media {
    @Override
    void play() {
        System.out.println("Playing Vedio...");
    }
}

// Main class 
public class OOP {
    public static void main(String args[]) {
        Media myMusic = new Music();
        Media myVedio = new Vedio();

        myMusic.play(); //Playing Music...
        myVedio.play(); //Playing Vedio...
    }
}