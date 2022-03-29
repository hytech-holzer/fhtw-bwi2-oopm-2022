package objekte;

public class Person {

    private String name;
    private int age;

    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void print(){
        System.out.printf("%s (%d)\n",name,age);
    }



    public void setAge(int age) {
        this.age = age;
    }

    public Person(Person alt){
        name=alt.name;
        age=alt.age;
    }
}
