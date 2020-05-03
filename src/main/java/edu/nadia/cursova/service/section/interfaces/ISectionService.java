package edu.nadia.cursova.service.section.interfaces;

import edu.nadia.cursova.model.Section;

import java.util.List;

public interface ISectionService {
    Section save(Section section);
    Section get(String id);
    List<Section> getAll();
    Section edit(Section section);
    Section delete(String id);
}
