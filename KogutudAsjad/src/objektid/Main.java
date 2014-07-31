/**
 * Pelle fail
 */
package objektid;

import objektFailiJaTagasi.Address;





/**
 *
 */
class Main {
	
	static void LooRida(objekt a,String aa, String ab, String b, double c, double d, double e){
		
		
		GLOBAL.GlobalReaNumber=GLOBAL.GlobalScoreTxtRead.size();
		a.reanumber=GLOBAL.GlobalReaNumber;
		a.komponendinimi=aa;
		a.CharName=ab;
		a.LocationName=b;
		a.EarnedAdena=c;
		a.EarnedAncientAdena=d;
		a.SpentTimeInSeconds=e;
		

		GLOBAL.GlobalScoreTxtRead.add(a);
		
	}
	
	

	/**
	 * Pelle meetod
	 * @param args 
	 */
	public static void main(String[] args) {
		
		objektFailiJaTagasi.Serializer.start(null);
		objektFailiJaTagasi.Deserializer.start(null);
		System.out.println("Size: "+objektFailiJaTagasi.GLOBAL.aadressid.size());
		//objektFailiJaTagasi.Address objekt1=objektFailiJaTagasi.GLOBAL.aadressid.get(1);
		//objektFailiJaTagasi.Address objekt2=objektFailiJaTagasi.GLOBAL.aadressid.get(2);
		System.exit(0);
		
		
		
		// TODO Auto-generated method stub
		GLOBAL.GlobalKomponendinimi="rida1";
		GLOBAL.GlobalLocationName="Execution Grounds";
		GLOBAL.GlobalReaNumber=0;
		GLOBAL.GlobalChariNimi="Bem";
		GLOBAL.GlobalAdenaEarned=10000;
		GLOBAL.GlobalAncientAdenaEarned=555;
		GLOBAL.GlobalSpentTimeInSeconds=60;
		
		GLOBAL.rida = new objekt("","","",0,0,0);
		
		LooRida(GLOBAL.rida,GLOBAL.GlobalKomponendinimi,GLOBAL.GlobalChariNimi,GLOBAL.GlobalLocationName,GLOBAL.GlobalAdenaEarned,GLOBAL.GlobalAncientAdenaEarned,GLOBAL.GlobalSpentTimeInSeconds);		
		
		GLOBAL.TagasisideRida=GLOBAL.GlobalScoreTxtRead.get(GLOBAL.GlobalReaNumber);
		
		System.out.println(GLOBAL.TagasisideRida.komponendinimi+"#"+GLOBAL.TagasisideRida.CharName+"#"+GLOBAL.TagasisideRida.LocationName+"#"+GLOBAL.TagasisideRida.EarnedAdena+"#"+GLOBAL.TagasisideRida.EarnedAncientAdena+"#"+GLOBAL.TagasisideRida.SpentTimeInSeconds);
	
	}

}
