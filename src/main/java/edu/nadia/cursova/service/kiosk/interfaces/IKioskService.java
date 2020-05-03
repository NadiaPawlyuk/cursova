package edu.nadia.cursova.service.kiosk.interfaces;

import edu.nadia.cursova.model.Kiosk;

import java.util.List;

public interface IKioskService {
    Kiosk save(Kiosk kiosk);
    Kiosk get(String id);
    List<Kiosk> getAll();
    Kiosk edit(Kiosk kiosk);
    Kiosk delete(String id);
}
