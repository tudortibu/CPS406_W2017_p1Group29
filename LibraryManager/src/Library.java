import java.awt.EventQueue;


/**
 * 
 * 
 *This is the main class of the program
 *the main function of the program and the UI Builder will be found in this class.
 *@author tudor.tibu@ryerson.ca
 * If anything is confusing please feel free to email me.
 */
public class Library   {

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ItemDbManager itemDbManager = new ItemDbManager("src/ItemDb.csv");
		ClientDbManager clientDbManager = new ClientDbManager("src/ClientDb.csv");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI(itemDbManager, clientDbManager);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	


	
}
