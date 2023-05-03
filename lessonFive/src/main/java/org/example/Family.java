package org.example;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private Family family;

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
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
        if(index > children.length-1 || index < 0) return false;
        Human[] childrenResult = new Human[children.length-1];
        int j = 0;
        for (int i = 0; i < children.length; i++) {
            if (i != index) {
                childrenResult[j++] = children[i];
            }
        }
        children = childrenResult;
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
