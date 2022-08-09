package me.yordyF;

import java.time.LocalDate;

public class ClassesCreation {

    public static void main(String[] args) {
        // Classes and Objects

        // This is our first object of the class "Lens"
        Lens lensOne = new Lens(
                "Sony",
                "86mm",
                false);



        // This is our second object of the class "Lens"
        Lens lensTwo = new Lens(
                "Cannon",
                "30mm",
                true);



        // This is our third object of the class "Lens"
        Lens lensThree = new Lens(
                "Nikon",
                "50mm",
                false);


        // This is our fourth object of the class "Lens"
        Lens lensFour = new Lens(
                "Panasonic",
                "28mm",
                true);

        System.out.println();
        System.out.println("Printing the object attributes:");

        System.out.println();

        System.out.println("Lens 1");
        System.out.println("Brand: " + lensOne.brand);
        System.out.println("Focal length: " + lensOne.focalLength);
        System.out.println("Is prime? " + lensOne.isPrime);

        System.out.println();

        System.out.println("Lens 2");
        System.out.println("Brand: " + lensTwo.brand);
        System.out.println("Focal length: " + lensTwo.focalLength);
        System.out.println("Is prime? " + lensTwo.isPrime);

        System.out.println();

        System.out.println("Lens 3");
        System.out.println("Brand: " + lensThree.brand);
        System.out.println("Focal length: " + lensThree.focalLength);
        System.out.println("Is prime? " + lensThree.isPrime);

        System.out.println();

        System.out.println("Lens 4");
        System.out.println("Brand: " + lensFour.brand);
        System.out.println("Focal length: " + lensFour.focalLength);
        System.out.println("Is prime? " + lensFour.isPrime);


        System.out.println();
        System.out.println("Passports");

        // Passport 1
        Passport passport1 = new Passport("5465",
                "Dominican Republic",
                LocalDate.of(2030, 4, 12));


        // Passport 2
        Passport passport2 = new Passport("8794",
                "USA",
                LocalDate.of(2031, 6, 18));

        // Passport 3
        Passport passport3 = new Passport("1654",
                "Colombia",
                LocalDate.of(2034, 8, 15));


        System.out.println();
        System.out.println("Printing passport details:");
        System.out.println();
        
        System.out.println("Passport 1:");
        System.out.println("Passport number: " + passport1.passportNumber);
        System.out.println("Country of the passport: " + passport1.country);
        System.out.println("Passport expiration date: " + passport1.expirationDate);

        // Passport 2
        System.out.println();
        System.out.println("Passport 2:");
        System.out.println("Passport number: " + passport2.passportNumber);
        System.out.println("Country of the passport: " + passport2.country);
        System.out.println("Passport expiration date: " + passport2.expirationDate);

        // Passport 3
        System.out.println();
        System.out.println("Passport 3:");
        System.out.println("Passport number: " + passport3.passportNumber);
        System.out.println("Country of the passport: " + passport3.country);
        System.out.println("Passport expiration date: " + passport3.expirationDate);

    }




    // Creating classes

    // let's create a class that makes lenses


    // The entire block of code of the class lens is
    // the "blueprint or template to create lenses."
    static class Lens {
        // These are the properties of this class
        String brand;
        String focalLength;
        boolean isPrime;

        // This is called the constructor.
        // The constructor is how we construct the objects
        Lens(String brand,
             String focalLength,
             boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;

        }
    }


    static class Passport {
        //  Properties
        String passportNumber;
        String country;
        LocalDate expirationDate;

        // Constructor
        Passport(String passportNumber,
                 String country,
                 LocalDate expirationDate) {
            this.passportNumber = passportNumber;
            this.country = country;
            this.expirationDate = expirationDate;
        }

    }
}