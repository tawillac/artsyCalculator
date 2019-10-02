package de.infoteam.twi.artsycalculator.characterart;

import de.infoteam.twi.artsycalculator.characterart.initializer.*;

import java.util.HashMap;
import java.util.Map;


public class CharacterArtBuilder {

    private CharacterArtBuilder() {

    }

    static Map<String, CharacterArtInitializer> initializerMap = new HashMap<>();
    static {
        initializerMap.put("1", new InitializeOne());
        initializerMap.put("2", new InitializeTwo());
        initializerMap.put("3", new InitializeThree());
        initializerMap.put("4", new InitializeFour());
        initializerMap.put(" ", new InitializeSpace());
        initializerMap.put("+", new InitializePlus());
        initializerMap.put("-", new InitializeMinus());
        initializerMap.put("=", new InitializeEquals());
        initializerMap.put("default", new InitializeNone());
    }

    private static CharacterArtInitializer getInitializer(String key) {
        if (initializerMap.get(key) != null) {
            return initializerMap.get(key);
        } else {
            return initializerMap.get("default");
        }
    }

    public static CharacterArt getCharacterArt(String value) {
        return new CharacterArt(getInitializer(value));
    }
}
