public class Game {

  public static String winner(String[] deckSteve, String[] deckJosh) {
        String ranks = "23456789TJQKA";

        int pontosSteve = 0;
        int pontosJosh = 0;


        for (int i = 0; i < deckSteve.length; i++) {
            int valSteve = ranks.indexOf(deckSteve[i]);
            int valJosh = ranks.indexOf(deckJosh[i]);

            if (valSteve > valJosh) {
                pontosSteve++;
            } else if (valJosh > valSteve) {
                pontosJosh++;
            }
        }

        if (pontosSteve > pontosJosh) {
            return "Steve wins " + pontosSteve + " to " + pontosJosh;
        } else if (pontosJosh > pontosSteve) {
            return "Josh wins " + pontosJosh + " to " + pontosSteve;
        } else {
            return "Tie";
        }
    }
}