package com.kn.encapsulation;

import java.util.Scanner;

public class LinkedInProfile {
    private String name;

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String name) {
        this.name = name.toUpperCase();
    }

    public static void main(String[] args) {
        LinkedInProfile profile = new LinkedInProfile();
        
        // Taking input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userInput = scanner.nextLine();
        
        // Setting the name using the setter method
        profile.setName(userInput);

        // Displaying the result
        System.out.println("LinkedIn Profile Name: " + profile.getName());

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
