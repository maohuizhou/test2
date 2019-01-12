package main.java;

/**
 * Created by bztlgx on 5/11/2018.
 */
public class TestString {

		public static void main(String[] args) {
			String Str1= new String("ABCD");
			String Str2= new String("ABCD");
			if(Str1 == Str2)
			{
				System.out.println("String 1 == String 2 is true");
			}
			else
			{
				System.out.println("String 1 == String 2 is false");
				String Str3 = Str2;
				if( Str2 == Str3)
				{
					System.out.println("String 2 == String 3 is true");
				}
				else
				{
					System.out.println("String 2 == String 3 is false");
				}
				if(Str1.equals(Str2))
				{
					System.out.println("String 1 equals string 2 is true");
				}
				else
				{
					System.out.println("String 1 equals string 2 is false");
				}
			}}
}
