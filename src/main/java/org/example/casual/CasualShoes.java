package org.example.casual;

import org.example.products.Shoes;

/*
 * Concrete Casual Shoes product.
 */
public class CasualShoes implements Shoes {

    @Override
    public String getDescription() {
        return "Casual Shoes";
    }
}