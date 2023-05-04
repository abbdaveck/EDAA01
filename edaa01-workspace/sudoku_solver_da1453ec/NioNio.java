import java.util.Arrays;

public class NioNio {
public static void main(String[] args){
    /**
    int[][] board2 = {  
        { 1, 2, 0,   0, 7, 0,    0, 0, 0 },
        { 6, 0, 0,   1, 9, 5,    0, 0, 0 }, 
        { 0, 9, 8,   0, 0, 0,    0, 6, 0 },

        { 8, 0, 0,   0, 6, 0,    0, 0, 3 }, 
        { 4, 0, 0,   8, 0, 3,    0, 0, 1 },
        { 7, 0, 0,   0, 2, 0,    0, 0, 6 }, 

        { 0, 6, 0,   0, 0, 0,    2, 8, 0 },
        { 0, 0, 0,   4, 1, 9,    0, 0, 5 }, 
        { 0, 0, 0,   0, 8, 0,    0, 7, 9 } 
        };
    int[][] board3 = {  
        { 0, 0, 8,   0, 0, 9,    0, 6, 2 },
        { 0, 0, 0,   0, 0, 0,    0, 0, 5 }, 
        { 1, 0, 2,   5, 0, 0,    0, 0, 0 },

        { 0, 0, 0,   2, 1, 0,    0, 9, 0 }, 
        { 0, 5, 0,   0, 0, 0,    6, 0, 1 },
        { 6, 0, 0,   0, 0, 0,    0, 2, 8 }, 

        { 4, 1, 0,   6, 0, 8,    0, 0, 0 },
        { 8, 6, 0,   0, 3, 0,    1, 0, 0 }, 
        { 0, 0, 0,   0, 0, 0,    4, 0, 0 } 
        };

    int[][] board4 = {  
        { 5, 4, 8,   1, 7, 9,    2, 6, 2 },
        { 3, 7, 6,   8, 2, 4,    9, 1, 5 }, 
        { 1, 9, 2,   5, 6, 3,    8, 7, 4 },

        { 7, 8, 4,   2, 1, 6,    5, 9, 3 }, 
        { 2, 5, 9,   3, 8, 7,    6, 4, 1 },
        { 6, 3, 1,   9, 4, 5,    7, 2, 8 }, 

        { 4, 1, 5,   6, 9, 8,    2, 3, 7 },
        { 8, 6, 7,   4, 3, 2,    1, 5, 9 }, 
        { 9, 2, 3,   7, 5, 1,    4, 8, 6 } 
        };
         */
                    
    int[][] board= {   { 1, 2, 3,   10, 11, 12,    19, 20, 21 },
                        { 4, 5, 6,   13, 14, 15,    22, 23, 24 }, 
                        { 7, 8, 9,   16, 17, 18,    25, 26, 27 },

                        { 28, 29, 30,   37, 38, 39,    46, 47, 48 }, 
                        { 31, 32, 33,   40, 41, 42,    49, 50, 51 },
                        { 34, 35, 36,   43, 44, 45,    52, 53, 54 }, 

                        { 55, 56, 57,   64, 65, 66,    73, 74, 75 },
                        { 58, 59, 60,   67, 68, 69,    76, 77, 78 }, 
                        { 61, 62, 63,   70, 71, 72,    79, 80, 81 } 
                    };
        if (checkBox(4, 8, 50, board) )
        {
            System.out.println("Not found");
        }
        else{
            System.out.println("Found");
        }
    }
    
    static boolean checkBox(int row, int col, int digit, int[][] board){       //Kollar om siffran finns i sin kringliggande box
            
        int[][] reformatArr = new int[9][9];                    //Gör om arrayen så alla värden i första "kvadranten" hamnar
        int count = 0;                                          //i första listan av nio
            for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    int[] tempArr = new int[9];

                    tempArr[0] = board[0 + j*3][0 + i*3];
                    tempArr[1] = board[0 + j*3][1 + i*3];
                    tempArr[2] = board[0 + j*3][2 + i*3];

                    tempArr[3] = board[1 + j*3][0 + i*3];
                    tempArr[4] = board[1 + j*3][1 + i*3];
                    tempArr[5] = board[1 + j*3][2 + i*3];

                    tempArr[6] = board[2 + j*3][0 + i*3];
                    tempArr[7] = board[2 + j*3][1 + i*3];
                    tempArr[8] = board[2 + j*3][2 + i*3];
                    reformatArr[count] = tempArr;
                    count++;
                }
            }
            
            count = 0;
            boolean found = false;
            for (int i = 0; i < 3 && !found; i++) {             //Räknar ut i vilken kvadrant koordinaten ligger i 
                for (int j = 0; j < 3 && !found; j++) {
                    if (row < 3 + 3*i){
                        if (col < 3 + 3*j){
                            found = true;
                        }
                    }
                    count++;
                }
            }
            // if (count > 4){
            //     System.out.println("Catch");
            // }
            if (!contains(reformatArr[count-1], digit)){         //Kollar om kvadranten innehåller siffran vi vill stoppa in 
                return true;
            }else{
                return false;
            }
    }
    
    private static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}
