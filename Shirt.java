public class Shirt
{
    public int size, sleeve;
    public static String material = "cotton";
    public void Construct(int size, int sleeve)
    {
	this.size = size;
	this.sleeve = sleeve;
	System.out.println("Shirt size: " + size);
	System.out.println("Sleeve size: " + sleeve);
	System.out.println("Material: " + this.material);
    }
}