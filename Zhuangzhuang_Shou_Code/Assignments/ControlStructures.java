package com.revature.assignments;

import java.util.Random;
import java.util.Scanner;

public class ControlStructures 
{
	public static void main(String[] args) 
	{
		//For-each loop, if statement
		int[] intArray = {2, 6, 13, 20};
		for (int num: intArray)
		{
			if (num % 2 == 0)
			{
				System.out.println(num);
			}
		}
		
		//For and while loop, if-else if-else statement
		Random ran = new Random();
		for (int i = 0; i < intArray.length; i++)
		{
			intArray[i] += ran.nextInt(10);
		}
		int index = 0;
		while (index < intArray.length)
		{
			if (intArray[index] > 15)
			{
				System.out.println(intArray[index] + " > 15");
			}
			else if (intArray[index] < 15)
			{
				System.out.println(intArray[index] + " < 15");
			}
			else
			{
				System.out.println(intArray[index] + " = 15");
			}
			index++;
		}
		
		//Do-while loop, switch statement
		Scanner in = new Scanner(System.in);
		int dayOfWeek;
		do
		{
			dayOfWeek = in.nextInt();
			switch (dayOfWeek)
			{
			case 1:
				System.out.println("It's Monday");
				break;
			case 2:
				System.out.println("It's Tuesday");
				break;
			case 3:
				System.out.println("It's Wednesday");
				break;
			case 4:
				System.out.println("It's Thursday");
				break;
			case 5:
				System.out.println("It's Friday");
				break;
			case 6:
				System.out.println("It's Saturday");
				break;
			case 7:
				System.out.println("It's Sunday");
				break;
			default:
				System.out.println("Unknown day of week");
			}
		} while (in.hasNextInt());
	}

}
