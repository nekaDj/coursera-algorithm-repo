/*
 * Author : NDOUMBA Ivan
 */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double i = 1;
        String champion = "";
        while (!StdIn.isEmpty()) {
            String nextStr = StdIn.readString();
            if (StdRandom.bernoulli(1.0/i)) {
                champion = nextStr;
            }
            i++;
        }
        StdOut.println(champion);
        
    }
    
}
