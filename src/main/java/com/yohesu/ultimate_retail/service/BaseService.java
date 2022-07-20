package com.yohesu.ultimate_retail.service;

import java.util.List;

public interface BaseService<T, ID> {
    List<T> findAll();
    T findById(ID id);
    void saveData(T data);
    void updateData(T data);
    void deleteData(ID id);
}
