/*
 * This animals package is meant to be a guide to common Java object-oriented
 * concepts. 
 * 
 * Recommended reading order:
 *   - Fish
 *   - Swimmer
 *   - Talker
 *   - Human
 *   - Mermaid
 *   - WarriorMermaid
 *   - PrincessMermaid
 *   - Main
 */

package animals;

/*
 * This Main class just shows how everything works together.
 * You're encouraged to play around with the classes and make sure 
 * they do what you expect.
 */
public class Main {

	public static void main(String[] args) {
		// Ariel is a PrincessMermaid object.
		PrincessMermaid ariel = new PrincessMermaid();
		
		// She can do anything a Mermaid can do.
		ariel.talkToFish(new Fish());
		
		// She can do everything Mermaid's promise to do using interfaces.
		ariel.swim();
		
		// She also has some methods specific to PrincessMermaids.
		ariel.passLaw();
		
		// Triton is a WarriorMermaid object.
		WarriorMermaid triton = new WarriorMermaid();
		
		// He cannot cast a law (try commenting out the next line).
		// triton.passLaw();
		
		// Hans is another WarriorMermaid object.
		WarriorMermaid hans = new WarriorMermaid();
		
	}

}
