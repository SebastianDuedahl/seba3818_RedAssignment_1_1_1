

public class test
{
public static void main(String[] args){

Filehandler filehandler = new Filehandler();



    GroceryList GroceryList2 = new GroceryList();

    System.out.println("This is your grocery list: ");
    GroceryItemOrder gIO1 = new GroceryItemOrder("bacon",1,10);
    GroceryItemOrder gIO2 = new GroceryItemOrder("Pasta", 1, 5);
    GroceryItemOrder gIO3 = new GroceryItemOrder("Pesto",1,7);
    GroceryItemOrder gIO4 = new GroceryItemOrder("Chicken",1,12);
    GroceryItemOrder gIO5 = new GroceryItemOrder("Chicken",1,12);
    GroceryItemOrder gIO6 = new GroceryItemOrder("Bread",1,5);


   GroceryList2 listToStoreItems = new GroceryList2();
  /* listToStoreItems.addToList(gIO1);
    listToStoreItems.addToList(gIO2);
    listToStoreItems.addToList(gIO3);
    listToStoreItems.addToList(gIO4);
    listToStoreItems.addToList(gIO5);
    listToStoreItems.addToList(gIO6);
*/


    //filehandler.saveItem(listToStoreItems);
    listToStoreItems = filehandler.loadObject(listToStoreItems);


    //System.out.println(listToStoreItems.toString());

    //.gettotalcost
    GroceryList2 groceryListTest2 = new GroceryList2();

    groceryListTest2.addToList(listToStoreItems.getItem("bacon"));
    groceryListTest2.addToList(listToStoreItems.getItem("Chicken"));

    System.out.println(groceryListTest2.toString());
    System.out.println(groceryListTest2.totalCost);

    }
}
