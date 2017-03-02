package exercise_2;

/**
 * Code-improvement exercise about Inheritance.
 * Goldfish is the subclass of the Fish class.
 * @author Issaree Srisomboon
 *
 */
public class GoldFish extends Fish {
	private int tail;
	
	/**
	 * Initialize Gold Fish with the amount of its tail.
	 * @param cat's tail.
	 */
	public GoldFish (int tail) {
		super(tail);
	}

	/**
	 * @see codeguide.Fish#getTail()
	 */
	@Override
	public int getTail() {
		return super.getTail();
	}


}