import java.io.IOException;
import java.util.HashMap;


/**
 * The is the itemDbManager script.
 * The item database manager handles reading and writing from the database. 
 * it also handles the HashMap that stores items and indexes them by their serial number
 * @author tudor.tibu@ryerson.ca
 *
 */
public class ItemDbManager extends DbManager {
HashMap<String, Item> map;
	public ItemDbManager(String file) {
		
		super(file);
		map = new HashMap();
	}
	/**
	 * read from the selected .csv file and return a HashMap with <key, value> pairs of <Serial Number, Item>.
	 * The structure of the .csv should be (SerialNumber, type, title, artist, album, year, location) all comma separated.
	 * If the .csv File is missing one of those comma separated entries, the entry will not be created into a Item object
	 * @return A HashMap with <key, value> pairs of <Serial Number, Item>.
	 */
	 public HashMap<String, Item> readItemDb(){
		 HashMap<String, Item> map = new HashMap();
		 try {
			while( (this.line = this.br.readLine()) !=null ){
				  String array[] = this.line.split(cvsSplitBy);
				  
				  if(array.length != 7){
					  System.out.println("Error Reading Line" + this.line);
					  System.out.println("Incorrect File Format");
				  }else{
					  Item item =  new Item(array[0], array[1], array[2], array[3], array[4], array[5], array[6]);
					  map.put(array[0], item);
				  }
				  
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Finished Reading From Db");
		 this.map = map;
		 return map;
	 }

	 /**
	  * write to the item database, this function is incomplete as of now.
	  * Also it is recommended that you only use this function to backup your file
	  * or when the application exits
	  */
	public void writeItemDb(){
		/*
		try{
			this.bw = new BufferedWriter(new FileWriter(csvFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.print("Please choose the correct File Name");
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    */
	}

	/**
	 * Add a new item to the HashMap which stores <key, value> pairs of <Serial Number, Item>.
	 * @param item the item to be added to the HashMao
	 */
	public void addEntry(Item item){
		this.map.put(item.getSerialNumber(), item);
	}
	
	/**
	 * Getter function for returning the map
	 * @return the itemDbmanager HashMap with <key, value> pairs of <SerialNumber, Item>
	 */
	public HashMap<String, Item> getMap() {
		return map;
	}

}
