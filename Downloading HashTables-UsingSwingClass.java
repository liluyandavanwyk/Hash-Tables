import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class UsingSwingClass extends HashTable {

	/**
	 * Implementinng the input dialog box and show message
	 *+box
	 * Something to check on the showMessage dialog box
	 * JOption.PLAIN_MESSAGE is the one without any icon
	 */

	public static void main(String[] args) {
		UsingSwingClass temp = new UsingSwingClass();
		temp.populate();


		String iD;
		long iDnum;

	  iD = JOptionPane.showInputDialog("Enter ID Number");
		iDnum = Long.parseLong(iD);
		dataObject itemFound = temp.find(iDnum);

		try{

		     JOptionPane.showMessageDialog(null, "Data : " + itemFound.displayDataObject() , "IEC", JOptionPane.PLAIN_MESSAGE );
		}catch(NullPointerException l){
			  JOptionPane.showMessageDialog(null, "Data : Not Found", "IEC", JOptionPane.PLAIN_MESSAGE );
		}
		System.exit(0);

	}

	public void populate(){


           String inputFile = "dataStorage.txt";
           File file =  new File(inputFile);
           //create new file

           //open file and populate the BinarySearchTree
           //catch any possible errors and report them
           try{
               Scanner dataFile = new Scanner(file);
               String[] dataStorage;
               while(dataFile.hasNextLine()){
                    String dataLine = dataFile.nextLine();
                    dataStorage = dataLine.split(" ");
										long iD = Long.parseLong(dataStorage[0]);
										//long hashValue = getHashValue(iD);
										dataObject toStore = new dataObject(iD,dataLine);
										insert(toStore);


               }
           }catch(FileNotFoundException e){
              System.out.println("An error occured");
           }
	   }
}
