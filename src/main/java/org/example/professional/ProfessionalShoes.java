package org.example.professional;

import org.example.products.Shoes;

/*
 * Concrete Professional Shoes product.
 */
public class ProfessionalShoes implements Shoes {

    @Override
    public String getDescription() {
        return "Professional Shoes";
    }
}