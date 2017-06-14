package dao.api;

import model.Entity;

import java.util.List;

/**
 * Created by andr_ on 18.05.2017.
 */
public interface Dao <K, T extends Entity<K>> {

    List<T> getAll();

    T getById(K key);

    T getBy(String fieldName, String value);

    void save(T entity);

    void delete(K key);

    void update(T entity);
}
