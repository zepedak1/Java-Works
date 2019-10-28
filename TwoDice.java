public class TwoDice
{
    public static void main(String[] args)
    {
	Die dice1 = new Die();
	Die dice2 = new Die();
	dice1.setDie();
	System.out.println("Dice 1: " + dice1.getDie());
	dice2.setDie();
	System.out.println("Dice 2: " + dice2.getDie());
    }
}