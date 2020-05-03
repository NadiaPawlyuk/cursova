package edu.nadia.cursova.dao.manager.interfaces;

import edu.nadia.cursova.model.Manager;

import java.util.List;

public interface IManagerDao {
    Manager save(Manager manager);
    Manager get(String id);
    List<Manager> getAll();
    Manager edit(Manager manager);
    Manager delete(String id);
}
