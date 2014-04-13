package database;

import com.mongodb.*;
import database.constants.CollectionNames;

import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Created by TAHKICT on 09/04/14.
 */
public class MongoConnector implements DBConnector{

    static final DB database;

    private static final String hostName = "127.0.0.1";

    private static final int port = 27017;

    private static final String dbName = "bakalaursDB";

    static
    {
        try {
            database = Mongo.connect(new DBAddress(hostName, port, dbName));
        } catch (UnknownHostException e) {
            throw new RuntimeException("Cannot connect to database");
        }
    }

    @Override
    public String[] getAllCategories() {
        DBCollection collection = database.getCollection(CollectionNames.CATEGORIES);
        DBCursor cursor = collection.find();

        String[] values = new String[2];
        int count = 0;

        while (cursor.hasNext())
        {
            String val = cursor.next().toString();
            values[count++] = val;
            System.out.println(val);

        }
        System.out.println(Arrays.toString(values));

        return values;

    }

    @Override
    public String getViewsForId(String id) {
        return null;
    }
}
