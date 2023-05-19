package org.example;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return this.families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if (index < 0 || index >= this.families.size()) {
            return null;
        }
        return this.families.get(index);
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index < 0 || index >= this.families.size()) {
            return false;
        }
        this.families.remove(index);
        return true;
    }

    @Override
    public boolean deleteFamily(Family family) {

        return this.families.remove(family);
    }

    @Override
    public boolean saveFamily(Family family) {
        return families.add(family);
    }
}
