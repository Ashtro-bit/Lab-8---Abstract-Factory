package org.example.party;

import org.example.products.Shoes;

/*
 * Concrete Party Shoes product.
 */
public class PartyShoes implements Shoes {

    @Override
    public String getDescription() {
        return "Party Shoes";
    }
}