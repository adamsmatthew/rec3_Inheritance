package animals;

/*
 * This class is 'abstract'- meaning it cannot be instantiated itself.
 * It does, however, include code- unlike an interface.
 */
public abstract class Mermaid implements Swimmer, Talker { 
	                          // ^ You can use multiple interfaces!

	public Mermaid() {
		// create a mermaid...
	}
	
	@Override
	public String talk() {
		return "Something in mermish.";
	}

	@Override
	public String sing() {
		return "Do Re Mi in mermish.";
	}

	@Override
	public void swim() {
		// swimming code goes here...
	}
	
	/*
	 * All Mermaid subclasses will be able to talk to fish using this code.
	 */
	public void talkToFish(Fish f) {
		// talk with a fish...
	}
	
	/*
	 * Abstract methods must be overridden by child classes.
	 */
	public abstract void castSpell();

}
