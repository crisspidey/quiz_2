package DAO;

import java.util.List;

public interface IStudent <T>{
    List<T> findAll();
    boolean insert(T t);
    boolean delete(T t);
    boolean update(T t);
}
