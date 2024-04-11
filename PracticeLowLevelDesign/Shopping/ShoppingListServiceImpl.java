package PracticeLowLevelDesign.Shopping;

import java.util.*;

public class ShoppingListServiceImpl implements ShoppingListService {
    private Map<String, ShoppingList> shoppingLists = new HashMap<>();

    @Override
    public ShoppingList createShoppingList(ShoppingList shoppingList) {
        // Implement this method
        String id = UUID.randomUUID().toString();
        shoppingList.setId(id);
        shoppingLists.put(id, shoppingList);
        return shoppingList;
    }

    @Override
    public ShoppingList getShoppingListById(String id) {
        // Implement this method
        return shoppingLists.get(id);
    }

    @Override
    public ShoppingList updateShoppingList(String id, ShoppingList updatedShoppingList) {
        // Implement this method
        if(shoppingLists.containsKey(id)){
            shoppingLists.put(id,updatedShoppingList);
            return updatedShoppingList;
        }
        return null;
    }

    @Override
    public void deleteShoppingList(String id) {
        // Implement this method
        if(shoppingLists.containsKey(id)){
            shoppingLists.remove(id);
        }
    }   
}
