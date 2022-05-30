package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// Creating a List of type ListItems using ArrayList
        List<ListItems> list = new ArrayList<ListItems>();
 
        // add the member of list
        list.add(new ListItems(1, "I"));
        list.add(new ListItems(2, "Love"));
        list.add(new ListItems(3, "India"));
        list.add(new ListItems(4, "For"));
        list.add(new ListItems(5, "Ever"));
 
        // Map which will store the list items
        Map<Integer, String> map = new HashMap<>();
 
        // for (ListItems n : list) { map.put(n.getkey(),
        // n.getvalue()); }
        // the below lambda  performs the same task as the
        // above given for loop will do
        // put the list items in the Map
        list.forEach(
            (n) -> { map.put(n.getkey(), n.getvalue()); });
 
        // Printing the given map
        System.out.println("Map : " + map);
    }

}


