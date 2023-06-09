package family;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickName;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(String species, String nickName) {
        this.species = species;
        this.nickName = nickName;
    }

    public Pet(String species, String nickName, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public Pet() {
    }

    public String getSpecies() {

        return species;
    }

    public void setSpecies(String species) {

        this.species = species;
    }

    public String getNickName() {

        return nickName;
    }

    public void setNickName(String nickName) {

        this.nickName = nickName;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {

        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public String toString() {
        return species+ "{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }

    public void eat() {
        System.out.println("Я кушаю");
    }

    public void respond() {

        System.out.println("Привет, хозяин. Я - " + nickName + ". Я соскучился!");
    }

    public void foul() {
        System.out.println("Нужно хорошо замести следы...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickName, pet.nickName) && Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickName, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }
}