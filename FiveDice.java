public class FiveDice
{
    public static void main(String[] args)
    {
	Die playerd1 = new Die();
	Die playerd2 = new Die();
	Die playerd3 = new Die();
	Die playerd4 = new Die();
	Die playerd5 = new Die();
	Die compd1 = new Die();
	Die compd2 = new Die();
	Die compd3 = new Die();
	Die compd4 = new Die();
	Die compd5 = new Die();
	System.out.println("Player Rolls:");
	playerd1.setDie();
	System.out.println("Die 1:" + playerd1.getDie());
	playerd2.setDie();
	System.out.println("Die 2:" + playerd2.getDie());
	playerd3.setDie();
	System.out.println("Die 3:" + playerd3.getDie());
	playerd4.setDie();
	System.out.println("Die 4:" + playerd4.getDie());
	playerd5.setDie();
	System.out.println("Die 5:" + playerd5.getDie());
	System.out.println("\nComputer Rolls:");
	compd1.setDie();
	System.out.println("Die 1:" + compd1.getDie());
	compd2.setDie();
	System.out.println("Die 2:" + compd2.getDie());
	compd3.setDie();
	System.out.println("Die 3:" + compd3.getDie());
	compd4.setDie();
	System.out.println("Die 4:" + compd4.getDie());
	compd5.setDie();
	System.out.println("Die 5:" + compd5.getDie());
    }
}