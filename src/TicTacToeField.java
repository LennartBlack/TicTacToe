public class TicTacToeField {
    static String[][] field = new String[3][3];


    public static void showField(){
        IO.println("  0 1 2 ");
        IO.println("-------+");
        IO.println("0|" + field[0][0] + "|" + field[0][1] + "|" + field[0][2] + "|");
        IO.println("-------+");
        IO.println("1|" + field[1][0] + "|" + field[1][1] + "|" + field[1][2] + "|");
        IO.println("-------+");
        IO.println("2|" + field[2][0] + "|" + field[2][1] + "|" + field[2][2] + "|");
        IO.println("-------+");

    }
}
