package exercise_2;

//TODO Create an abstract superclass named hasTail.
//TODO Move the common attributes and methods to a superclass and set classes to inherit from it.
/** 
 * Think about the appropriate of the superclass and the subclass
 * make it more make sense, what should it is going to be.
 * You can look an example from github. 
 */

/**
 * Code-improvement exercise about Inheritance.
 * 
 * @author Issaree Srisomboon
 *
 */
public class Fish {
	private int tail;
	
	/**
	 * Initialize Fish with the amount of its tail.
	 * @param tail
	 */
	public Fish (int tail) {
		this.tail = tail;
	}
	
	/**
	 * Get the number of tail
	 * @return tail of its.
	 */
	public int getTail() {
		return tail;
	}

	
}


