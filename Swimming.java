import javax.swing.JOptionPane;
public class Swimming
{
    public static void main(String[] args)
    {
	int cleaningfee, fillingfee;
	double length, width, depth, volume, flowrate, gallonsperfoot, capacity, cost;
	String lengthstring, widthstring, depthstring;
	cleaningfee = 75;
	fillingfee = 8;
	flowrate = 50;
	gallonsperfoot = 7.5;
	lengthstring = JOptionPane.showInputDialog(null, "What is the length of the pool?", "Length", JOptionPane.QUESTION_MESSAGE);
	widthstring = JOptionPane.showInputDialog(null, "What is the width of the pool?", "Width", JOptionPane.QUESTION_MESSAGE);
	depthstring = JOptionPane.showInputDialog(null, "What is the depth of the pool?", "Depth", JOptionPane.QUESTION_MESSAGE);
	length = Double.parseDouble(lengthstring);
	width = Double.parseDouble(widthstring);
	depth = Double.parseDouble(depthstring);
	volume = length * width * depth;
	capacity = volume * gallonsperfoot;
	cost = (capacity / 50) * 8;
	JOptionPane.showMessageDialog(null, "The fee for pool services is $" + cost);
    }
}