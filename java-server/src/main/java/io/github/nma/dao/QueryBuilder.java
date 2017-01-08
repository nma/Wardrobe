package io.github.nma.dao;

import com.mongodb.BasicDBObject;
import io.github.nma.utils.stream.StreamUtils;
import org.jongo.FindOne;
import org.jongo.MongoCollection;

import java.util.Optional;

/**
 * @author Nick Ma (nickma38@gmail.com)
 */
public class QueryBuilder {

    /**
     * Creates a query making template that handles upsert logic for us
     *
     * @param collection
     * @param key
     * @param toFind
     * @param pojo
     * @param clazz
     * @param <T>
     */
    public static <T> void upsert(MongoCollection collection, String key, String toFind, T pojo, Class<T> clazz) {
        BasicDBObject findQuery = new BasicDBObject(key, toFind);
        FindOne findOne = collection.findOne(findQuery.toString());
        T founbObject = findOne.as(clazz);
        if (founbObject != null) {
            collection.update(findQuery.toString()).with(pojo);
        } else {
            collection.save(pojo);
        }
    }

    /**
     * Creates a query making template that handles upsert logic for us. IDs are Integers
     *
     * @param collection
     * @param key
     * @param toFind
     * @param pojo
     * @param clazz
     * @param <T>
     */
    public static <T> void upsert(MongoCollection collection, String key, Integer toFind, T pojo, Class<T> clazz) {
        BasicDBObject findQuery = new BasicDBObject(key, toFind);
        FindOne findOne = collection.findOne(findQuery.toString());
        T founbObject = findOne.as(clazz);
        if (founbObject != null) {
            collection.update(findQuery.toString()).with(pojo);
        } else {
            collection.save(pojo);
        }
    }

    /**
     * Creates a helper method to search our mongo collection.
     *
     * @param collection
     * @param key
     * @param toFind
     * @param clazz
     * @param <T>
     * @return
     * @throws DaoExceptions.NoMatchFound
     */
    public static <T> T find(MongoCollection collection, String key, String toFind, Class<T> clazz) throws DaoExceptions.NoMatchFound {
        BasicDBObject findQuery = new BasicDBObject(key, toFind);
        return find(collection, findQuery, clazz);
    }

    /**
     * Creates a helper method to search our mongo collection.
     *
     * @param collection
     * @param key
     * @param toFind
     * @param clazz
     * @param <T>
     * @return
     * @throws DaoExceptions.NoMatchFound
     */
    public static <T> T find(MongoCollection collection, String key, Integer toFind, Class<T> clazz) throws DaoExceptions.NoMatchFound {
        BasicDBObject findQuery = new BasicDBObject(key, toFind);
        return find(collection, findQuery, clazz);
    }

    public static <T> T find(MongoCollection collection, BasicDBObject findQuery, Class<T> clazz) throws DaoExceptions.NoMatchFound {
        Iterable<T> iter = collection.find(findQuery.toString()).as(clazz);
        Optional<T> optional = StreamUtils.asStream(iter)
                .findFirst();
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new DaoExceptions.NoMatchFound(
                    String.format("No items with query %s found in collection %s", findQuery.toString(), collection.getName()));
        }
    }
}
