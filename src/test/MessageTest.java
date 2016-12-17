package test;

/**
 * Message test.
 */
public class MessageTest
{

    private final int number;

    /**
     * the constructor.
     *
     * @param number - the number.
     */
    public MessageTest(int number)
    {
        this.number = number;
    }

    /**
     * Print output.
     */
    public void print()
    {
        System.out.println(" ..... Number is " + number + "!");
    }

    /**
     * Get number.
     *
     * @return the number.
     */
    public int getNumber()
    {
        return number;
    }
}
