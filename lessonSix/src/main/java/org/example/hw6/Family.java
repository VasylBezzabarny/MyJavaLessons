package org.example.hw6;


import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private Family family;
    private Species species;


    public Family(Human mother, Human father, Human[] children, Species species) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.species = species;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public void greetPet() {
        System.out.println("Привет," + pet.getNickName());
    }
    public void describePet() {

        System.out.println("У меня есть " + pet.getSpecies() + ", ему " + pet.getAge() + " лет, он " + (pet.getTrickLevel() <= 50 ? "почти не хитрый" : "очень хитрый"));
    }

    public void addChild(Human child) {
        Human[] newChildren = new Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newChildren[i] = children[i];
        }
        newChildren[newChildren.length - 1] = child;
        setChildren(newChildren);
        child.setFamily(this);
    }

    public boolean deleteChild(int index) {
        if (children == null || index < 0 || index >= children.length) {
            return false;
        }
        if (children[index] == null) {
            return false;
        }
        for (int i = index; i < children.length - 1; i++) {
            children[i] = children[i + 1];
        }
        children[children.length - 1] = null;
        return true;
    }
    public boolean deleteChild(Human child) {
        if (children == null || child == null) {
            return false;
        }
        for (int i = 0; i < children.length; i++) {
            if (children[i] != null && children[i].equals(child)) {
                children[i] = null;
                return true;
            }
        }
        return false;
    }
    public int countFamily() {
        return children.length + 2;
    }



    @Override
    public String toString() {
        return "Family{" +
                " mother=" + mother.getName() + " " + mother.getSurname() +
                ", father=" + father.getName() + " " + father.getSurname() +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

}