package de.infoteam.twi.artsycalculator.characterart;

import java.util.ArrayList;
import java.util.List;

public class CharacterArt {
    private List<List<Boolean>> area; // TODO Find better name!

    CharacterArt (int height, int width) {
        this.area = new ArrayList<List<Boolean>>();
        for (int i = 0; i < height; i++) {
            area.add(new ArrayList<Boolean>());
        }
        initializeArea(height, width);
    }

    private void initializeArea(int height, int width) {
        for (int i = 0; i < height; i++ ) {
            for (int j = 0; j < width; j++) {
                initPosition(i, j);
            }
        }
    }

    CharacterArt (List<List<Boolean>> area) {
        this.area = area;
    }

    public void initPosition(int heightCoordinate, int widthCoordinate) {
        area.get(heightCoordinate).add(widthCoordinate, false);
    }

    public void setPosition(int heightCoordinate, int widthCoordinate, Boolean content) {
        area.get(heightCoordinate).set(widthCoordinate, content);
    }

    public Boolean getPosition(int heightCoordinate, int widthCoordinate) {
        return area.get(heightCoordinate).get(widthCoordinate);
    }

    public List<List<Boolean>> getArea() {
        return area;
    }

}
