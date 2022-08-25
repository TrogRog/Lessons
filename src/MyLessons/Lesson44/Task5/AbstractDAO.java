package MyLessons.Lesson44.Task5;


import java.util.List;


public abstract class AbstractDAO<K extends Number, T> {
    public abstract List<T> findAll();

    public abstract T findEntityById(Integer id);

    public abstract void delete(K id);

    public abstract void create(T entity);

}

