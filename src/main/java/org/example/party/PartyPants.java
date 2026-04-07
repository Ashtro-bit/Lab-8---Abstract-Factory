package org.example.party;

import org.example.products.Pants;

/*
 * Concrete Party Pants product.
 */
public class PartyPants implements Pants {

    @Override
    public String getDescription() {
        return "Party Pants";
    }
}