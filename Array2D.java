public class Array2D{
        public static void main (String [] args){
            int x = 7, y = 6;
            int[][] board =  new int[y][x];
            for(int i = 0; i<y;i++){
                for(int a = 0; a<x;a++){
                    board[i][a] = (i + 1) * (a + 1) ;
                }
            }

            for(int i = 0; i<y;i++){
                for(int a = 0; a<x;a++){
                    System.out.print (board[i][a]+" ");
                }
                System.out.println();
            }
        }
    }