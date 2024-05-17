import java.util.Random;

public class Zadanie7 {
    /*
    Napisz program generujący tablice 10 liczb losowych
    każdaa liczba w tablicy jest nie mniejsza niż poprzeczna.
    na koncu wypisz tablice
     */
    public static void main(String[] args) {

        int[] tab  = new int[10];
        Random losowacz = new Random();

        for(int indeks = 0; indeks < 10; indeks++){

            if(indeks == 0){
                tab[indeks] = losowacz.nextInt(tab[indeks],99);
            }else{
                tab[indeks]  = losowacz.nextInt(tab[indeks - 1],99);
            }

        }

        for(int element : tab){
            System.out.println(element);
        }

    }
}
