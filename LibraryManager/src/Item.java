import java.security.KeyException;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 
 * @author Tudor
 * This is the item manager class
 * 
 */
public class Item {

  HashMap<String, String> CategoryDictionary = new HashMap();
	 
	/**
	 * Constructor for empty item class
	 */
	public Item( ){
			
		
	}
/**
 * 
 * @param serialNumber The item's serial number
 * @param type the type of the item in string format
 * @param title the title of the item
 * @param artist the item's artist
 * @param album the album of the item
 * @param year the year the item was produced
 * @param location where to find the item
 */
	public Item (String serialNumber, String type, String title, String artist, String album, String year, String location  ){
		this();
		this.CategoryDictionary.put( "serialNumber", serialNumber);
		this.CategoryDictionary.put("type", type);
		this.CategoryDictionary.put("title", title );
		this.CategoryDictionary.put("artist", artist);
		this.CategoryDictionary.put("album", album);
		this.CategoryDictionary.put("year", year);
		this.CategoryDictionary.put("location",location);
		
		//updateDictionary();
	}

	
	/**
	 * This method is for debugging purposes
	 * @return An array of the CategoryDictionary Key,Value pairs
	 */
	 public String[] getAllInfo(){
		 String[] info = new String [CategoryDictionary.keySet().size()];
		 int x = 0;
		 for(String i : CategoryDictionary.keySet()){
			 info [x] = i + " " + CategoryDictionary.get(i) ;
		 x++;
		 }
	 return info;
	 }

	 
	 /**
	  * Checks if key part of the  CategoryDictionary keySet then returns the value of that key
	  * @param key the key requested
	  * @return returns the value of the requested category 
	  */
	 public String getInfo(String key) {
		 String info = " ";
		if(this.CategoryDictionary.containsKey(key)){
		 info = this.CategoryDictionary.get(key);
		}else{
			
			System.out.println("the string " + key + " is not found in the keySet of CategoryDictionary");
		}
		return info;
	 }
	 
	 
	 /**
	  *  Change the value from the <key, value> pair of CategoryDictionary
	  * @param key the key requested
	  * @param change the value you wish to change the value of the <key, value> pair too
	  */
	 public void SetInfo(String key, String change ){
		 if(this.CategoryDictionary.containsKey(key)){
			  this.CategoryDictionary.put(key, change);
			}else{
				
				System.out.println("the string " + key + " is not found in the keySet of CategoryDictionary");
			}
	 
	 }
	 
}
