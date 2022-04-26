import objekte.Person;

public class Main {

    public static void main(String[] args) {
        demoObjekte();
    }

    public static void demoObjekte() {
        Person tom = new Person();
        tom.setName("Thomas");
        Person raphael = new Person("Raphael", 50);
        Person altin = new Person("Altin", 210);
        Person julian = new Person("Julian", 22);
        Person richard = new Person("Richard", 21);
        Person lena = new Person("Lena", 22);
        richard.print();
        julian.print();
        altin.print();
        raphael.print();
        lena.print();
        Person julian_2= new Person(altin);



    }
}
