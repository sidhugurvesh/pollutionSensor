package midterm2bpractical;

/**
 *
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Midterm2bPractical
{
   /**
    * @param args the command line arguments
    */
   public static void main (String[] args) throws Exception
   {
      CookiePacker c1 = new CookiePacker("Rich's Best Cookies", 300);
      c1.setTotalBoxes(5);
      System.out.println("Total Boxes: " + c1.getTotalBoxes());
      System.out.println("Total Cookies: " + c1.getTotalCookies());
      System.out.println("Packing 1 box of cookies");
      c1.packCookies();
      System.out.println("Packing 3 boxes of cookies");
      c1.packCookies(3);
      System.out.println("Total Boxes: " + c1.getTotalBoxes());
      System.out.println("Total Cookies: " + c1.getTotalCookies());

   }
}
