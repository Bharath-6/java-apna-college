package PracticeLowLevelDesign.Shopping;

public interface ShoppingListService {
    ShoppingList createShoppingList(ShoppingList shoppingList);
    ShoppingList getShoppingListById(String id);
    ShoppingList updateShoppingList(String id, ShoppingList updatedShoppingList);
    void deleteShoppingList(String id);
}
