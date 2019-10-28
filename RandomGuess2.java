import javax.swing.JOptionPane;
public class RandomGuess2
{
    public static void main(String[] args)
    {
        int rnumber = (1 + (int)(Math.random() * 10)), number;
        String numberstring;
        numberstring = JOptionPane.showInputDialog(null, "Enter a number between 1 and 10");
        number = Integer.parseInt(numberstring);
        JOptionPane.showMessageDialog(null, "The number is " + rnumber);
        if(number == rnumber)
            JOptionPane.showMessageDialog(null, "You guessed the random number");
        else
            JOptionPane.showMessageDialog(null, "You guessed the wrong number");
        System.exit(0);
    }
}
