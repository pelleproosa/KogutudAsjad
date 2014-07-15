/**
 * Pelle fail
 */
package Komponendid;





/**
 *
 */
class Main {
	
	static void LooRida(komponent a,String aa, String ab, String b, double c, double d, double e){
		
		
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
		// TODO Auto-generated method stub
		GLOBAL.GlobalKomponendinimi="rida1";
		GLOBAL.GlobalLocationName="Execution Grounds";
		GLOBAL.GlobalReaNumber=0;
		GLOBAL.GlobalChariNimi="Bem";
		GLOBAL.GlobalAdenaEarned=10000;
		GLOBAL.GlobalAncientAdenaEarned=555;
		GLOBAL.GlobalSpentTimeInSeconds=60;
		
		GLOBAL.rida = new komponent("","","",0,0,0);
		
		LooRida(GLOBAL.rida,GLOBAL.GlobalKomponendinimi,GLOBAL.GlobalChariNimi,GLOBAL.GlobalLocationName,GLOBAL.GlobalAdenaEarned,GLOBAL.GlobalAncientAdenaEarned,GLOBAL.GlobalSpentTimeInSeconds);		
		
		GLOBAL.TagasisideRida=GLOBAL.GlobalScoreTxtRead.get(GLOBAL.GlobalReaNumber);
		
		System.out.println(GLOBAL.TagasisideRida.komponendinimi+"#"+GLOBAL.TagasisideRida.CharName+"#"+GLOBAL.TagasisideRida.LocationName+"#"+GLOBAL.TagasisideRida.EarnedAdena+"#"+GLOBAL.TagasisideRida.EarnedAncientAdena+"#"+GLOBAL.TagasisideRida.SpentTimeInSeconds);
	
	}

}
