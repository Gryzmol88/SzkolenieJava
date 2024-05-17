import java.util.Random;

public class Zadanie2 {
    /*
    Wygeneruj tablice losowych liczb (1000)
    i wyswietl z tej tablixy co drugą liczbę ale jeżeli jest podzielna przez
    3
     */
    public static void main(String[] args) {
        Random losowacz = new Random();
        int[] tab = new int[1000];

        for (int i = 0; i < 1000; i++){

           // tab[i] = losowacz.nextInt(0, 101);

        }
       int count =0;
        for(int i = 0;  i < tab.length; i = i + 2){
            if(tab[i] % 3 ==0){
                System.out.println(tab[i]);
                count++;
            }
        }
        System.out.println("Ilość znalezionych liczby: " + count);

    }
}
