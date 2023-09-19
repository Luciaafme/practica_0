public class HundredthPrime
{
   public static void main(String[] args)
   {
      int count = 0;
      int num = 2;
      while (count < 100) {
         if (isPrime(num)) {
            count++;
            if (count == 100) {
               System.out.println(num);
            }
         }
         num++;
      }
   }

   public static boolean isPrime(int num) {
      if (num <= 1) {
         return false;
      }
      for (int i = 2; i <= Math.sqrt(num); i++) {
         if (num % i == 0) {
            return false;
         }
      }
      return true;
   }
}
