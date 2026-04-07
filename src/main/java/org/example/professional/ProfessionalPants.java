package org.example.professional;

import org.example.products.Pants;

/*
 * Concrete Professional Pants product.
 */
public class ProfessionalPants implements Pants {

    @Override
    public String getDescription() {
        return "Professional Pants";
    }
}