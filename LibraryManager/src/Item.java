


/**
 * 
 * 
 * This is the item object class.
 * The class is used to define the properties of an item
 * @author tudor.tibu@ryerson.ca
 *  If anything is confusing please feel free to email me.
 */
public class Item {


	String serialNumber;
	String type;
	String title;
	String artist;
	String year;
	String album;
	String location;
	
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
		this.serialNumber = serialNumber;
		this.type = type;
		this.title =title ;
		this.artist =artist;
		this.album = album;
		this.year =year;
		this.location =location;
	
	}
	
public String getSerialNumber() {
	return serialNumber;
}
public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public String getAlbum() {
	return album;
}
public void setAlbum(String album) {
	this.album = album;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}






}

