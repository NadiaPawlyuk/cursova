package edu.nadia.cursova.service.theHeadOfTheSection.interfaces;

import edu.nadia.cursova.model.TheHeadOfTheSection;

import java.util.List;

public interface ITheHeadOfTheSectionService {
    TheHeadOfTheSection save(TheHeadOfTheSection theHeadOfTheSection);
    TheHeadOfTheSection get(String id);
    List<TheHeadOfTheSection> getAll();
    TheHeadOfTheSection edit(TheHeadOfTheSection theHeadOfTheSection);
    TheHeadOfTheSection delete(String id);
}
