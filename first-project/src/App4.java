public class App4 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;

        int wynik = a % b;

        System.out.println(wynik);

        double x1 = 5.5;
        double x2 = 7.7;

        System.out.println(x1 % x2);

        String s1 = "Mateusz";
        String s2 = "Mateusz";
        System.out.println(s1 + " " + s2); //Konkantenacja

        boolean wynik2 = a == b;
        System.out.println(wynik2);

        boolean b1 = true;
        boolean b2 = false;
        boolean wynik3 = b1 && b2; // AND
       // boolean wynik3 = b1 || b2; // OR
        System.out.println(wynik3);

        boolean wynik5 = !b1;

        System.out.println(wynik5);




    }
}
