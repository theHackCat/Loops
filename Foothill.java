public class Foothill
{
   public static void main(String[] args)
   {
      int number, squared;
      final int MAX = 11;
      
      for (number = 1; number < MAX; number++)
      {
         squared = number * number;
         System.out.println("Square of " + number + " is " + squared);
      }
   }

}

/* -------------------- paste of run from console window -------------------------

Square of 1 is 1
Square of 2 is 4
Square of 3 is 9
Square of 4 is 16
Square of 5 is 25
Square of 6 is 36
Square of 7 is 49
Square of 8 is 64
Square of 9 is 81
Square of 10 is 100

---------------------------------------------------------------------------------*/