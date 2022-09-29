public class RunTicTacToe {
    public static void main(String[] args) {
        TicTacToeField newGame = new TicTacToeField();
        TicTacTorSpielzug newRound = new TicTacTorSpielzug();
        Mitspieler playerA = new Mitspieler(IO.readString("Wie heißt der erste Spieler?"));
        Mitspieler playerB = new Mitspieler(IO.readString("Wie heißt der zweite Spieler?"));
        TicTacToeField.showField();
    }
}
