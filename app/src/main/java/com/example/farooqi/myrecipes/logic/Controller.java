package com.example.farooqi.myrecipes.logic;

import android.view.View;

import com.example.farooqi.myrecipes.data.DataSourceInterface;
import com.example.farooqi.myrecipes.data.ListItem;
import com.example.farooqi.myrecipes.view.ViewInterface;

/**
 * Created by Farooqi on 8/20/2017.
 */

public class Controller {

    private ViewInterface view;
    private DataSourceInterface dataSource;

    public Controller(ViewInterface view, DataSourceInterface dataSource) {
        this.view = view;
        this.dataSource = dataSource;

        getListFromDataSource();
    }

    public void getListFromDataSource() {
        view.setUpAdapterAndView(dataSource.getListOfData());
    }

    public void onListItemClick(ListItem selectedItem) {
        view.startDetailActivity(
                selectedItem.getTitle(),
                selectedItem.getIngredient(),
                selectedItem.getProcedure(),
                selectedItem.getImageResource()
        );
    }
}
