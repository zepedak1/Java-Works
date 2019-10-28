import java.util.Random;
import javax.swing.JOptionPane;
public class Lottery
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        final int limit = 999;
        int number1, number2, number3, rnumber1, rnumber2, rnumber3, count = 0, tcount = 0, fcount = 0;
        //count = any matching, tcount = three matching not in order, fcount = mathcing in order
        String number1string, number2string, number3string;
        rnumber1 = rand.nextInt(limit);
        rnumber2 = rand.nextInt(limit);
        rnumber3 = rand.nextInt(limit);
        number1string = JOptionPane.showInputDialog(null, "Enter a number between 0 and 9");
        number1 = Integer.parseInt(number1string);
        number2string = JOptionPane.showInputDialog(null, "Enter a number between 0 and 9");
        number2 = Integer.parseInt(number2string);
        number3string = JOptionPane.showInputDialog(null, "Enter a number between 0 and 9");
        number3 = Integer.parseInt(number3string);
        if(number1 == rnumber1)
        {
            count++;
            fcount++;
        }
        if(number1 == rnumber2 || number1 == rnumber3 && count != 1)
        {
            tcount++;
        }
        if(number2 != number1 && number2 == rnumber2)
        {
            count++;
            fcount++;
        }
        if(number2 == number1 || number2 == number3 && count != 2)
        {
            tcount++;
        }
    }
}
