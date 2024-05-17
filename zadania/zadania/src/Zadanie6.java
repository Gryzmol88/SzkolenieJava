public class Zadanie6 {
    /*
    Wypisz kolejne liczby startując od 1 ( każda w innym wierszu) do 100.
    jeśli liczba jest podzielna przez 3 to dopisz Fizz
    jeśli liczba jest podzielna przez 5 pdopisz Buzz
    jeśli jest podzielna przez 3 i 5 jednocześnie to dopisz Fizz Buzz
     */
    public static void main(String[] args) {

        for(int liczba = 1; liczba <= 100; liczba++){
            System.out.print(liczba + "\t");

            if(liczba % 3 == 0){
                System.out.print(" Fizz");
            }
            if(liczba % 5 == 0){
                System.out.print(" Buzz");
            }
            System.out.println();
        }


    }
}
