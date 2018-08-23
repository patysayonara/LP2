import java.util.Iterator;
import java.util.ArrayList;

/**
 * This class implements a technical support system.
 * It is the top level class in this project.
 * The support system communicates via text input/output
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input
 * from the user, and an object of class Responder to generate responses.
 * It contains a loop that repeatedly reads input and generates
 * output until the users wants to leave.
 */
public class SupportSystem
{
    private InputReader reader;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
    }

    /**
     * Start the technical support system. This will print a welcome message and enter
     * into a dialog with the user, until the user ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            ArrayList<String> input = reader.getInput();

            if(input.contains("bye")) {
                finished = true;
            }
            else {
                countWords(input);
            }
        }
        printGoodbye();
    }

    public void countWords(ArrayList<String> received){
	Iterator<String> iter = received.iterator();
	int count = 0;
	ArrayList<String> frequency = new ArrayList<String>();	

	for(String word: received){
		while(iter.hasNext()){
			if(iter.next().equals(word)){
				count++;
			}
		}
		if(!frequency.contains(word)){
			frequency.add(word);
			System.out.println(word + ": " + count);
		}
		count = 0;
		iter = received.iterator();
	}
	
    }


    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome! You can start writing the phrase from which the words will be counted.");
        System.out.println("Please type 'bye' if you want to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
