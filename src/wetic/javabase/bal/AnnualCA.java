package wetic.javabase.bal;

public class AnnualCA {
	String year;
	int ca;
	
	
	public AnnualCA(String year, int ca) {
		
		this.year = year;
		this.ca = ca;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getCa() {
		return ca;
	}
	public void setCa(int ca) {
		this.ca = ca;
	}
	@Override
	public String toString() {
		return "AnnualCA [year=" + year + ", ca=" + ca + "]";
	}

}
