package com.example.farooqi.myrecipes.view;

import com.example.farooqi.myrecipes.data.ListItem;

import java.util.List;

import static com.example.farooqi.myrecipes.R.string.ingredient;

/**
 * Created by Farooqi on 8/20/2017.
 */

public interface ViewInterface {
    void startDetailActivity(String title, String ingredient, String procedure, int imageResource);
    void setUpAdapterAndView(List<ListItem> listOfData);
}
