package animals;

public class Human implements Talker {
	private String talkString;
	private String singString;
	
	public Human(int age, String talkWords, String singWords) {
		talkString = talkWords;
		singString = singWords;
	}
	
	@Override
	public String talk() {
		// Anything in the return statement is the output of a method.
		// In this case, the value of talkString is spit out when you run 'Human.talk()'.
		return talkString;
	}

	@Override
	public String sing() {
		return singString;
	}
}
