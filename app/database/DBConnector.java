package database;

import java.util.Locale;

/**
 * Created by TAHKICT on 09/04/14.
 */
public interface DBConnector {
    String[] getAllCategories();

    String getViewsForId(String id);
}
