import java.lang.Math;
public class Die
{
    private static int myValue;
    private static int HIGHEST_DIE_VALUE = 6;
    private static int LOWEST_DIE_VALUE = 1;
    public void setDie()
    {
	myValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
    }
    public int getDie()
    {
	return myValue;
    }
}