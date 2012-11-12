package steuerklasse1;

public class GlobaleVariablen {
	
	private String Vorname;  //  Vorname = (...)txt_Vorname.getText(); --> wie bekomme ich die Variable hier rein? 
							 //  http://forum.byte-welt.net/showthread.php?t=2661 
	
	
	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}


}


/*

public class GlobalData {

private String vorname;

public GlobalData()
{

}

public GlobalData(String vorname)
{
setVorname(vorname);
}

public void setVorname(String vorname)
{
this.vorname = vorname;
}

public String getVorname()
{
return vorname;
}

}


*/