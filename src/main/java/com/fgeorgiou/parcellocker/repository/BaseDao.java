package com.fgeorgiou.parcellocker.repository;

public interface BaseDao<T, ID> {
    T findById(ID id);

    void save(T entity);

    void delete(ID id);
    // Other common methods
}
