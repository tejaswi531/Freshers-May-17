package collections;


import java.util.*;
import java.util.Map.Entry;

import java.util.TreeMap;

public class Treemapdemo {

	public static void main(String[] args) {
		Map<Long,Contact> values = new TreeMap<Long, Contact>().descendingMap();
		Long l1 =new Long(834L);
		Long l2 =new Long(854L);
		Long l3 =new Long(814L);
		
		Contact c1 = new Contact("teju","teju@gmail.com");
		Contact c2 = new Contact("yeshu","yeshu@gmail.com");
		Contact c3 = new Contact("jyo","jyo@gmail.com");
		
		 values.put(l1,c1);
		 values.put(l2,c2);
		 values.put(l3,c3);
		
		Set<Entry<Long,Contact>> entrySet=values.entrySet();
		for(Entry<Long,Contact>entry:entrySet) {
		//System.out.println(entry.getKey());//use to get only key
		//System.out.println(entry.getKey());//use to get only value	
		System.out.println(entry.getKey()+"::"+entry.getValue());//use both to get keyvalue pair	
	}
		

}

    }
