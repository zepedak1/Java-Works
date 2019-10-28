public class TwoCharacters
{
    public static void main(String[] args)
    {
	MyCharacter character1 = new MyCharacter();
	MyCharacter character2 = new MyCharacter();
	character1.setAge(25);
	character1.setHeight(6);
	character1.setEyeColor("Green");
	character2.setAge(35);
	character2.setHeight(5);
	character2.setEyeColor("Brown");
	System.out.println("Character 1:");
	System.out.println("Age: " + character1.getAge() + ", Height: " + character1.getHeight() + "ft, and Height: " + character1.getEyeColor());
	System.out.println("Character 2:");
	System.out.println("Age: " + character2.getAge() + ", Height: " + character2.getHeight() + "ft, and Height: " + character2.getEyeColor());
    }
}