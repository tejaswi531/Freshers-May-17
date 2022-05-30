package collections;

public class ListItems {
	
		 
	    // key will act as an id of the value
	    private Integer key;
	 
	    // value will be the value of the above key
	    private String value;
	 
	    // create constructor for reference
	    public ListItems(Integer id, String name)
	    {
	 
	        // assigning the value of key and value
	        this.key = id;
	        this.value = name;
	    }
	 
	    // return private variable key
	    public Integer getkey() { return key; }
	 
	    // return private variable name
	    public String getvalue() { return value; }

}
