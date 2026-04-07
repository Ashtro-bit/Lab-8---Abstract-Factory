package org.example;

import org.example.factory.CasualFactory;
import org.example.factory.OutfitFactory;
import org.example.factory.PartyFactory;
import org.example.factory.ProfessionalFactory;

/*
 * Driver class used to test the Abstract Factory pattern.
 * Each factory creates a matching family of products:
 * Top, Pants, and Shoes.
 */
public class Main {
    public static void main(String[] args) {

        // Test Professional outfit
        OutfitFactory professionalFactory = new ProfessionalFactory();
        System.out.println("Professional Outfit:");
        System.out.println(professionalFactory.createTop().getDescription());
        System.out.println(professionalFactory.createPants().getDescription());
        System.out.println(professionalFactory.createShoes().getDescription());

        System.out.println();

        // Test Casual outfit
        OutfitFactory casualFactory = new CasualFactory();
        System.out.println("Casual Outfit:");
        System.out.println(casualFactory.createTop().getDescription());
        System.out.println(casualFactory.createPants().getDescription());
        System.out.println(casualFactory.createShoes().getDescription());

        System.out.println();

        // Test Party outfit
        OutfitFactory partyFactory = new PartyFactory();
        System.out.println("Party Outfit:");
        System.out.println(partyFactory.createTop().getDescription());
        System.out.println(partyFactory.createPants().getDescription());
        System.out.println(partyFactory.createShoes().getDescription());
    }
}