/***********************************************************************
@Title:	LastNameFirstNameRestaurantBill
@Purpose:	To get familiar with simple calculations and comparison in Java
@Author:    (Matthews Devym)
@Date:   	(9/16/2019)
@Version:	1.0
************************************************************************/
import  java.util.Scanner;
import java.text.DecimalFormat;

  public class MatthewsDevynRestruantBill
{

  public static void main (String[] args){

	double Bill;
	double People;
	double Satisfaction;
	double Taxes = 0.0825;
	double Total;

  Scanner keyboard= new Scanner(System.in);

			                                          //Telling the user how much was meal and how many people.
     System.out.print("How much the meal? $");
     Bill= keyboard.nextDouble();

	System.out.println("\n8.25% tax increase will be added to your bill");

	Bill= (Bill * Taxes)+ Bill;
	System.out.println(+ Bill);

    System.out.println("\nHow many people were there?");
    People= keyboard.nextInt();
  									                                  //If they're more than six people
  if(People>=6)
  		{System.out.print("You have more than six people in your group. ");
    	System.out.println("A 25% tip will be added.");

    System.out.println("\nSatisfaction Level   \t Service\t    tip rate");
	 	 System.out.println("1-3                  \t Poor Service\t\t 35%" );
	 	 System.out.println("4-5                 \t Adequate Service\t 40%");
	 	 System.out.println("6-8                 \t Good Service\t\t 45%");
	 	 System.out.println("9-10              \t Excellent Service\t 50%");
 	Satisfaction  = keyboard.nextInt();

	if   ( Satisfaction>=1 && Satisfaction<=3)
											                             //If the user S.L is 1-3
            {
			   Satisfaction= 0.35;
			   Total= (Bill * Satisfaction)+ Bill;
			     System.out.println("  Meal Charge $" + Bill);
			   	 System.out.println("  Tip         35%");
			   	 System.out.println("              _______");
			     System.out.println("  Total       $" +  Total);

				 System.out.println("\nYour Bill total is $" + Total);
	        }
	          										                    //If the user S.L is 4-5
	if( Satisfaction>=4 && Satisfaction<=5)
			  { Satisfaction= 0.40;
			   Total= (Bill * Satisfaction)+ Bill;
			  System.out.println("  Meal Charge $" + Bill);
			  System.out.println("  Tip         40%");
			  System.out.println("              _______");
			  System.out.println("  Total       $" +  Total);

			  System.out.println("Your Bill total is $" + Total);
	        }
	        														      //If the user S.L is 6-8
		if( Satisfaction>=6 && Satisfaction<=8)
				  { Satisfaction= 0.45;
				   Total= (Bill * Satisfaction)+ Bill;
				     System.out.println("  Meal Charge $" + Bill);
				   	 System.out.println("  Tip         45%");
				   	 System.out.println("              _______");
			         System.out.println("  Total       $" +  Total);

				     System.out.println("Your Bill total is $" + Total);
	        }
	if( Satisfaction>=9 && Satisfaction<=10)							//If the user S.L is 9-10
			  { Satisfaction= 0.50;
			   Total= (Bill * Satisfaction)+ Bill;
		     System.out.println("  Meal Charge $" + Bill);
		   	 System.out.println("  Tip         20%");
		   	 System.out.println("              _______");
			 System.out.println("  Total       $" +  Total);

		    System.out.println("Your Bill total is $" + Total);
	}
}
		                                                              //If there are less than 6 people
	else{
 	 System.out.println("Satisfaction Level   \t Service\t    tip rate");
 	 System.out.println("1-3                  \t Poor Service\t\t 10%" );
 	 System.out.println("4-5                 \t Adequate Service\t 15%");
 	 System.out.println("6-8                 \t Good Service\t\t 20%");
 	 System.out.println("9-10              \t Excellent Service\t 25%");
 	Satisfaction  = keyboard.nextInt();

                                                        //If the user S.L is 1-3
	if( Satisfaction>=1 && Satisfaction<=3)
		  { Satisfaction= 0.10;
		   Total= (Bill * Satisfaction)+ Bill;
		     System.out.println("  Meal Charge $" + Bill);
		   	 System.out.println("  Tip         10%");
		   	 System.out.println("              _______");
			 System.out.println("  Total       $" +  Total);

		     System.out.println("\nYour Bill total is $" + Total);
          }
          												 //If the user S.L is 4-5
if( Satisfaction>=4 && Satisfaction<=5)
		  { Satisfaction= 0.15;
		   Total= (Bill * Satisfaction)+ Bill;
		     System.out.println("  Meal Charge $" + Bill);
		     System.out.println("  Tip         15%");
		     System.out.println("              _______");
			 System.out.println("  Total       $" +  Total);

			System.out.println("\nYour Bill total is $" + Total);
        }
        													 //If the user S.L is 6-8
	if( Satisfaction>=6 && Satisfaction<=8)
			  { Satisfaction= 0.20;
			   Total= (Bill * Satisfaction)+ Bill;

			  System.out.println("  Meal Charge $" + Bill);
			  System.out.println("  Tip         20%");
			  System.out.println("              _______");
			  System.out.println("  Total       $" +  Total);

			   System.out.println("\nYour Bill total is $" + Total);
        }
if( Satisfaction>=9 && Satisfaction<=10)							//If the user S.L is 9-10
		  { Satisfaction= 0.25;
		   Total= (Bill * Satisfaction)+ Bill;
		  System.out.println("  Meal Charge $" + Bill);
		  System.out.println("  Tip         25%");
		  System.out.println("              _______");
		  System.out.println("  Total       $" +  Total);

		System.out.println("\nYour Bill total is $" + Total);
        }
	}
   }
   }

