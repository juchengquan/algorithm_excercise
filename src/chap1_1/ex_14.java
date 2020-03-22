package chap1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ex_14 {
    public static void main(String[] args) {

    int N = StdIn.readInt();

    int out = lg(N);

    StdOut.println(out);
    }

    public static int lg(int N) {
        int flag = 0;
        for (int i=0; i<N; i++) {
            if (2<<i > N) {
                flag = i;
                break;
            }
        }
        return flag;
    }

}