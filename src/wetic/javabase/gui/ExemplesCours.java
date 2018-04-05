package wetic.javabase.gui;

public class ExemplesCours {

	public enum Semaine {
		Dimanche(17),
		Lundi(18),
		Mardi(19),
		Mercredi(20),
		Jeudi(21),
		Vendredi(22),
		Samdi(23);

		private final int index;
		private Semaine(int index) {
			this.index = index;
		}
	
	}
//	public class Semaine1 {
//		public static final int DIMANCHE = 0;
//		public static final int LUNDI = 1;
//		public static final int MARDI = 2;
//		public static final int MERCREDI = 3;
//		public static final int JEUDI = 4;
//		public static final int VENDREDI = 5;
//		public static final int SAMEDI = 6;		
//	}
	
	public static void main(String[] args) {
		Semaine j = Semaine.Lundi;
	}
	
}
