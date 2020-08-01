package excercise36;

public class Main {

    public static void main(String[] args) {
        Person one = new Person("a", 18);
        Person two = new Person("b", 20);
        changeReference(one, two);
        System.out.println(one.getName());
    }

    public static  void changeReference(Person one, Person two) {
        one = two;
        two = one;
    }
}
