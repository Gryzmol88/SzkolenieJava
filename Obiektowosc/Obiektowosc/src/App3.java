public class App3 {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Janusz";
        client.surname = "Kowalski";
        client.age = 40;
        client.pesel = 43985408504L;

        Client client2 = new Client("Michał", "Nadrajkowski", 40, 1233213321123L);

    }
}
