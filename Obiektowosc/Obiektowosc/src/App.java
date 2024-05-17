public class App {
    public static void main(String[] args) {
        Client client = new Client();

        client.name = "Janusz";
        client.surname = "Kowalski";
        client.age = 30;
        client.pesel = 432545233423434L;

        Address a1 = new Address();

        a1.city = "Olsztyn";
        a1.postCode = "11-222";
        a1.no = 3;
        a1.street = "Dworcowa";

        client.address = a1;

        /****************************************/


        Client c1 = new Client();
        Client c2 = c1;

        c1.name = "Janusz";

        System.out.println(c1.name);
        System.out.println(c2.name);

        c2.name = "Wiesiek";

        System.out.println(c1.name);
        System.out.println(c2.name);

        Client c3 = new Client();
        c3.name = c2.name;
        c3.surname = c2.surname;


    }
}
