package org.example.factory;

import org.example.party.PartyPants;
import org.example.party.PartyShoes;
import org.example.party.PartyTop;
import org.example.products.Pants;
import org.example.products.Shoes;
import org.example.products.Top;

/*
 * Concrete factory that creates Party garments.
 */
public class PartyFactory implements OutfitFactory {

    @Override
    public Top createTop() {
        return new PartyTop();
    }

    @Override
    public Pants createPants() {
        return new PartyPants();
    }

    @Override
    public Shoes createShoes() {
        return new PartyShoes();
    }
}