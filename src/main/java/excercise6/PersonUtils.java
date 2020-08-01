package excercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

final class PersonUtils {

    private static final int ADULT_AGE = 18;

    private PersonUtils() {}

    public static List<Person> filterAdultPersons(List<Person> personList) {
//        List<Person> result = new ArrayList<Person>();
//        for (Person person : personList) {
//            if (person.getAge() >= ADULT_AGE) {
//                result.add(person);
//            }
//        }
//
//        return result;
        return personList.stream()
                .filter(person -> person.getAge() >= 18)
//                .map(person -> person.getFirstName().toUpperCase())
                .collect(Collectors.toList());
    }
}
