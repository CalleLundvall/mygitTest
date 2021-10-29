package characterCount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterCountTest {


    @Test
    public void testRowsInput() {

        //Arrange
        CharacterCounter counter = new CharacterCounter();

        //Act
        int actual = counter.getLine();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);


    }

    @Test
    public void testRowsIncrease() {
        //Arrange
        CharacterCounter counter = new CharacterCounter();

        //Act
        counter.IncreaseRows();
        int actual = counter.getLine();

        //Assert
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testCharacters() {
        //Arrange
        CharacterCounter counter = new CharacterCounter();

        //Act

        String actual = counter.getString();

        //Assert
        String expected = "Hej";
        assertEquals(expected, actual);
    }


    @Test
    public void testCharacterCounting() {
        //Arrange
        CharacterCounter counter = new CharacterCounter();

        //Act
        counter.counting();

        int actual = counter.getStringLength();

        //Assert
        int expected = 3;
        assertEquals(expected, actual);
    }
}








