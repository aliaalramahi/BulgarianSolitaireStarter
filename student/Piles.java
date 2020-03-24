import java.util.ArrayList;
import java.util.Random;
/**
 * A class that plays Bulgarian Solitare. 
 * Version 1: Implement the playRound and toString methods.
 */
public class Piles
{
   private ArrayList<Integer> piles;

   /**
      Create a set of piles with a known (non-random) configuration for testing.
      @param pileSizes an array of numbers whose sum is 45
   */
   public Piles(int[] pileSizes)
   {
      piles = new ArrayList<>();
      for (int s : pileSizes)
         piles.add(((Integer) s));
   }

   /**
    * Return the string representation of the piles.
    * @return the string representation of the piles.
    */
   public String toString()
   {
       String tostring = "";
       for (int i = 0; i < piles.size(); i++)
       {
           tostring += piles.get(i).toString() + " ";
       }
       
       return tostring;
   }

   /**
      Play one round of the game.
   */
   public void playRound()
   {
      piles.add(new Integer(0));
      
      
      for (int i = 0; i < piles.size(); i++)
      {
          Integer current = piles.get(i);
          current = ((Integer) piles.get(i).intValue() - 1);
          if (current.intValue() == 0)
          {
            piles.remove(i);
            i--;
          }
          else
            piles.set(i, current);
            
          Integer last = piles.get(piles.size() - 1);
          last = ((Integer) last.intValue() + 1);
          piles.set(piles.size() - 1, last);
      }
      
   }
}
