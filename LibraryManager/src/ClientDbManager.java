import java.io.IOException;
import java.util.HashMap;

/**
 * The is the clientDbManager script.
 * The client database manager handles reading and writing from the database. 
 * it also handles the HashMap that stores clients and indexes them by their client IDs
 * If anything is confusing please feel free to email me.
 * @author tudor.tibu@ryerson.ca
 *
 */
public class ClientDbManager extends DbManager {
	HashMap<String, Client> map;

	public ClientDbManager(String file) {
		super(file);
		map = new HashMap();
	}

	/**
	 * read from the selected .csv file and return a HashMap with <key, value> pairs of <Client ID, Client>.
	 * The structure of the .csv should be (CleintID, FirstName, LastName) all comma separated.
	 * If the .csv File is missing one of those comma separated entries, the entry will not be created into a client object
	 * @return A HashMap with <key, value> pairs of <Client ID, Client>.
	 */
	public HashMap<String, Client> readClientDb() {
		HashMap<String, Client> map = new HashMap();
		try {
			while ((this.line = this.br.readLine()) != null) {
				String array[] = this.line.split(cvsSplitBy);

				if (array.length < 3) {
					System.out.println("Error Reading Line" + this.line);
					System.out.println("Incorrect File Format");
				} else {
					Client client = new Client(array[0], array[1], array[2]);
					map.put(array[0], client);
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
	void writeItemDb() {
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
	 * Add a new item to the HashMap which stores <key, value> pairs of <Client ID, Client>.
	 * @param client the client to be added to the HashMao
	 */
	public void addEntry(Client client) {
		this.map.put(client.getClientID(), client);
	}
	/**
	 * Getter function for returning the map
	 * @return the itemDbmanager HashMap with <key, value> pairs of <SerialNumber, Item>
	 */
	public HashMap<String, Client> getMap() {
		return map;
	}

}
