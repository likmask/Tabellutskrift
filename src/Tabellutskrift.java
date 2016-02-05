//******************************************************************
// Programmerare: Robin Willén wilrob-2
// Datum: 2016-01-24
// Senast uppdaterad: 2016-01-24 Robin Willén
// Beskrivning: This Applications prints element whit the atomic number, atomic mass and mass number.
// Version: 0.1
//****************************************************************** 

public class Tabellutskrift {

	public static void main(String[] args) {
		
		//Declaring variables
		int agMassNumber = (int) Math.round(107.8682 - 47);
		int auMassNumber = (int) Math.round(196.96654 - 79);
		int cMassNumber = (int) Math.round(12.01 - 6);
		
		//Printing
		System.out.println("Tecken\tGrundämne\tAtomnummer\tAtommassa\tMasstal");
		System.out.println("=======================================================================");
		System.out.println("Ag\tSilver\t\t47\t\t107.8682\t" + agMassNumber);
		System.out.println("Au\tGuld\t\t79\t\t196.96654\t" + auMassNumber);
		System.out.println("C\tKol\t\t6\t\t12.01\t\t" + cMassNumber);
	}

}