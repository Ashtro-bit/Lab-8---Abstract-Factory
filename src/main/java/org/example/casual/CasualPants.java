package org.example.casual;

import org.example.products.Pants;

/*
 * Concrete Casual Pants product.
 */
public class CasualPants implements Pants {

    @Override
    public String getDescription() {
        return "Casual Pants";
    }
}