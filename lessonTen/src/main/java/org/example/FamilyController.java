package org.example;

import java.util.List;
import java.util.Set;

import org.example.Pet;
import org.example.Family;

public class FamilyController {
    private FamilyService familyService;

    public FamilyController(FamilyService familyService) {

        this.familyService = familyService;
    }
    public List<Family> getAllFamilies() {

        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {

        familyService.displayAllFamilies();
    }

    public void getFamiliesBiggerThan(int number) {

        familyService.getFamiliesBiggerThan(number);
    }

    public void getFamiliesLessThan(int number) {

        familyService.getFamiliesLessThan(number);
    }

    public int countFamiliesWithMemberNumber(int number) {

        return familyService.countFamiliesWithMemberNumber(number);
    }

    public void createNewFamily(Human father, Human mother) {

        familyService.createNewFamily(father, mother);
    }

    public void deleteFamilyByIndex(int index) {
        familyService.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family family, String nameMan, String nameWoman) {
        return familyService.bornChild(family, nameMan, nameWoman);
    }

    public Family adoptChild(Family family, Human child) {

        return familyService.adoptChild(family, child);
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyService.deleteAllChildrenOlderThen(age);
    }

    public int count() {
        return familyService.count();
    }

    public Family getFamilyById(int index) {

        return familyService.getFamilyById(index);
    }

    public Set <Pet> getPets(int index) {

        return familyService.getPets(index);
    }

    public void addPet(int index, Pet pet) {

        familyService.addPet(index, pet);
    }

}
