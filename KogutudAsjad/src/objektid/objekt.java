/**
 * Pelle fail
 */
package objektid;

/**
 *
 */
public class objekt {
	String komponendinimi;
	String CharName;
	String LocationName;
	double EarnedAdena;
	double EarnedAncientAdena;
	double SpentTimeInSeconds;
	int    reanumber;

	/**
	 * Pelle konstruktor
	 */
	public objekt(String str0, String str1, String str2, double dbl1, double dbl2, double dbl3) 
	{
	
		super();
		this.komponendinimi=str0;
		this.CharName=str1;
		this.LocationName=str2;
		this.EarnedAdena=dbl1;
		this.EarnedAncientAdena=dbl2;
		this.SpentTimeInSeconds=dbl3;
	
		
		
	}

}
