package com.example.farooqi.myrecipes.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.farooqi.myrecipes.R;
import com.example.farooqi.myrecipes.data.FakeSourceData;
import com.example.farooqi.myrecipes.data.ListItem;
import com.example.farooqi.myrecipes.logic.Controller;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewInterface{

    public static final String EXTRA_RECIPE_TITLE = "title";
    public static final String EXTRA_RECIPE_INGREDIENT = "ingredient";
    public static final String EXTRA_RECIPE_PROCEDURE = "procedure";
    public static final String EXTRA_RECIPE_IMAGE = "image";

    private List<ListItem> listOfData;

    private LayoutInflater inflater;
    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private  Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rec_view);
        inflater = getLayoutInflater();

        controller = new Controller(this, new FakeSourceData());

    }

    @Override
    public void startDetailActivity(String title, String ingredient, String procedure, int imageResource) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(EXTRA_RECIPE_TITLE, title);
        intent.putExtra(EXTRA_RECIPE_INGREDIENT, ingredient);
        intent.putExtra(EXTRA_RECIPE_PROCEDURE, procedure);
        intent.putExtra(EXTRA_RECIPE_IMAGE, imageResource);

        startActivity(intent);
    }

    @Override
    public void setUpAdapterAndView(List<ListItem> listOfData) {
        this.listOfData = listOfData;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CustomAdapter();
        recyclerView.setAdapter(adapter);
    }

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

        @Override
        public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = inflater.inflate(R.layout.list_item, parent, false);
            return new CustomViewHolder(v);
        }

        @Override
        public void onBindViewHolder(CustomViewHolder holder, int position) {
            ListItem currentItem = listOfData.get(position);
            holder.title.setText(currentItem.getTitle());
            holder.description.setText(currentItem.getDescription());
        }

        @Override
        public int getItemCount() {
            return listOfData.size();
        }

        class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

            TextView title;
            TextView description;
            ViewGroup container;

            public CustomViewHolder(View itemView) {
                super(itemView);

                this.title = (TextView) itemView.findViewById(R.id.lbl_title);
                this.description = (TextView) itemView.findViewById(R.id.lbl_description);
                this.container = (ViewGroup) itemView.findViewById(R.id.root_layout);

                this.container.setOnClickListener(this);

            }

            @Override
            public void onClick(View view) {
                ListItem listItem = listOfData.get(this.getAdapterPosition());
                controller.onListItemClick(listItem);
            }
        }
    }
}


