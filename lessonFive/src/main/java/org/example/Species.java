package org.example;

public enum Species {
    DOG,
    CAT,
    REBBIT,
    FOX,
    WOLF,
    TIGER;
    public String toString() {
        return name().toLowerCase();
    }
}
