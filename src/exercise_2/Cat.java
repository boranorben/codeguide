package exercise_2;

/**
 * Code-improvement exercise about Inheritance.
 * Cat is the subclass of the Fish class.
 * @author Issaree Srisomboon
 *
 */
public class Cat extends GoldFish {
	private int tail;
	
	/**
	 * Initialize Cat with the amount of its tail.
	 * @param cat's tail.
	 */
	public Cat (int tail) {
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
