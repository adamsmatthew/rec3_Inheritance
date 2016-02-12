package animals;

public interface Swimmer {
	/*
	 * Methods do not get implemented in interfaces. Interfaces are simply
	 * an agreement classes can use to promise to provide some methods.
	 * That is, any class that implements Swimmer promises to have a method
	 * called 'swim' that doesn't return anything ('void' return type) and takes
	 * in no arguments.
	 */
	void swim();
}
