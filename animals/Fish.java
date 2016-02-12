/* A package is just a big group of related code. (It is also just a directory on your
 * computer.)
 */
package animals;

/* Class declaration.
 * The 'implements' keyword means that Fish must have all of the methods that
 * the interface Swimmer promises. 
 * 
 * This would be particularly useful if, for example, you were writing an ocean 
 * simulator where you might want 50 different types of things swimming around.
 * You could painstakingly go through each class you're using and figure out which 
 * methods it uses to swim (and what arguments those take), or you could simply say
 * that anything that is going to be in the ocean must implement Swimmer. Plus, that 
 * way, someone else can even add a new class for you to use without you reading their
 * code.
 */
public class Fish implements Swimmer {

	// Variable declarations.
	// This is an "instance variable"- which means that it is stored separately
	// for every Fish that is created (each Fish "instance").
	private double[] color;

	/* Constructor method. (Different from the class declaration!)
	 * This is called when 'new Fish(scaleColor)' is run.
	 */ 
	public Fish(double[] scaleColor) { // scaleColor is "argument" (or "parameter") of
		                               // type 'double[]', so it must be an array of doubles
		
		// Parameters are "local" to methods- meaning they don't exist once the method has
		// finished running. In this case, we want Fish objects to know their color
		// permanently, so we save the parameter's value in an instance variable.
		color = scaleColor;
	}

	/* Another constructor.
	 * You can have multiple methods with the same name, if the arguments are different.
	 * (This technique is called "method overloading.")
	 * 
	 * In this case, we use another constructor to give users the option to create a fish
	 * without specifying the scale color. This is called when 'new Fish()' is run.
	 */
	public Fish() {
		color = new double[]{0,0,0};
	}

	/* Words that start with '@' like this are annotations.
	 * Annotations aren't actually part of the code; they just give hints to
	 * the IDE so it can help you out more. For example, Eclipse will complain
	 * if you put @Override on a method that isn't overriding anything (often 
	 * caused by a typo in the method name).
	 */
	@Override
	public void swim() {
		moveFins();
	}
	
	/*
	 * This method is private- meaning it can only be accessed inside the Fish class. 
	 */
	private void moveFins() {
		// code to move fins goes here...
	}
}
