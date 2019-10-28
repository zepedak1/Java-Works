public class TestCheckup
{
    public static void main(String[] args)
    {
	Checkup patient1 = new Checkup();
	int patient;
	double systolic, diastolic, ldl, hdl;
	patient1.setPatient(12345);
	patient1.setSystolic(110);
	patient1.setDiastolic(78);
	patient1.setLDL(100);
	patient1.setHDL(40);
	patient = patient1.getPatient();
	systolic = patient1.getSystolic();
	diastolic = patient1.getDiastolic();
	ldl = patient1.getLDL();
	hdl = patient1.getHDL();
	System.out.println("Patient: " + patient);
	System.out.println("Systolic pressure: " + systolic);
	System.out.println("Diastolic pressure: " + diastolic);
	System.out.println("LDL cholesteral: " + ldl);
	System.out.println("HDL cholesteral: " + hdl);
	patient1.computeRatio();
	patient1.ExplainRatio();
    }
}