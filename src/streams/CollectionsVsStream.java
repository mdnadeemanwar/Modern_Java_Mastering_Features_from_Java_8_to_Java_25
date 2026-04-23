package streams;

import java.util.ArrayList;
import java.util.List;

public class CollectionsVsStream {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Sam");
        names.add("Joe");
        names.add("Jane");
        names.add("Julie");
        names.add("Nadeem");

        names.remove("John");

        System.out.println("Names are->" + names);

        //lets print all the names
        for(String name : names) {
            System.out.println(name);
        }
    }
}
