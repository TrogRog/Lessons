package MyLessons.Lesson44.Task4;


import java.util.List;

public abstract class AbstractDAO<K extends Number, T> {

    public abstract List<T> findAll();
    public abstract T findEntityById(K id);

}
