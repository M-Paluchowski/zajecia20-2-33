package excercise37;

import excercise36.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PersonContainer {

    private List<Person> personList = new ArrayList<>(Arrays.asList(new Person("M", 18)));

    void removeAdults() {
//        for (Person person : personList) {
//            if (person.getAge() >= 18) {
//                personList.remove(person);
//            }
//        }

//        Iterator<Person> iterator = personList.iterator();
//        while (iterator.hasNext()) {
//            Person next = iterator.next();
//            if (next.getAge() >= 18) {
//                iterator.remove();
//            }
//        }

        personList.removeIf(person -> person.getAge() >= 18);
    }
}
