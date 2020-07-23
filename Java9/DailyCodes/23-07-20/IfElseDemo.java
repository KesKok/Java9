class IfElseDemo
{
	public static void main(String[] args)
	{
		int a=0, b=2,c=4;
		if((a<b || c>b ) &&(a++ == --b ))
		{
			System.out.println("In if Statement");
		}
		else
		{
			System.out.println("In else Statement");

		}
			System.out.println("out of If and else Statement");
	}
}
