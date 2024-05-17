public class Zadanie1 {
    /*
    Wygenerowaać tablie intów od 0 do 999
    poszukać w tej tablicy wypisać tylko liczby parzyste
     */

    public static void main(String[] args) {
        int[] tab = new int[1000];

        for (int i = 0; i < 1000; i++){
            tab[i] =i;
        }

        for(int element : tab){
            if(element % 2 == 0 && element != 0){
                System.out.println(element);
            }

        }

    }
}
