package kasutamiseks_programmijupid;

public class Stringis_Asendamine {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Originaal;
		String Asendatav;
		String Asendaja;
		Originaal= "C:\\Users\\kasutaja\\git\\3jaankaardiprojekt\\3jaankaardiprojekt/2/koos/";
		Asendatav= "\\"; // peab panema kaks kaldkriipsu 'java' eripära tõttu!
		Asendaja= "/";
		String Tulemus;
		System.out.println("Originaal: "+Originaal);
		Tulemus=AsendaStringis(Originaal, Asendatav, Asendaja);
		System.out.println("Tulemus  : "+Tulemus);
	}


public static String AsendaStringis(String Tekstiosa, String Asendatav, String Asendaja){
	
	String LoodavTekstiosa;
	String jupp1;
	String jupp2;
	String vahepealneLiidetudOsa;
	int lipp1;
	int lipp2;
	int AsendatavaPikkus;
	int vahepealneLiidetudOsaPikkus;
	int whileX;
	whileX=0;
	LoodavTekstiosa=Tekstiosa;
	vahepealneLiidetudOsa=LoodavTekstiosa;
	
	AsendatavaPikkus=Asendatav.length();
	// DEBUG +
	//System.out.println("Asendatava Pikkus: "+AsendatavaPikkus);
	// DEBUG -
	
	while(whileX<1){
	try
	{
		vahepealneLiidetudOsaPikkus=vahepealneLiidetudOsa.length();
		//System.out.println("vahepealneLiidetudOsa: "+vahepealneLiidetudOsa);
		//System.out.println("vahepealneLiidetudOsaPikkus: "+vahepealneLiidetudOsaPikkus);
		lipp1=vahepealneLiidetudOsa.indexOf(Asendatav);
		jupp1=vahepealneLiidetudOsa.substring(0, lipp1);
		//System.out.println("Jupp1: "+jupp1);
		lipp2=lipp1+AsendatavaPikkus;
		jupp2=vahepealneLiidetudOsa.substring(lipp2, vahepealneLiidetudOsaPikkus);
		//System.out.println("jupp2: "+jupp2);
		vahepealneLiidetudOsa=jupp1+Asendaja+jupp2;
		//System.out.println("vahepealneLiidetudOsa: "+vahepealneLiidetudOsa);
		
		}catch(Exception e){
		//System.out.println("ERROR!!!!");
		//System.out.println("Ilmselt sai STRING otsa ja töö kenasti tehtud :)");
		whileX=1;
		Tekstiosa=vahepealneLiidetudOsa;
	}
	}
	
	
	
	return Tekstiosa;
			}}