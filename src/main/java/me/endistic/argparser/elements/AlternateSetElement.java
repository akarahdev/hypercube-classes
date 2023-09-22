package me.endistic.argparser.elements;

import java.util.ArrayList;

/**
 * Represents a pattern set that allows one of the given elements.
 */
public class AlternateSetElement implements PatternElement {
    /**
     * Creates an alternate set element with the specified pattern elements.
     * @param patternElements Pattern elements to put in the set
     */
    public AlternateSetElement(PatternElement... patternElements) {}

    ArrayList<PatternElement> patternSets;
    
    
}
