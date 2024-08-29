package org.practice.creationdesignpattern;

import java.awt.*;

public interface BuilderInterface {
    BedroomBuilder setDimensions(Dimension dimensions);

    BedroomBuilder setCeilingHeight(int ceilingHeight);

    BedroomBuilder setFloorNumber(int floorNumber);

    BedroomBuilder setWallColor(Color wallColor);

    BedroomBuilder setNumberOfWindows(int numberOfWindows);

    BedroomBuilder setNumberOfDoors(int numberOfDoors);
}
