package com.udacity.firebase.shoppinglistplusplus.model;

/**
 * Created by suporte on 27/07/2017.
 */

public class ShoppingListItem {
    private String itemName, owner, boughtBy;
    private boolean bought;

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
        this.boughtBy = null;
        this.bought = false;
    }

    public String getItemName() { return itemName; }

    public String getOwner() {
        return owner;
    }

    public String getBoughtBy(){
        return boughtBy;
    }

    public boolean isBought(){
        return bought;
    }


}
