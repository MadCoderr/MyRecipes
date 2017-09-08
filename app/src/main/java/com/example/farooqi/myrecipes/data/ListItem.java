package com.example.farooqi.myrecipes.data;

/**
 * Created by Farooqi on 8/20/2017.
 */

public class ListItem {
    String title;
    String description;
    String ingredient;
    String procedure;
    int imageResource;

    public ListItem(String title, String description,
                    String ingredient, String procedure, int imageResource) {
        this.title = title;
        this.description = description;
        this.ingredient = ingredient;
        this.procedure = procedure;
        this.imageResource = imageResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
