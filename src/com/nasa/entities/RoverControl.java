package com.nasa.entities;

public interface RoverControl {

    void rotateLeft();

    void rotateRight();

    void move();

    void explore() throws Exception;

}

