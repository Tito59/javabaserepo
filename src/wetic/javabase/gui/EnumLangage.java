package wetic.javabase.gui;

public class EnumLangage {

	public enum Langage{
		JAVA("Langage java", "Eclipse"), C("Lagage C", "Code Block")
			, CPlus("Lanagae C++", "Visual Studio"), 
			PHP("Langage PHP", "Ps Pad"); 
		private String name = "";
		private String editor = "";
		
		public void getEditor() {
			System.out.println("Editeur: " + editor);;
		}

		public void getname() {
			System.out.println("Name: " + name);;
		}

		private Langage(String name, String editor){
			this.name = name;
			this.editor = editor;
		}
	}

	public static void main(String[] args) {
		Langage lang1 = Langage.JAVA;
		Langage lang2 = Langage.PHP;
		lang1.getEditor();
		lang2.getEditor();

	}

}
