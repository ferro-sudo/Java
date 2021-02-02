package assignments.assignment_14.q14;

import java.util.ArrayList;
import java.util.List;

public class TJMaxx {

    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    public TJMaxx() {
        regularItems = new ArrayList<Item>();
        onSaleItems = new ArrayList<OnSaleItem>();
    }

    public void addRegularItem(Item item) {
        regularItems.add(item);
    }

    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);
    }

    public List<Item> getRegularItems() {

        return regularItems;
    }

    public List<OnSaleItem> getOnSaleItems() {

        return onSaleItems;
    }

    public int regularItemsCount() {
        return regularItems.size();
    }


    public int onSaleItemsCount() {
        return onSaleItems.size();
    }


    public List<String> getAllItemNames() {
        List<String> names = new ArrayList<String>();
        for (Item item : regularItems) {
            names.add(item.getName());
        }
        for (OnSaleItem item : onSaleItems) {
            names.add(item.getName());
        }
        return names;
    }

    /**
     * * gets catalog number and returns price for the item
     * * it will search for the item both regularItems and onsaleonSaleItems
     * * @param catalogNumber
     * * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber) {

        return 0.0;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * * that OnSaleItem object     * @param name     * @return
     */
    public OnSaleItem getOnSaleItem(String name) {
        return null;
    }

    /**
     * * removes the item with matching catalogNumber
     * * from both regularItems and onSaleItems.
     * * Does nothing if not found
     * * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {

    }

    /**
     * * - it accepts a catalog number and finds that item
     * * among regularItems and onSaleItems
     * * - if it finds the item:
     * *   - decrease the count of the Item by 1
     * *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     * *
     * * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {

    }
}
