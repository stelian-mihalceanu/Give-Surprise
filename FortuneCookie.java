import java.util.Random;
import java.util.ArrayList;

public class FortuneCookie implements ISurprise {
	
	private String message;
	private static Random randomNr = new Random();
	
	public FortuneCookie(String message) {
		this.message = message;
	}
	
	@Override
	public void enjoy() {
	    System.out.println("You received a fortune cookie with the message" + this.message);
	  }
	
	@Override
	public String toString() {
		return "Mesajul din ravas este: " + message + "";
	}
	
	public static FortuneCookie generate() { 
		ArrayList<String> zicale = new ArrayList<>();
		zicale.add("Be yourself; everyone else is already taken. - Oscar Wilde");
		zicale.add("I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.- Maya Angelou");
		zicale.add("So many books, so little time.  ― Frank Zappa");
		zicale.add("You only live once, but if you do it right, once is enough. ― Mae West");
		zicale.add("Be the change that you wish to see in the world. ― Mahatma Gandhi");
		zicale.add("In three words I can sum up everything I've learned about life: it goes on.― Robert Frost");
		zicale.add("If you want to know what a man's like, take a good look at how he treats his inferiors, not his equals. -J.K. Rowling");		
		zicale.add("A friend is someone who knows all about you and still loves you. ― Elbert Hubbard"); 
		zicale.add("No one can make you feel inferior without your consent.― Eleanor Roosevelt"); 
		zicale.add("If you tell the truth, you don't have to remember anything.If you tell the truth, you don't have to remember anything. ― Mark Twain");
		zicale.add("Always forgive your enemies; nothing annoys them so much. ― Oscar Wilde");
		zicale.add("To live is the rarest thing in the world. Most people exist, that is all.― Oscar Wilde");
		zicale.add("Live as if you were to die tomorrow. Learn as if you were to live forever ― Mahatma Gandhi");
		zicale.add("Darkness cannot drive out darkness: only light can do that. Hate cannot drive out hate: only love can do that. ― Martin Luther King Jr.");
		zicale.add("Without music, life would be a mistake. ― Friedrich Nietzsche"); 
		zicale.add("We accept the love we think we deserve. ― Stephen Chbosky");
		zicale.add("It is better to be hated for what you are than to be loved for what you are not. ― Andre Gide");
		zicale.add("The person, be it gentleman or lady, who has not pleasure in a good novel, must be intolerably stupid. ― Jane Austen");
		zicale.add("There are only two ways to live your life. One is as though nothing is a miracle. The other is as though everything is a miracle.― Albert Einstein");
		zicale.add("It does not do to dwell on dreams and forget to live. ― J.K. Rowling");
		
		return new FortuneCookie(zicale.get(FortuneCookie.randomNr.nextInt(20)));
	}
	
}
