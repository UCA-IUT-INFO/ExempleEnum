package civilite;

public class TestCivilite {

	public static void main(String[] args) {
		
		Civilite civ = Civilite.MADEMOISELLE;
		System.out.println(civ);
		System.out.println(civ.getAbreviation());
		System.out.println(civ.ordinal());
		civ = Civilite.MONSIEUR;
		System.out.println(civ.ordinal());
		

	}

}
