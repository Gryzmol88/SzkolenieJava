public class Tablice {
    public static void main(String[] args) {
        String[] imiona = new String[1000]; //Elementy w tablicy są uporzadkowane (mają swoją konkretną pozycje index)
        int[] liczba = new int[100];
        double[] liczbaZmiennoprzecinkwe = new double[10];

        imiona[0] = "Mateusz";
        imiona[100] = "Janusz";
        imiona[49] = "Karol";

        System.out.println(imiona[0]);
        System.out.println(imiona[50]);

        System.out.println(imiona.length);

       /* Dłuży komentarz
        blokow */

        int[] tablica = {1,22,4,55,667,4};



        int[] tab = new int[5];
        int[][] tab2 = new int[5][10];

        int[][][] tab3D = new int[3][3][3];

        tab3D[2][3][3] = 44;



    }
}
