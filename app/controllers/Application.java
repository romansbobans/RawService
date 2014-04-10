package controllers;

import database.DBConnector;
import database.MongoConnector;
import play.*;
import play.mvc.*;

import views.html.*;

import java.util.Arrays;
import java.util.Locale;

public class Application extends Controller {

    private static DBConnector dbConnector;

    static
    {
        dbConnector = new MongoConnector();
    }



    public static Result getCategories() {


        String[] categories = dbConnector.getAllCategories();
        return ok(Arrays.toString(categories) );
    }

    public static Result getViews(String id) {
        String views = dbConnector.getViewsForId(id);
        return ok(index.render("Your new application is ready."));
    }

}
