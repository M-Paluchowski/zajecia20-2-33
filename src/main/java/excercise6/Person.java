package excercise6;

class Person {

    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getFirstName() {
        return firstName;
    }
}
