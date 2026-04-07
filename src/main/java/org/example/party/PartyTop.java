package org.example.party;

import org.example.products.Top;

/*
 * Concrete Party Top product.
 */
public class PartyTop implements Top {

    @Override
    public String getDescription() {
        return "Party Top";
    }
}