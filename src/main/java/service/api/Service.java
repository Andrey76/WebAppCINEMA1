package service.api;

import java.util.List;

/**
 * Created by andr_ on 18.05.2017.
 */
public interface Service<K, T> {
    List<T> getAll();

    T getById(K id);

    void save(T entity);

    void delete(K key);

    void update(T entity);
}
