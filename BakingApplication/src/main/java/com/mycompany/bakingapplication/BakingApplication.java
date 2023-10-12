/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bakingapplication;

import java.util.Scanner;

/**
 *
 * @author PAUL
 */
public class BakingApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the ingredients: ");
        String ingredients = scanner.nextLine();

        System.out.print("Enter the time to make (in minutes): ");
        int timeToMake = scanner.nextInt();

        System.out.print("Enter difficulty level: ");
        int difficultyLevel = scanner.nextInt();

        ProcessRecipe recipe = new ProcessRecipe(ingredients, timeToMake, difficultyLevel);
        recipe.printRecipes();

        scanner.close();
    }
}