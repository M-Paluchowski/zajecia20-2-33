package excercise29;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return 0;
            }

            @Override
            public boolean equals(Object o) {
                return false;
            }
        };
    }
}
