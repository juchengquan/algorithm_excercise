package chap1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

public class ex_11 {
    public static void main(String[] args) {

        boolean[][] arr = new boolean[4][4];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                double num = StdRandom.uniform();
                if (num > 0.5) {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }
        printBoolArr(arr);
    }

    public static void printBoolArr(boolean[][] arr) {

        StdOut.print("  ");
        for (int i = 0; i < arr[0].length; i++) {

            StdOut.print(i + " ");
        }
        StdOut.println();
        for (int i = 0; i < arr.length; i++) {
            StdOut.print(i + " ");
            for (int j = 0; j < arr[i].length; j++) {
                StdOut.print(arr[i][j] ? "* " : "  ");
            }
            StdOut.println();
        }
    }

}