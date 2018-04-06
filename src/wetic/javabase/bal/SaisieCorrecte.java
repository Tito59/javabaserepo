package wetic.javabase.bal;

public class SaisieCorrecte {
	
	int nombreSaisie; 
	
	public SaisieCorrecte(int result) {
		this.nombreSaisie = result;
		
	}
	
	@Override
	public String toString() {
		return "Nombre saisie : " + nombreSaisie;
	}
	
}
