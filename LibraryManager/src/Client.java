import java.util.ArrayList;


/**
 * 
 * This is the client object class.
 * The class is used to define the properties of a client
 * If anything is confusing please feel free to email me.
 *@author tudor.tibu@ryerson.ca
 */
public class Client {
String FirstName;
String LastName;
String ClientID;
ArrayList<Item> itemsLoaned;
public Client(){
	
}
/**
 * The client object
 * @param ID The clientID of a client, this value is used to uniquely identify clients in a database
 * @param Fname the First name of a client
 * @param Lname the last name of a client
 */
public Client(String ID, String Fname, String Lname){
	this.itemsLoaned = new ArrayList();
	this.ClientID = ID;
	this.FirstName = Fname;
	this.LastName= Lname;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public String getClientID() {
	return ClientID;
}

public void setClientID(String clientID) {
	ClientID = clientID;
}

public ArrayList<Item> getItemsLoaned() {
	return itemsLoaned;
}


/**
 * makes the client loan an it if the item is  loanable.
 * This function is not complete as of the first sprint therefore it is not used 
 * @param item item to be loaned
 */
public void loanItem(Item item){
	itemsLoaned.add(item);
}
/**
 * return an item from a client
 * This function is not complete as of the first sprint therefore it is not used 
 * @param item an item was loaned but is being returned
 */
public void returnItem(Item item){
	itemsLoaned.remove(item);
}

}
