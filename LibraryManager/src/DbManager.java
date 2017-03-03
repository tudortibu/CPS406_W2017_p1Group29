import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
/**
 * 
 * This is the DbManager script
 * This is a super class to the ClientDbManager and ItemDbManager
 *@author tudor.tibu@ryerson.ca
 *  If anything is confusing please feel free to email me.
 */
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
		
	}


}






