package de.infoteam.twi.artsycalculator.characterart;

import de.infoteam.twi.artsycalculator.characterart.initializer.CharacterArtInitializer;

import java.util.ArrayList;
import java.util.List;

public class CharacterArt {
    private List<List<Boolean>> area;
    private CharacterArtInitializer initializer;

    CharacterArt (CharacterArtInitializer initializer) {
        this.area = new ArrayList<List<Boolean>>();
        this.initializer = initializer;
        for (int i = 0; i < initializer.getHeight(); i++) {
            area.add(new ArrayList<Boolean>());
        }
        initializeArea(initializer.getHeight(), initializer.getWidth());
    }

    private void initializeArea(int height, int width) {
        for (int i = 0; i < height; i++ ) {
            for (int j = 0; j < width; j++) {
                initPosition(i, j);
            }
        }
        this.initializer.initializeCharacter(this);
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CharacterArt) {
            CharacterArt otherCharacterart = (CharacterArt)obj;
            if (otherCharacterart.getArea().equals(this.getArea())) {
                return true;
            }
        }
        return false;
    }
}
