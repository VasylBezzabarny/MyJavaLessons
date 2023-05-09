package org.example;

public enum Species {
    DOG,
    ROBOCAT,
    DOMESTICCAT,
    FISH,
    UNKNOWN;
    public String toString() {
        return name().toLowerCase();
    }
}
