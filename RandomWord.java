import edu.princeton.*;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main(String[] args) {
        //Initialize string 
        String champion = null ;
        //Initialize counter
        int i = 0;
        //While loop to read the input
        while (!StdIn. isEmpty ()) {
            String currentMethod = StdIn.readString();
            i++;
        
        if (StdRandom.bernoulli(1.0/i)) {
            champion = currentMethod;
        }
    if (champion != null) {
        System.out.println(champion);
    }
    }
    }
}
