package com.example.farooqi.myrecipes.data;

import android.content.res.Resources;

import com.example.farooqi.myrecipes.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Farooqi on 8/20/2017.
 */

public class FakeSourceData implements DataSourceInterface {
    private static final int sizeOfCollection = 8;

    private final String[] title = {
            "Pork Medallions with Balsamic Vinegar and Capers",
            "White Texas Sheet Cake",
            "Spinach Enchiladas",
            "Asian Lettuce Wraps",
            "Perfect Summer Fruit Salad",
            "Mom's Peach Crisp",
            "Black Bean and Corn Quesadillas",
            "Georgia Peach Homemade Ice Cream"
    };

    private final String[] description = {
            "This is one meal to impress dinner guests that will not break the bank nor will it take very much time! Served with a green salad, red potatoes, and asparagus, this meal will turn out with a memorable presentation",
            "This cake is good to make a day ahead, and is very popular at pot-lucks.",
            "If you like spinach and Mexican food, you'll love these easy vegetarian enchiladas made with ricotta cheese and spinach.",
            "Delicious and bursting with flavor, Asian lettuce wraps are a great idea for entertaining or a family style meal. Each person can build their own fresh, delicious wrap. Just be sure to have plates or napkins available since the mixture can sometimes drip a little. To serve, allow each person to spoon a portion of the meat into a lettuce leaf. Wrap the lettuce around the meat like a burrito and enjoy!",
            "The perfect fruit salad for a backyard bbq or any occasion. There are never leftovers! This is one of my favorite fruit salad recipes, as I think the sauce really makes it. This salad is tastier the longer you can let it soak in its juices. I prefer 3 to 4 hours in the refrigerator before I serve it. Enjoy.",
            "My mom and I would often make this yummy and easy peach crisp using her home-canned peaches when I was little.",
            "My vegetarian husband goes crazy over these every time! They are really cheesy, a little bit spicy, and a little bit sweet. Feel free to play around and add chicken or veggies, if you desire. Don't forget the salsa and sour cream!",
            "This is the best peach ice cream you'll ever eat!!!"
    };

    private final String[] ingredient = {
            "1/4 cup all-purpose flour\n" +
                    "1 teaspoon garlic salt, or to taste\n" +
                    "1/2 teaspoon freshly ground black pepper, or to taste\n" +
                    "2 pounds pork tenderloin, cut into 1 1/2 inch pieces\n" +
                    "2 tablespoons olive oil\n" +
                    "1/3 cup balsamic vinegar\n" +
                    "1/2 cup chicken broth\n" +
                    "2 teaspoons minced lemon zest, or to taste\n" +
                    "1 tablespoon capers, or to taste",
            "1 cup butter\n" +
                    "1 cup water\n" +
                    "2 cups all-purpose flour\n" +
                    "2 cups white sugar\n" +
                    "2 eggs\n" +
                    "1/2 cup sour cream\n" +
                    "1 teaspoon almond extract\n" +
                    "1/2 teaspoon salt\n" +
                    "1 teaspoon baking soda\n" +
                    "Frosting:\n" +
                    "1/2 cup butter\n" +
                    "1/4 cup milk\n" +
                    "4 1/2 cups confectioners' sugar\n" +
                    "1/2 teaspoon almond extract\n" +
                    "1 cup chopped pecans",
            "1 tablespoon butter\n" +
                    "1/2 cup sliced green onions\n" +
                    "2 cloves garlic, minced\n" +
                    "1 (10 ounce) package frozen chopped spinach , thawed, drained and squeezed dry\n" +
                    "1 cup ricotta cheese\n" +
                    "1/2 cup sour cream\n" +
                    "2 cups shredded Monterey Jack cheese\n" +
                    "10 (6 inch) corn tortillas\n" +
                    "1 (19 ounce) can enchilada sauce",
            "16 Boston Bibb or butter lettuce leaves\n" +
                    "1 pound lean ground beef\n" +
                    "1 tablespoon cooking oil\n" +
                    "1 large onion, chopped\n" +
                    "1//4 cup hoisin sauce\n" +
                    "2 cloves fresh garlic, minced\n" +
                    "1 tablespoon soy sauce\n" +
                    "1 tablespoon rice wine vinegar\n" +
                    "2 teaspoons minced pickled ginger\n" +
                    "1 dash Asian chile pepper sauce, or to taste (optional)\n" +
                    "1 (8 ounce) can water chestnuts, drained and finely chopped\n" +
                    "1 bunch green onions, chopped\n" +
                    "2 teaspoons Asian (dark) sesame oil",
            "2/3 cup fresh orange juice\n" +
                    "1/3 cup fresh lemon juice\n" +
                    "1/3 cup packed brown sugar\n" +
                    "1/2 teaspoon grated orange zest\n" +
                    "1/2 teaspoon grated lemon zest\n" +
                    "1 teaspoon vanilla extract\n" +
                    "2 cups cubed fresh pineapple\n" +
                    "2 cups strawberries, hulled and sliced\n" +
                    "3 kiwi fruit, peeled and sliced\n" +
                    "3 bananas, sliced\n" +
                    "2 oranges, peeled and sectioned\n" +
                    "1 cup seedless grapes\n" +
                    "2 cups blueberries ",
            "4 cups sliced fresh peaches\n" +
                    "1/2 cup all-purpose flour\n" +
                    "1/2 cup brown sugar\n" +
                    "1/2 cup cold butter\n" +
                    "1 teaspoon ground cinnamon\n" +
                    "1/4 teaspoon salt\n",
            "2 teaspoons olive oil\n" +
                    "3 tablespoons finely chopped onion\n" +
                    "1 (15.5 ounce) can black beans, drained and rinsed\n" +
                    "1 (10 ounce) can whole kernel corn, drained\n" +
                    "1 tablespoon brown sugar\n" +
                    "1/4 cup salsa\n" +
                    "1/4 teaspoon red pepper flakes\n" +
                    "2 tablespoons butter, divided\n" +
                    "8 (8 inch) flour tortillas\n" +
                    "1 1/2 cups shredded Monterey Jack cheese, ",
            "2 1/2 pounds fresh peaches - peeled, pitted and chopped\n" +
                    "1/2 cup white sugar\n" +
                    "1 pint half-and-half cream\n" +
                    "1 (14 ounce) can sweetened condensed milk\n" +
                    "1 (12 fluid ounce) can evaporated milk\n" +
                    "1 teaspoon vanilla extract\n" +
                    "2 cups whole milk, or as needed "
    };


    private String[] procedure = {
            "1- Place the flour, garlic salt, and pepper into a plastic bag. Shake to mix, the add the pork tenderloin pieces, and shake again to coat. Shake off the excess flour.\n\n" +
                    "2- Heat the oil in a large skillet over medium-high heat. Cook the pork medallions in the hot oil until golden-brown on both sides, 2 to 3 minutes per side. Pour in the balsamic vinegar and chicken broth. Bring to a boil, then reduce heat to medium, and simmer until the pork is no longer pink in the center, 3 to 4 minutes. Remove the pork to a serving platter, then stir the lemon zest and capers into the simmering sauce. Continue simmering until the sauce has thickened to your desired consistency.",
            "1- Preheat oven to 375 degrees F (190 degrees C).\n\n" +
                    "2- In a large saucepan, bring 1 cup butter and water to a boil. Remove from heat, and stir in flour, sugar, eggs, sour cream, 1 teaspoon almond extract, salt, and baking soda until smooth. Pour batter into a greased 10x15-inch baking pan.\n\n" +
                    "3- Bake in the preheated oven for 20 to 22 minutes, or until cake is golden brown and tests done. Cool for 20 minutes.\n\n" +
                    "4- Combine 1//2 cup butter and milk in a saucepan; bring to a boil. Remove from heat. Mix in sugar, and 1//2 teaspoon almond extract. Stir in pecans. Spread frosting over warm cake.\n",
            "1- Preheat the oven to 375 degrees F (190 degrees C).\n\n" +
                    "2- Melt butter in a saucepan over medium heat. Add garlic and onion; cook for a few minutes until fragrant, but not brown. Stir in spinach, and cook for about 5 more minutes. Remove from the heat, and mix in ricotta cheese, sour cream, and 1 cup of Monterey Jack cheese.\n\n" +
                    "3- In a skillet over medium heat, warm tortillas one at a time until flexible, about 15 seconds. Spoon about 1//4 cup of the spinach mixture onto the center of each tortilla. Roll up, and place seam side down in a 9x13 inch baking dish. Pour enchilada sauce over the top, and sprinkle with the remaining cup of Monterey Jack.\n\n" +
                    "4- Bake for 15 to 20 minutes in the preheated oven, until sauce is bubbling and cheese is lightly browned at the edges.",
            "1- Rinse whole lettuce leaves and pat dry, being careful not tear them. Set aside.\n\n" +
                    "2- Heat a large skillet over medium-high heat. Cook and stir beef and cooking oil in the hot skillet until browned and crumbly, 5 to 7 minutes. Drain and discard grease; transfer beef to a bowl. Cook and stir onion in the same skillet used for beef until slightly tender, 5 to 10 minutes. Stir hoisin sauce, garlic, soy sauce, vinegar, ginger, and chile pepper sauce into onions. Add water chestnuts, green onions, sesame oil, and cooked beef; cook and stir until the onions just begin to wilt, about 2 minutes.\n\n" +
                    "3- Arrange lettuce leaves around the outer edge of a large serving platter and pile meat mixture in the center.",
            "1- Bring orange juice, lemon juice, brown sugar, orange zest, and lemon zest to a boil in a saucepan over medium-high heat. Reduce heat to medium-low, and simmer until slightly thickened, about 5 minutes. Remove from heat, and stir in vanilla extract. Set aside to cool.\n\n" +
                    "2- Layer the fruit in a large, clear glass bowl in this order: pineapple, strawberries, kiwi fruit, bananas, oranges, grapes, and blueberries. Pour the cooled sauce over the fruit. Cover and refrigerate for 3 to 4 hours before serving.\n",
            "1- Preheat oven to 350 degrees F (175 degrees C).\n\n" +
                    "2- Arrange peaches evenly in an 8x8-inch baking dish.\n\n" +
                    "3- Mix flour, brown sugar, butter, cinnamon, and salt in a bowl using a pastry cutter until evenly crumbled. Fold oats into flour mixture; sprinkle and press topping into peaches.\n\n" +
                    "4- Bake in the preheated oven until topping is lightly browned, about 30 minutes.\n",
            "1- Heat oil in a large saucepan over medium heat. Stir in onion, and cook until softened, about 2 minutes. Stir in beans and corn, then add sugar, salsa, and pepper flakes; mix well. Cook until heated through, about 3 minutes.\n\n" +
                    "2- Melt 2 teaspoons of the butter in a large skillet over medium heat. Place a tortilla in the skillet, sprinkle evenly with cheese, then top with some of the bean mixture. Place another tortilla on top, cook until golden, then flip and cook on the other side. Melt more butter as needed, and repeat with remaining tortillas and filling.\n",
            "1- Puree peaches with the sugar and half-and-half in batches in a blender or food processor.\n\n" +
                    "2- In a gallon ice cream freezer container, mix together the peach mixture, sweetened condensed milk, evaporated milk, and vanilla. Pour in enough whole milk to fill the container to the fill line, about 2 cups.\n\n" +
                    "3- Follow the manufacturer's instructions to freeze the ice cream.\n"
    };

    private int[] recipesImage = {
            R.drawable.rec_1, R.drawable.rec_2,
            R.drawable.rec_3, R.drawable.rec_4,
            R.drawable.rec_5, R.drawable.rec_6,
            R.drawable.rec_7, R.drawable.rec_8

    };

    public FakeSourceData() {

    }

    @Override
    public List<ListItem> getListOfData() {
        ArrayList<ListItem> listOfData = new ArrayList<>();

        for (int i = 0; i < sizeOfCollection; i++) {
            // create a list item
            ListItem listItem = new ListItem(
                    title[i],
                    description[i],
                    ingredient[i],
                    procedure[i],
                    recipesImage[i]
            );

            listOfData.add(listItem);
        }

        return listOfData;
    }
}
