import javax.swing.JOptionPane;
public class Pay
{
    public static void main(String[] args)
    {
        int skill, retirement = 0, hours, regular, overtime;
        double rate, cost = 0, rplan, overpay = 1.5, total, option = 0;
        String skillstring, optionstring, retirementstring, hoursstring;
        hoursstring = JOptionPane.showInputDialog(null,"Insert hours worked");
        skillstring = JOptionPane.showInputDialog(null, "Insert your skill level(1, 2, or 3)");
        hours = Integer.parseInt(hoursstring);
        skill = Integer.parseInt(skillstring);
        overtime = hours % 10;
        regular = hours - overtime;
        if(skill == 1)
        {
            rate = 17;
            overpay = overpay * rate;
            total = (rate * regular) + (overpay * overtime);
            JOptionPane.showMessageDialog(null, "Hours worked: " + hours + "\nPay rate: " + rate + "\nRegular pay: " + (regular * rate) + "\nOvertime pay: " + (overpay * overtime) + "\nTotal pay without deduction: " + total + "\nItemized Deduction: " + cost + "\nNet Total: " + (total - cost));
            System.exit(0);
        }
        optionstring = JOptionPane.showInputDialog(null, "Select your insurance option:\n1 - Medical Insurance\n2 - Dental Insurance\n3 - Long-term disability insurance");
        option = Integer.parseInt(optionstring);
        if(skill == 2)
        {
            rate = 20;
            overpay = overpay * rate;
            total = (rate * regular) + (overpay * overtime);
            if(option == 1)
                cost = 32.50;
            if(option == 2)
                cost = 20;
            if(option == 3)
                cost = 10;
            if(cost > total)
                JOptionPane.showMessageDialog(null, "Error");
            else
                JOptionPane.showMessageDialog(null, "Hours worked: " + hours + "\nPay rate: " + rate + "\nRegular pay: " + (regular * rate) + "\nOvertime pay: " + (overpay * overtime) + "\nTotal pay without deduction: " + total + "\nItemized Deduction: " + cost + "\nNet Total: " + (total - cost));
            System.exit(0);
        }
        if(skill == 3)
        {
            rate = 22;
            overpay = overpay * rate;
            total = (rate * regular) + (overpay * overtime);
            if(option == 1)
                cost = 32.50;
            if(option == 2)
                cost = 20;
            if(option == 3)
                cost = 10;
            retirement = JOptionPane.showConfirmDialog(null, "Would you like to participate in the reirement plan at 3% gross pay?");
            if(retirement == 0)
            {
                rplan = total * 0.03;
                JOptionPane.showMessageDialog(null, "Hours worked: " + hours + "\nPay rate: " + rate + "\nRegular pay: " + (regular * rate) + "\nOvertime pay: " + (overpay * overtime) + "\nTotal pay without deduction: " + total + "\nItemized Deduction: " + (cost + rplan) + "\nNet Total: " + ((total - cost) - rplan));
            }
            if(retirement == 1)
                JOptionPane.showMessageDialog(null, "Hours worked: " + hours + "\nPay rate: " + rate + "\nRegular pay: " + (regular * rate) + "\nOvertime pay: " + (overpay * overtime) + "\nTotal pay without deduction: " + total + "\nItemized Deduction: " + cost + "\nNet Total: " + (total - cost));
            if(retirement == 2)
                System.exit(0);
            System.exit(0);
        }
    }
}
