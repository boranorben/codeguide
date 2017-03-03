package exercise_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Code-improvement exercise about Inheritance.
 * Class for adding and checking clothes in closet.
 * @author Issaree Srisomboon
 *
 */
public class Closet {
	private Map<String,Integer> clothes;
	
	/**
	 * Initialize the constructor of closet class.
	 */
	public Closet () {
		clothes = new HashMap<String,Integer>();
	}
	
	/**
	 * Method for adding and checking clothes in closet.
	 */
	//TODO Separate the ClosetFunction method to 'addClothe' and 'checkClothe' methods.
	//TODO Make sure that one method for one process.
	public void ClosetFunction () {
		Scanner input = new Scanner(System.in);
		boolean running = true;
		while (running) {
			System.out.print("(a)dd, (c)heck, (q)uit: ");
			String answer = input.nextLine();
			switch (answer) {
			case "a":
				System.out.print("(s)hirt, (t)rousers, (p)ants ");
				String clothe = input.nextLine();
				if ( clothe.equals("s") ) {
					if ( clothes.containsKey("shirt") ) {
						clothes.put( "shirt" , clothes.get("shirt")+1 );
					} else clothes.put( "shirt", 1 );
				} else if ( clothe.equals("t") ) {
					if ( clothes.containsKey("trousers") ) {
						clothes.put( "trousers" , clothes.get("trousers")+1 );
					} else clothes.put( "trousers", 1 );
				} else if ( clothe.equals("p") ) {
					if ( clothes.containsKey("pants") ) {
						clothes.put( "pants" , clothes.get("pants")+1 );
					} else clothes.put("pants", 1);
				}
				break;
			case "c":
				for ( String type : clothes.keySet() ) {
					System.out.println( type + ": " + clothes.get(type));
				}
				break;
			default:
				running = !running;
				break;
			}
		}
		
	}

}
