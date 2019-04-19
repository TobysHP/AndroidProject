package com.example.pierr.androidproject;

public interface Movable {
    void move();
    int getMaxMovements();
    int getAvailableMovements();
    void resetAvailableMovements();
}
