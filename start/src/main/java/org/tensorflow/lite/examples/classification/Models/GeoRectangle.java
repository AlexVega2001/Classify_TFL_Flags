package org.tensorflow.lite.examples.classification.Models;

public class GeoRectangle {
    int West;
    int East;
    int North;
    int South;

    public GeoRectangle() {
    }

    public GeoRectangle(int west, int east, int north, int south) {
        West = west;
        East = east;
        North = north;
        South = south;
    }

    public int getWest() {
        return West;
    }

    public void setWest(int west) {
        West = west;
    }

    public int getEast() {
        return East;
    }

    public void setEast(int east) {
        East = east;
    }

    public int getNorth() {
        return North;
    }

    public void setNorth(int north) {
        North = north;
    }

    public int getSouth() {
        return South;
    }

    public void setSouth(int south) {
        South = south;
    }
}
