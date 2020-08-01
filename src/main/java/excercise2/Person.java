package excercise2;

class Person {

//    public final String firstNameAndLastName;
    private String firstName;
    private String lastName;
    private Integer age;

    Person(String firstNameAndLastName, Integer age) {
//        this.firstNameAndLastName = firstNameAndLastName;
        this.age = age;
    }

    public String getFirstNameAndLastName() {
        return firstName + " " + lastName;
    }

    public Integer getAge() {
        return age;
    }
}
