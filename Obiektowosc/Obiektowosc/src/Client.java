public class Client {
    // Atrybuty lub pola klasy.
    String name;
    String surname;
    int age;
    long pesel;
    Address address = new Address();

    public Client(){ //Konstruktor

    }

    public Client(String name, String surname, int age, long pesel){
        this(name, surname, age);
        this.pesel = pesel;
    }
    
    public Client(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Client(String name, String surname, int age){
        this(name, surname);
        this.age = age;
    }


    int sum(int a, int b){ // sygnatura metody
        int result = a + b;
        return result;
    }

    void powiedzImie() {
        System.out.println(name);
    }

    double sum(double a, double b){
        double result = a + b;
        return result;
    }

    boolean sum(boolean a, boolean b){
        if(a){
            return true;
        } else if (!b) {
            return false;

        }else{
            return true;
        }
    }

}


