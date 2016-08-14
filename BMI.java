/*write a program which allows the user
to enter weight in pounds, height in feet(6),
height in inches(3), and calculates BMI.
And then tells if the person is 
uderweight, normal, overweight, or obese
*/  

//importing a scanner
   import java.util.Scanner;
   
//Name of the Class   
public class BMI {
   
   //Main Method
   public static void main(String[] args) {
      
      //creating a new scanner
      Scanner scanner = new Scanner(System.in);
      
      //asking user to enter weight in pounds
      System.out.println("Enter weight in pounds: ");
      
      double weight = scanner.nextDouble();
      
      //asking user for height in feet
      System.out.println("Enter feet: ");
      
      double feet = scanner.nextDouble();
      
      //asking user for height in inches
      System.out.println("Enter inches: ");
      
      double inches = scanner.nextDouble();
      
      //calculating total number of inches      
      double height_inches = (feet * 12) + inches;
      
      //calculating bmi
      double bmi = ((weight * 703) / (height_inches * height_inches));
      
      System.out.println("Height in inches: " + (int)height_inches);
      
      System.out.println("BMI is: " + bmi);
      
      String range = "";//declaring a string named range and
                        //setting its value to empty string
      
      if (bmi < 18.5) {//bmi less than 18.5
         range = "Underweight";
      } else if (bmi >= 18.5 && bmi <= 24.9) {//bmi between 18.5 and 24.9
         range = "Normal or Healthy Weight";
      } else if ( bmi >= 25.0 && bmi <= 29.9) {//bmi between 25 and 29.9
         range = "Overweight";
      } else if ( bmi >= 30) {//bmi greater than 30
         range = "Obese";     
      }  else {
         range = "oops, logic fail...";//bad logic check
      }
      
   System.out.println(range);     
         
   }
}//end of class BMI   