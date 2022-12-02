
public class Main {
 public static class Arr{
     public Boolean Polindrome (String first) {
         String second = "";
         String third = first.replace(" ", " ");
         char[]  got =  third.toCharArray();
         char[] got2 = new char[got.length];
         for (int i = got.length-1; i >= 0;) {
             for (int j = 0; j < got2.length; j++) {
                 got2[j] = got[i];
                 i--;
                 second += got2[j];
             }
         }
         System.out.println(second);
         System.out.println(third);
         return second.equalsIgnoreCase(third);
     }

     public static void main(String args[]) {
         Arr third = new Arr();
         System.out.println(third.Polindrome("Казак"));
     }
 }
}







