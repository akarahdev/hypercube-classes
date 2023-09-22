package me.endistic.argparser.elements;

import java.util.ArrayList;

/**
 * A set of elements parsed in no specific order.
 */
public class UnorderedSetElement implements PatternElement {
    /**
     * Creates an unordered set element with the specified pattern elements.
     * @param patternElements Pattern elements to put in the set
     */
    public UnorderedSetElement(PatternElement... patternElements) {}

    ArrayList<PatternElement> patternSets;
}
