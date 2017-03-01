import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
public class DbManager {
  String csvFile;
  String line;
  String cvsSplitBy;
  BufferedReader br;
  BufferedWriter bw;
	
	public DbManager(String file){
		this.csvFile = file;
		this.line = "";
		this.cvsSplitBy = ",";
		try {
			this.br = new BufferedReader(new FileReader(csvFile));
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("Please choose the correct File Name");
		} 
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
	 return map;
 }


public void writeItemDb(){
	
}












}






