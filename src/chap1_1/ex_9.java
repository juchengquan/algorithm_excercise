package chap1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex_9 {
    public static void main(String[] args) {
        String s = "";

        int N  = StdIn.readInt();
        for (int n = N; n > 0; n/= 2) {
            s = (n % 2) + s;
        }

        StdOut.println(s);
    }
}