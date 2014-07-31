package objektFailiJaTagasi;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;



public class Serializer {

  public static void start (String args[]) {

	   Serializer serializer = new Serializer();
	   serializer.serializeAddress("wall street", "united state");
  }

  public void serializeAddress(String street, String country){
	  System.out.println(GLOBAL.aadressid.size());
	   Address address = new Address();
	   address.setStreet(street);
	   address.setCountry(country);
	   GLOBAL.aadressid.add(address);
	   String str=address.getCountry();
	   System.out.println(str);
	   System.out.println(GLOBAL.aadressid.size());
//	   GLOBAL.v1=address;
	   address.setStreet("Sütiste");
	   address.setCountry("Eesti");
	   GLOBAL.aadressid.add(address);
	   String str2=address.getCountry();
	   System.out.println(str2);
	   System.out.println(GLOBAL.aadressid.size());
	   
	  // String str = objektFailiJaTagasi.GLOBAL.aadressid(1).getStreet();
//	   GLOBAL.v2=address;
	   Address[]aadressidejada= new Address[(GLOBAL.aadressid.size())];
	  aadressidejada=GLOBAL.aadressid.toArray(aadressidejada);
	   Address aadressike;
	   aadressike=GLOBAL.aadressid.get(0);
	  System.out.println("....."+aadressike.country);
	  System.out.println(aadressidejada[0].street);
	  System.out.println(aadressidejada[1].country);
	  System.out.println(aadressidejada[1].street);


	   
	   
	   
	   
	   
	   
	   
	   
	   Boolean append=false;
	   try{
		   
		
		String SaveFileName=(System.getProperty("user.home")+"\\Desktop\\objektifail.ser");
		//System.out.println(SaveFileName);
		append=true;
		FileOutputStream fout = new FileOutputStream(SaveFileName, append);
		ObjectOutputStream oos = new ObjectOutputStream(fout);
		//GLOBAL.aadressid.add(address);
		oos.writeObject(GLOBAL.aadressid);
		oos.close();
		System.out.println("Done");

	   }catch(Exception ex){
		   ex.printStackTrace();
	   }
  }
}