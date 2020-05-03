package edu.nadia.cursova.dao.kiosk.interfaces;

import edu.nadia.cursova.model.Kiosk;

import java.util.List;

public interface IKioskDao {
    Kiosk save(Kiosk kiosk);
    Kiosk get(String id);
    List<Kiosk> getAll();
    Kiosk edit(Kiosk kiosk);
    Kiosk delete(String id);
}
