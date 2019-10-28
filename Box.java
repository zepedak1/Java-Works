public class Box
{
    public int length, width, height;
    public void make(int length)
    {
	this.width = 0;
	this.height = 0;
	System.out.println("Length: " + length);
	System.out.println("Width: " + this.width);
	System.out.println("Height: " + this.height);
	System.out.println("Line Created");
    }
    public void make(int length, int width)
    {
	this.height = 0;
	System.out.println("Length: " + length);
	System.out.println("Width: " + width);
	System.out.println("Height: " + this.height);
	System.out.println("Rectangle Created");
    }
    public void make(int length, int width, int height)
    {
	System.out.println("Length: " + length);
	System.out.println("Width: " + width);
	System.out.println("Height: " + height);
	System.out.println("Box Created");
    }
}