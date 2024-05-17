public class For {
    public static void main(String[] args) {
        int[] tab = new int[1000];
       for(int i = 0, j = 10, z = 15; i < 10; i++, j = j * 2) { //sygnatura pętli
           //System.out.println(i);
          // System.out.println(j);
       }
        for(int a = 0, j = 2; a < 1000; a++, j = j + 2) {
            tab[a] = j;
           // System.out.println(tab[a]);
        }
        for(int element : tab){//for each agregatem jest tab
            System.out.println(element);
        }
    }
}
