package characterCount;

public class CharacterCounter {

    private int counter;
    private int line;
    private String myString;


    public CharacterCounter() {
        counter = 0;
        line = 0;
        myString = "Hej";
    }


    public int getLine() {
        return line;
    }

    public String getString() {
        return myString;
    }

    public int getStringLength() {
        return myString.length();
    }


    public void IncreaseRows() {
        line++;
    }

    public void counting() {
        counter++;
    }


    public void countLines(String input) {
        if (input != null)
            line++;
    }

    public void countCharacters(String input) {
        for (int i = 0; i <= input.length(); i++)
            counter++;

    }

    public void Stopper(String input) {

        if (input.equals("stop")) {
            counter = counter - 4;
            System.out.println("Shutting down...");
            System.out.println("Total characters used, excluding \"stop\": " + counter);
            System.out.println("Rows of text:" + line);
        }
    }
}







