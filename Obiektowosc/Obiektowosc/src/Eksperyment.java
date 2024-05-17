public class Eksperyment {
    public static void main(String[] args) {
        String[] tab = new String[10];

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        System.out.println(tab[3]);
        System.out.println(tab[4]);
        System.out.println(tab[5]);

        Client c = new Client();
       // c.address = new Address();
        c.address.no = 30;
        System.out.println(c.address.no);

        Client client = new Client();
        client.name = "Michał";
        client.powiedzImie();



    }
}
