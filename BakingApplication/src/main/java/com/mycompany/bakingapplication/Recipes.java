/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bakingapplication;

/**
 *
 * @author PAUL
 */
abstract class Recipes implements iRecipes {
        protected String ingredients;
    protected int timeToMake;
    protected int difficultyLevel;

    public Recipes(String ingredients, int timeToMake, int difficultyLevel) {
        this.ingredients = ingredients;
        this.timeToMake = timeToMake;
        this.difficultyLevel = difficultyLevel;
    }

    public abstract void printRecipes();
}
    

