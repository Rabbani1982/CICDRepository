package Cucumberpkg;

public class Jumpingstmt3 {

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==3||i==5||i==7)   // means skip the 5 number
			{
				continue; //if 5==5 value is increment means i=6 
			}
			System.out.println(i);
		}

	}

}
