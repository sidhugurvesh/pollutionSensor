package midterm2bpractical;
/**
 * @author Gurvesh Sidhu
 */
public class CookiePacker
{
   private int totalBoxes;
   private int totalCookies;
   private String companyName;
   private int boxNumber = 0;

   public CookiePacker (String sentence, int totalCookies)
   {
      this.companyName = sentence;
      this.totalCookies = totalCookies;
   }

   public void setTotalBoxes (int totalBoxes) throws Exception
   {
      if (totalBoxes < 0) {
         throw new Exception("Box numbers cannot be negative :" + totalBoxes);
      }
      else {
         this.totalBoxes = totalBoxes;
      }
   }

   public int getTotalBoxes ()
   {
      return this.totalBoxes;
   }

   public int getTotalCookies ()
   {
      return this.totalCookies;
   }

   public void packCookies ()
   {
      System.out.println("\t" + this.companyName + " - " + "Box #" + this.boxNumber);
      this.boxNumber++;
      this.totalCookies -= 50;
      this.totalBoxes--;
   }

   public void packCookies (int number) throws Exception
   {
      if (this.totalCookies < 50 || this.totalBoxes < 1) {
         throw new Exception("Either total cookies is less than 50 or totalBoxes is less than 1");

      }
      String output = "";
      for (int i = 0; i < number; i++) {
         System.out.println("\t" + this.companyName + " - " + "Box #" + this.boxNumber);
         this.boxNumber++;
         this.totalCookies -= 50;
         this.totalBoxes--;
      }
   }





}
