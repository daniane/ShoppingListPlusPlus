package com.udacity.firebase.shoppinglistplusplus.model;

/**
 * Created by suporte on 27/07/2017.
 */

public class ShoppingListItem {
    private String itemName, owner;

    /**
     * Required public constructor
     */
    public ShoppingListItem() {
    }

    /**
     * Use this constructor to create new ShoppingListItem.
     *
     * @param itemName
     * @param owner
     */
    public ShoppingListItem(String itemName, String owner) {
        this.itemName = itemName;
        this.owner = owner;
    }

    public String getItemName() { return itemName; }

    public String getOwner() {
        return owner;
    }


}
