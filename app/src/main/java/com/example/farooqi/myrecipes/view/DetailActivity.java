package com.example.farooqi.myrecipes.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.farooqi.myrecipes.R;

public class DetailActivity extends AppCompatActivity {

    TextView ingredients;
    TextView procedure;
    ImageView recipeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ingredients = (TextView) findViewById(R.id.lbl_rec_ingredients);
        procedure = (TextView) findViewById(R.id.lbl_rec_procedure);
        recipeImage = (ImageView) findViewById(R.id.imv_recipe);

        Intent intent = getIntent();
        String title = intent.getStringExtra(MainActivity.EXTRA_RECIPE_TITLE);
        String ingredientExtra = intent.getStringExtra(MainActivity.EXTRA_RECIPE_INGREDIENT);
        String procedureExtra = intent.getStringExtra(MainActivity.EXTRA_RECIPE_PROCEDURE);
        int imageExtra = intent.getIntExtra(MainActivity.EXTRA_RECIPE_IMAGE, -1);

        setTitle(title);

        ingredients.setText(ingredientExtra);
        procedure.setText(procedureExtra);
        recipeImage.setImageResource(imageExtra);

    }
}
