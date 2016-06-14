package com.Shanklish.Students;
import java.util.Scanner;


public class StudentsArray
    {

	public static void main( String[] args )
	{
	    Scanner scan = new Scanner(System.in);
	    
	    String answer = "y";		// default loop controller
	    
	    String name = ""; 			// Placeholder variable
		   
	    
	    boolean anotherQuestion = true;	//inner loop controller
	    
	    int id = 0;				//initializes ID variable
	    
	    System.out.println("Welcome to our Java Class");
	    
	    while(answer.equalsIgnoreCase("y"))
		{       
		    try
			{
			    System.out.println( "Please enter the ID number(between 1 and 7) of the student you would like to know more about");
                	    id = scan.nextInt();
                	    scan.nextLine();
                	    
                	     name = getName(id);		//Retrieves name from method
			}
		    
		    catch (Exception e)
			{
			    System.out.println("Please enter a valid ID number");		//If ID is out of range.
			    break;
			}
                	    
        		
        	    anotherQuestion = true;
        	    
        	    while(anotherQuestion)
        		{
                	    System.out.println("What would you like to know about " + name + "? Try age, town or food");
                	    String choice = scan.nextLine();
                	   // scan.nextLine();
                	    
                	    try
				{
				    if(choice.equalsIgnoreCase("age"))		
				        System.out.println(name + " is " + getAge(id) + " years old.");		
				    
				    else if (choice.equalsIgnoreCase("town"))
					System.out.println(name + " is from " + getTown(id));
				    
				    else if(choice.equalsIgnoreCase("food"))
					System.out.println(name + " loves to eat " + getFood(id));
				    
				    else 
					System.out.println("Please chose either age, town or favorite food");
				    
				    System.out.println("Is there anything else you would like to know about " + name + "?");
				    answer = scan.nextLine();
				    
				    if(answer.equalsIgnoreCase("n"))
				    anotherQuestion = false;
				}
			    catch (Exception e)
				{
				    System.out.println("Please chose one of the listed topics");
				}
               
        		}
        	    
        	    System.out.println("Would you like to learn about a different student?"); 
        	    answer = scan.nextLine();
        	    
        	    if(answer.equalsIgnoreCase("y"))
        		continue;
        	    else
        		break;
		}
		
	}
	
	public static String getName(int id) throws Exception
	{
	    
	    String [] studentNames = {"John", "Jim", "Bob", "Travis", "Frank", "Samantha", "Chelsea"};
	    return studentNames[id];
	    
	}
	
	public static String getTown(int id) throws Exception
	{
	    
	    String [] studentTown = {"Detroit", "New York", "San Francisco", "Duluth", "Los Angeles", "Flint", "Kalamazoo"};
	   return studentTown[id];
	    
	}
	
	public static int getAge(int id) throws Exception
	{
	    int [] studentAges = {27,23,31,29,34,50,19};
	    return studentAges[id];
	}
	
	public static String getFood(int id) throws Exception
	{
	    String [] studentFood = {"Pasta", "Pizza", "Hamburgers", "Hot Dogs", "Ribs", "Chicken Wings", "Ramen Noodles"};
	    
	   return studentFood[id];
	    
	}

    }
