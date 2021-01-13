import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

class MyStringTest {

    private MyString myString;
    private Object anObject;
    private Boolean result;

    @Test
    public void testSameObject() {
        //Set Up
        this.myString = new MyString("a");
        this.anObject = myString;
        //Exercise
        this.result = myString.equals(anObject);
        //Verify
        assertTrue(result);
        //TearDown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }
    @Test
    public void testDifferentTypeSameString() {
        //Set Up
        this.myString = new MyString("a");
        this.anObject = new String("a");
        //Exercise
        this.result = myString.equals(anObject);
        //Verify
        assertFalse(result);
        //TearDown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testSameTypeDifferentLength() {
        // Set Up
        this.myString = new MyString("aa");
        this.anObject = new MyString("aa ");
        // Execute
        result = myString.equals(anObject);
        // Verify
        assertFalse(result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testSameTypeDifferentString() {
        // Set Up
        this.myString = new MyString("a");
        this.anObject = new MyString("b");
        // Execute
        this.result = myString.equals(anObject);
        // Verify
        assertFalse(result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testSameTypeSameString() {
        // Set Up
        this.myString = new MyString("a");
        this.anObject = new MyString("a");
        // Execute
        this.result = myString.equals(anObject);
        // Verify
        assertTrue(result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

    @Test
    public void testEmpty() {
        // Set Up
        this.myString = new MyString("");
        this.anObject = new MyString("");
        // Execute
        result = myString.equals(anObject);
        // Verify
        assertTrue(result);
        // Teardown
        this.myString = null;
        this.anObject = null;
        this.result = null;
    }

}