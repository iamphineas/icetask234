/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bakingapplication;

/**
 *
 * @author PAUL
 */
class ProcessRecipe extends Recipes {
    public ProcessRecipe(String ingredients, int timeToMake, int difficultyLevel) {
        super(ingredients, timeToMake, difficultyLevel);
    }

    @Override
    public void printRecipes() {
        System.out.println("**********************************************");
        System.out.println("INGREDIENTS: " + ingredients);
        System.out.println("TIME TO MAKE: " + timeToMake + " minutes");
        System.out.println("DIFFICULTY LEVEL: " + difficultyLevel);
        System.out.println("**********************************************");
    }
}
