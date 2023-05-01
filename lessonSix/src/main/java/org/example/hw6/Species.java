package org.example.hw6;

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
