public class App2 {
    public static void main(String[] args) {
        Client client = new Client();

        int suma = client.sum(4,8);

        System.out.println(suma);

        double sum1 = client.sum(2.3, 4.4);
        System.out.println(sum1);

        System.out.println(client);

    }
}
