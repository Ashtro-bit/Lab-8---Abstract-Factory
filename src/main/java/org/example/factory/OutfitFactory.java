package org.example.factory;

import org.example.products.Pants;
import org.example.products.Shoes;
import org.example.products.Top;

/*
 * Abstract Factory interface.
 * Each concrete factory creates a matching family of garments.
 */
public interface OutfitFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}