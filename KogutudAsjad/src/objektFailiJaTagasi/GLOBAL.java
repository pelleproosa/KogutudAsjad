package objektFailiJaTagasi;


import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;


public class GLOBAL {

	
	
	public static List<Address> aadressid = new ArrayList<Address>();
	

	
	
	public static void deserialzeAddress(){
		 

		   
		   
	 
		   try{
			   String SaveFileName=(System.getProperty("user.home")+"\\Desktop\\objektifail.ser");
			   FileInputStream fin = new FileInputStream(SaveFileName);
			   ObjectInputStream ois = new ObjectInputStream(fin);
			   //address = (Address) ois.readObject();
			   GLOBAL.aadressid = (ArrayList<Address>) ois.readObject();
			  // GLOBAL.v1 = (Address) ois.readObject();
			 //  GLOBAL.aadressid.add((Address) ois.readObject());
		
			   
			  
			  // GLOBAL.aadressid = (ArrayList<Address>) ois.readObject();
			   
			   ois.close();
		//GLOBAL.aadressilist=aadressid;
			//   return address;
	 
		   }catch(Exception ex){
			   ex.printStackTrace();
			  // return null;
			   
		   } 
	   }
	
	
}
