package DailyCoding.DailyCodingProblem;

/*
Problem:

A typical American-style crossword puzzle grid is an N x N matrix with black and white squares, which obeys the following rules:

Every white square must be part of an "across" word and a "down" word.
No word can be fewer than three letters long.
Every white square must be reachable from every other white square.
The grid is rotationally symmetric (for example, the colors of the top left and bottom right squares must match).
Write a program to determine whether a given matrix qualifies as a crossword grid.


Design :
- N * N matrix.
- black , white square
    - white : part of an across and down word
     - word length > 3
     - every white space is connected
     - rotationally symmetric grid

===
- method
    - input : matrix( 2D array)
    - output : boolean
    - check rules of matrix

       1.
       - rotationally symmetric grid
            -> check 1 position and rotation match position
               -> arr[0][0] - arr[1][0] - arr[2][0] ... - arr[n][0]
               -> arr[n][n] - arr[n-1][n] - arr[n-2][n] ... - arr[0][n]

               -> arr[0][1] - arr[1][1] - arr[2][1] ... - arr[n][1]
               -> arr[0][n-1] - arr[1][n-1] - arr[2][n-1] ... - arr[n][n-1]

               -> arr[0][0] - arr[0][1] - arr[0][2] ... - arr[0][n]
               -> arr[n][n] - arr[n][n-1] - arr[n][n-2] ... - arr[n][0]

        2.
       - white space is connected
            -> check connection
                -> check up/down/left/right
                -> one of them is white, it is connected.
                    -> if it is connected, it has to be longer than 3
            -> check total number of white / total number of connected white

       3. check length of connected.
            -> loop
                 -> check up/down/left/right
                    -> check again until length is larger than 3
                 -> check cross / down

 */



public class crossword {
    public static void main(String args[]){


    }

}
