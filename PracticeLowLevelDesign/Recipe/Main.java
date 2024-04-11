import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User {
    String userId;
    Map<String, List<String>> preferences;

    public User(String userId, Map<String, List<String>> preferences) {
        this.userId = userId;
        this.preferences = preferences;
    }
}

class Recipe {
    String recipeId;
    String name;
    String cuisineType;

    public Recipe(String recipeId, String name, String cuisineType) {
        this.recipeId = recipeId;
        this.name = name;
        this.cuisineType = cuisineType;
    }
}

class RecipeRecommendation {
    Map<String, User> users = new HashMap<>();
    Map<String, Recipe> recipes = new HashMap<>();

    public void addUser(String userId, Map<String, List<String>> preferences) {
        users.put(userId, new User(userId, preferences));
    }

    public void addRecipe(String recipeId, String name, String cuisineType) {
        recipes.put(recipeId, new Recipe(recipeId, name, cuisineType));
    }

    public List<Recipe> recommendRecipes(String userId) {
        User user = users.get(userId);
        if (user == null) {
            System.out.println("User not found");
            return new ArrayList<>();
        }

        // Implement your recommendation algorithm here
        // For demonstration, let's just recommend random recipes
        List<Recipe> recommendedRecipes = new ArrayList<>();
        for (Recipe recipe : recipes.values()) {
            if (user.preferences.get(recipe).contains(recipe.cuisineType)) {
                recommendedRecipes.add(recipe);
            }
        }

        return recommendedRecipes;
    }
}

public class Main {
    public static void main(String[] args) {
        RecipeRecommendation recipeRecommendation = new RecipeRecommendation();

        // Add users
        Map<String, List<String>> alicePreferences = new HashMap<>();
        alicePreferences.put("preferred_cuisines", List.of("Italian", "Mexican"));
        recipeRecommendation.addUser("1", alicePreferences);

        Map<String, List<String>> bobPreferences = new HashMap<>();
        bobPreferences.put("preferred_cuisines", List.of("Indian", "Thai"));
        recipeRecommendation.addUser("2", bobPreferences);

        // Add recipes
        recipeRecommendation.addRecipe("101", "Spaghetti Carbonara", "Italian");
        recipeRecommendation.addRecipe("102", "Chicken Tacos", "Mexican");
        recipeRecommendation.addRecipe("103", "Paneer Tikka", "Indian");
        recipeRecommendation.addRecipe("104", "Pad Thai", "Thai");

        // Recommend recipes for users
        List<Recipe> aliceRecipes = recipeRecommendation.recommendRecipes("1");
        System.out.println("Recommended recipes for Alice:");
        for (Recipe recipe : aliceRecipes) {
            System.out.println(recipe.name);
        }

        List<Recipe> bobRecipes = recipeRecommendation.recommendRecipes("2");
        System.out.println("\nRecommended recipes for Bob:");
        for (Recipe recipe : bobRecipes) {
            System.out.println(recipe.name);
        }
    }
}
