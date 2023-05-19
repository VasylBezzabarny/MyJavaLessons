package org.example;


import java.util.*;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children = new ArrayList<>();
    private Set<Pet> pet = new HashSet<>();;
    private Family family;
    private Species species;


    public Family(Human mother, Human father, List<Human> children, Species species) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.species = species;
    }
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        mother.setFamily(this);
        father.setFamily(this);
    }



    public Human getMother() {

        return mother;
    }

    public void setMother(Human mother) {

        this.mother = mother;
    }

    public Human getFather() {

        return father;
    }

    public void setFather(Human father) {

        this.father = father;
    }

    public List<Human> getChildren() {

        return children;
    }

    public void setChildren(List<Human> children) {

        this.children = children;
    }

    public Set <Pet> getPet() {

        return this.pet;
    }

    public void setPet(Set <Pet> pet) {

        this.pet = pet;
    }

//    public void greetPet() {
//
//        System.out.println("Привет," + pet.getNickName());
//    }
//
//    public void describePet() {
//
//        System.out.println("У меня есть " + pet.getSpecies() + ", ему " + pet.getAge() + " лет, он " + (pet.getTrickLevel() <= 50 ? "почти не хитрый" : "очень хитрый"));
//    }
    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);

    }
    public boolean deleteChild(int index) {
        if (index > children.size() - 1 || index < 0) return false;
        Human child = children.get(index);
        child.setFamily(null);
        children.remove(index);
        return true;
    }

    public boolean deleteChild(Human child) {
        if (children == null)
            return false;
        children.remove(child);
        child.setFamily(null);
        return true;
    }

    public int countFamily() {
        return children.size() + 2;
    }


    @Override
    public String toString() {
        return "Family{" +
                " mother=" + mother.getName() + " " + mother.getSurname() +
                ", father=" + father.getName() + " " + father.getSurname() +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }
}