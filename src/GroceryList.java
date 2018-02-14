import java.util.Arrays;

public class GroceryList
{
    GroceryItemOrder[] grocery;
    int groceryNumber;


    public GroceryList(){
        grocery = new GroceryItemOrder[10];
        groceryNumber = 0;

    }
    public void add(GroceryItemOrder itemGrocery){
        this.grocery[groceryNumber] = itemGrocery;
        groceryNumber++;
    }
    public int getTotalCost() {

        int totalCost = 0;

       try
       {

           for (int i = 0; i < this.groceryNumber; i++)
           {
               totalCost += this.grocery[i].getCost();
           }
       } catch (NullPointerException NPe)
       {
           return totalCost;
       }

        return totalCost;
    }

    @Override
    public String toString()
    {
        return "GroceryList" +
                "grocery" + Arrays.toString(grocery) +
                ", groceryNumber=" + groceryNumber +
                '}';
    }
}
