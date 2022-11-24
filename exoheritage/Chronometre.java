package exoheritage;

public class Chronometre {

	private long temps;
	
	public Chronometre (final long temps) {
		this.temps = temps;
	}
	
	//reculer de x temps
	public String avancer(long avant) {
		temps += avant = temps;
		String date = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date (temps*1000));
		return date;
	}
	
	//avancer de x temps
	public String reculer(long recul) {
		temps += recul = temps;
		String date = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date (temps*1000));
		return date;
	}
	
	//affiche la date en format dd/mm/aaa
	public String date() {
		String date = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date (temps*1000));
		return date;
	}

	
	
	
	//getter setter
	public final long getTemps() {
		return temps;
	}

	public final void setTemps(long temps) {
		this.temps = temps;
	}
}
