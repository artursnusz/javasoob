package multidemsion_array;

// Java Program to Find the Sum of Diagonals of a Matrix

// Importing input output classes
import java.io.*;

// Main Class
public class GFG {

    // Method 1
    // To calculate Sum of Diagonals
    static void Sum_of_Diagonals(int[][] matrix, int N)
    {

        // Declaring and initializing two variables to zero
        // initially for primary and secondary diagonal
        // count
        int Pd = 0, Sd = 0;

        // Two Nested for loops for iteration over a matrix
        // Outer loop for rows
        for (int k = 0; k < N; k++) {
            // Inner loo pfo columns
            for (int l = 0; l < N; l++) {

                // Condition for the principal
                // diagonal
                /*if (k == l)
                    Pd = Pd * matrix[k][l] ;

                // Condition for the secondary diagonal
                if ((k + l) == (N - 1))

                    Sd += matrix[k][l];*/
                if(k%N==1) {
                    Pd = Pd + matrix[k][l];
                }
                if(l%N==1) {
                    Sd = Sd + matrix[k][l];
                }
            }
        }

        // Print and display the sum of primary diagonal
        System.out.println("Sum of Principal Diagonal:"
                + Pd);
        // Print and display the sum of secondary diagonal
        System.out.println("Sum of Secondary Diagonal:"
                + Sd);
    }

    // Method 2
    // Main driver method
    static public void main(String[] args)
    {

        // Input integer array
        // Custom entries in an array
        int[][] b = { { 2, 2, 2},
                    { 3, 44, 44},
                    { 1, 22, 3}};

        // Passing the array as an argument to the function
        // defined above(Method1-to compute sum of
        // diagonals)
        System.out.println(b.length);
        Sum_of_Diagonals(b, 3);
    }
}
