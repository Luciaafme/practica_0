public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int r = 0; r < chessboard.length; r++) {
         for (int c = 0; c < chessboard.length; c++) {
            if ((r + c) % 2 == 0) {
               chessboard[r][c] = '\u25A1';
            } else {
               chessboard[r][c] = '\u25A0';
            }
         }
      }
      for (char[] row : chessboard) {
         for (char square : row) {
            System.out.print(square);
         }
         System.out.println();
      }
   }
}