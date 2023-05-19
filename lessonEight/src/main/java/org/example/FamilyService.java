package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.example.Family;

public class FamilyService {
   private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {

        this.familyDao = familyDao;
    }
    public List<Family> getAllFamilies() {

        return familyDao.getAllFamilies();
    }
    public void displayAllFamilies(){
        List<Family> families = this.familyDao.getAllFamilies();
        for (int i = 0; i < families.size(); i++) {
            System.out.println(i + " " + families.get(i));
        }
    }
    public List<Family> getFamiliesBiggerThan(int count) {
        List<Family> result = new ArrayList<>();
        List<Family> families = this.familyDao.getAllFamilies();
        for (Family family : families) {
            if (family.countFamily() > count) {
                result.add(family);
            }
        }
        return result;
    }
    public List<Family> getFamiliesLessThan(int count) {
        List<Family> result = new ArrayList<>();
        List<Family> families = this.familyDao.getAllFamilies();
        for (Family family : families) {
            if (family.countFamily() < count) {
                result.add(family);
            }
        }
        return result;
    }

    public int countFamiliesWithMemberNumber(int count) {
        int result = 0;
        List<Family> families = this.familyDao.getAllFamilies();
        for (Family family : families) {
            if (family.countFamily() == count) {
                result++;
            }
        }
        return result;
    }

    public void createNewFamily(Human father, Human mother) {

        familyDao.saveFamily(new Family(father, mother));
    }
    public boolean deleteFamilyByIndex(int index) {
        return familyDao.deleteFamily(index);
    }
    public Family bornChild(Family family, String nameMan, String nameWoman) {
        int random = (int) (Math.random() * 2);
        Human man = new Man(nameMan, family.getFather().getSurname());
        Human woman = new Woman(nameWoman, family.getFather().getSurname());
        if (random == 0) {
            family.addChild(man);
            familyDao.saveFamily(family);
        } else {
            family.addChild(woman);
            familyDao.saveFamily(family);
        }
        return family;
    }
    public Family adoptChild(Family family, Human human) {
        human.setFamily(family);
        human.setSurname(family.getFather().getSurname());
        family.addChild(human);
        familyDao.saveFamily(family);
        return family;
    }
    public void deleteAllChildrenOlderThen(int age) {
        int resultAge;
        for (Family family : familyDao.getAllFamilies()) {
            Iterator iterator = family.getChildren().iterator();
            while (iterator.hasNext()) {
                Human child = (Human) iterator.next();
                resultAge = 2023 - child.getYear();
                if (!(child.getYear() == 0)) {
                    if (resultAge > age) {
                        iterator.remove();
                        familyDao.saveFamily(family);
                    }
                }
            }
        }
    }

    public int count() {

        return familyDao.getAllFamilies().size();
    }
    public Family getFamilyById(int index) {

        return familyDao.getFamilyByIndex(index);
    }

    public Set<Pet> getPets(int indexFamily) {

        return familyDao.getFamilyByIndex(indexFamily-1).getPet();
    }

    public void addPet(int indexFamily, Pet pet) {
        Family familyByIndex = familyDao.getFamilyByIndex(indexFamily - 1);
        familyByIndex.getPet().add(pet);
        familyDao.saveFamily(familyByIndex);
    }

}
