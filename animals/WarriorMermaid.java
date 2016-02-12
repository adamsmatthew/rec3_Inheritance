package animals;

/*
 * 'extends' is the keyword used to make a child class. WarriorMermaid "inherits" 
 * all of the "members" of Mermaid- that is, all of Mermaid's fields, methods 
 * (except constructors), and nested classes (but don't worry about those yet).
 * 
 * This is super useful when you want lots of classes that would share some of
 * the same code. You could copy/paste a lot, but it's a lot easier and cleaner
 * to just use inheritance.
 */
public class WarriorMermaid extends Mermaid {

	public WarriorMermaid() {
		// 'super()' calls the parent constructor- in this case, Mermaid.Mermaid();
		// You don't need to call super() in every child's constructor, but it is
		// often useful.
		super();
		
		// You can do other stuff here if WarriorMermaid needs to be set up a bit
		// differently from its parent.
	}

	@Override
	public void castSpell() {
		// magic attack spell goes here...
	}
	
	/*
	 * Children can do more things then their parents (hence the word "extends").
	 * This method is only in WarriorMermaid (not Mermaid, or PrincessMermaid).
	 */
	public void throwTrident() {
		// throw trident...
	}

}
