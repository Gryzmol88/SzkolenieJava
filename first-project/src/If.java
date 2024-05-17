public class If {
    public static void main(String[] args) {
        int a = 6;
        boolean b = true;

        if(a == 5) {
            System.out.println("To jest 5!!!");
        } else if (a == 6 || a > 35 ) {
            System.out.println("To jest 6!!!");
        } else if (a == 7){
            System.out.println("To jest 7");
        }else{
            System.out.println("NIC NIE PASUJE");
        }

        System.out.println("Koniec programu!!!");


    }
}
