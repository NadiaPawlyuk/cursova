package edu.nadia.cursova.service.hall.interfaces;

import edu.nadia.cursova.model.Hall;

import java.util.List;

public interface IHallService {
    Hall save(Hall hall);
    Hall get(String id);
    List<Hall> getAll();
    Hall edit(Hall hall);
    Hall delete(String id);
}
