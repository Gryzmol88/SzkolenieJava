public class While {
    public static void main(String[] args) {

        int i = 10;
        while(i < 10) {
            System.out.println(i);
            i++;

        }

        do {
            System.out.println(i);
            i++;
        } while(i < 10);
        System.out.println("Koniec programu!");
    }
}
