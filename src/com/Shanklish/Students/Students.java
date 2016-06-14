package com.Shanklish.Students;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import org.omg.CORBA.PUBLIC_MEMBER;


public class Students
    {

	public static void main( String[] args )
	{
	    Scanner scan = new Scanner(System.in);
	    
	    String choice = "";
	    int id = 0;
	    
	   
	  
                 do
                   {
        		try
			    { 
                                System.out.println("Welcome to our Java Class. Which student would you like to learn more about? (Enter a number between 1 and 7");
                                id = scan.nextInt();
                                scan.nextLine();
                                
                                if(id < 0 || id >= 8)
                                    throw new NumberFormatException("ID is out of range. Please enter a number from 1 - 7");
                                
			    }
        		    
        		    catch(NumberFormatException e1)
        		   {
        		    System.out.println("Integer is out of range");
        		    System.out.println(" ");
        		    
        		   }
                                     
                	    catch(InputMismatchException e)
                      	    {
                      		System.out.println("That ID does not exist. Please enter an valid ID number");
                      		choice = "n";
                      		
                      	    }
              	
          	    
                 } while ( choice.equalsIgnoreCase("y") );
                 
               //TO-DO *find a way to make this loop and start from the top.  
                 try 
		   {
                     System.out.println(askQuestions(id));
		   }
		
		catch (Exception e)
		   {
		       System.out.println(" what?");
		       choice = "y";
		   }
		
              	 
                    System.out.println("Would you like to learn about a different student?");
         	      choice = scan.nextLine();
	
	}
	
	
	
	    
	    public static String askQuestions(int id) throws Exception
	    {
		
		Random rand = new Random();
		
		String s = "";
		String studentName="";
		String studentHomeTown="";
	        String studentFood="";
		

	    	switch(id)
	    	{
	    	    case 1:
	    		studentName = "Jimmy Morrison";
	    		studentHomeTown = "Atlanta";
	    		studentFood = "Pasta";
	    		break;
	    		
	    	    case 2:
	    		studentName  = "Bob Dylan";
	    		studentHomeTown= "Duluth";
	    		studentFood = "Steak";
	    		break;
	    		
	    	    case 3:
	    		studentName = "Jimmy Page";
	    		studentHomeTown = "Detroit";
	    		studentFood = "Chili";
	    		break;
	    		
	    	    case 4:
	    		studentName = "Cab Calloway";
	    		studentHomeTown = "Miami";
	    		studentFood = "Hamburger";
	    		break;
	    		
	    	    case 5:
	    		studentName = "Django Reinhardt";
	    		studentHomeTown = "Siberia";
	    		studentFood = "Potato Salad";
	    		break;
	    		
	    	    case 6:
	    		studentName = "Jon Stewart";
	    		studentHomeTown = "New York";
	    		studentFood = "Pizza";
	    		break;
	    		
	    	    case 7:
	    		studentName = "Ozzy Osbourne";
	    		studentHomeTown = "England";
	    		studentFood = "rice and beans";
	    		break;
	    		
	    	   default:
	    	      throw new Exception ("Didnt work");
	    	     
	    	}
	    	
	    	if(id >= 1 && id <= 7)
	    	    {
	    		Scanner scan = new Scanner(System.in);
	    		
        	    	System.out.println("Student " + id + " is " + studentName+". What would you like to know about this student?(Enter Age, Hometown or favorite food");
        	    	String studentInfo = scan.nextLine();
        	    	
        	    	if(studentInfo.equalsIgnoreCase("age"))
        	    	  s =  studentName + " is " + rand.nextInt(40) + " years old.";
        	    	
        	    	else if(studentInfo.equalsIgnoreCase("hometown"))
        	    	  s =  studentName + " is from " + studentHomeTown;
        	    	
        	    	else if (studentInfo.equalsIgnoreCase("favorite food"))
        	    	 s =  studentName + "'s favorite food is " + studentFood;
        	    	
	    	    }
	    	
	    	return s;
	    }
                   }
	
	    
	  
	    
	
	    
	
	

