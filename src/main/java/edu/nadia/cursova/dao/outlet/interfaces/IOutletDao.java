package edu.nadia.cursova.dao.outlet.interfaces;

import edu.nadia.cursova.model.Outlet;

import java.util.List;

public interface IOutletDao {
    Outlet save(Outlet outlet);
    Outlet get(String id);
    List<Outlet> getAll();
    Outlet edit(Outlet outlet);
    Outlet delete(String id);
}
