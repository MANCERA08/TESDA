interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}
class Gorilla implements Animal {
  
    @Override
    public boolean feed(boolean timeToEat) {
        //Put gorilla food into cage
        
        if (timeToEat) {
            System.out.println("Put gorilla food into cage");
        } else {
            System.out.println("Next time");
        }
        return timeToEat;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
    }

    @Override
    public void pet() {
        // pet at your own 
    }
}

public class Tasksheet129{
    public static void main(String[] args) {   
        Gorilla gorilla = new Gorilla();
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}
