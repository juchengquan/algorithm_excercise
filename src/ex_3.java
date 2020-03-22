import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.SortedMap;

public class ex_3 {
    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        if (a==b && b==c) {
            StdOut.println("equal");
        } else {
            StdOut.println("not equal");
        }

    }
}