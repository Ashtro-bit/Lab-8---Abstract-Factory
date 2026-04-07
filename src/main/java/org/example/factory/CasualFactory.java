package org.example.factory;

import org.example.casual.CasualPants;
import org.example.casual.CasualShoes;
import org.example.casual.CasualTop;
import org.example.products.Pants;
import org.example.products.Shoes;
import org.example.products.Top;

/*
 * Concrete factory that creates Casual garments.
 */
public class CasualFactory implements OutfitFactory {

    @Override
    public Top createTop() {
        return new CasualTop();
    }

    @Override
    public Pants createPants() {
        return new CasualPants();
    }

    @Override
    public Shoes createShoes() {
        return new CasualShoes();
    }
}