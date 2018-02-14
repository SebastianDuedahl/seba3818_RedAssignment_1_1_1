import java.io.Serializable;
import java.util.ArrayList;

public class GroceryList2 implements Serializable
{
    ArrayList<GroceryItemOrder> groceryItemOrdersArrayList = new ArrayList<>();
    int totalCost = 0;

    public void addToList(GroceryItemOrder newItem)
    {
        if(groceryItemOrdersArrayList.size() <= 10)
        {
            groceryItemOrdersArrayList.add(newItem);
        }else
        {
            System.out.println("liste lang");
        }


    }
    public int getTotalCost()
    {

        totalCost = 0;

        for (GroceryItemOrder groceryItem: groceryItemOrdersArrayList)
        {
            totalCost = groceryItem.getPrice() + totalCost;

        }
        return totalCost;

    }

    @Override
    public String toString()
    {
        totalCost = getTotalCost();
        return
                groceryItemOrdersArrayList +
                "\nTotal cost = " + totalCost;
    }
    public GroceryItemOrder getItem( String name)
    {
        for (GroceryItemOrder groceryItem: groceryItemOrdersArrayList)
        {
            if(name.equals((groceryItem.getItemName())))
            {
                return groceryItem;
            }
        }
        return null;
    }

}
