package classes;

public class Ters {  int x;
    int y;
    int somar(){
        return x + y;
    }
    public static void main(String args[]) {
        Ters novaSoma = new Ters();
        novaSoma.x = 10;
        novaSoma.y = 5;



        System.out.println("Sum of x+y = " + novaSoma.somar() );
    }
}
