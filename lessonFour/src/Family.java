package family;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private family.Human mother;
    private family.Human father;
    private family.Human[] children;
    private family.Pet pet;
    private Family family;

    public Family(family.Human mother, family.Human father, family.Human[] children, family.Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public family.Human getMother() {
        return mother;
    }

    public void setMother(family.Human mother) {
        this.mother = mother;
    }

    public family.Human getFather() {
        return father;
    }

    public void setFather(family.Human father) {
        this.father = father;
    }

    public family.Human[] getChildren() {
        return children;
    }

    public void setChildren(family.Human[] children) {
        this.children = children;
    }

    public family.Pet getPet() {
        return pet;
    }

    public void setPet(family.Pet pet) {
        this.pet = pet;
    }
    public void greetPet() {
        System.out.println("Привет," + pet.getNickName());
    }
    public void describePet() {

        System.out.println("У меня есть " + pet.getSpecies() + ", ему " + pet.getAge() + " лет, он " + (pet.getTrickLevel() <= 50 ? "почти не хитрый" : "очень хитрый"));
    }

    public void addChild(family.Human child) {
        family.Human[] newChildren = new family.Human[children.length + 1];
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

        for (int i = index; i < children.length - 1; i++) {
            children[i] = children[i + 1];
        }
        children[children.length - 1] = null;

        return true;
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
