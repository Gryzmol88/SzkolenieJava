public class Zadanie4 {
    /*
    Wygeneruj macierz w której każda wartoć to wymnożony wiersz i kolumna (licząc od 1) wypisz ją na ekranie
    w poistaci kwadratu macierzy.
     */
    public static void main(String[] args) {
        int[][] tab = new int[10][10];

        for(int row =0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                tab[row][col] = (row + 1) * (col + 1);
                System.out.print(tab[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
