package org.example.factory;

import org.example.products.Pants;
import org.example.products.Shoes;
import org.example.products.Top;
import org.example.professional.ProfessionalPants;
import org.example.professional.ProfessionalShoes;
import org.example.professional.ProfessionalTop;

/*
 * Concrete factory that creates Professional garments.
 */
public class ProfessionalFactory implements OutfitFactory {

    @Override
    public Top createTop() {
        return new ProfessionalTop();
    }

    @Override
    public Pants createPants() {
        return new ProfessionalPants();
    }

    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
}