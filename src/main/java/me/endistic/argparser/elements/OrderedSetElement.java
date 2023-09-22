package me.endistic.argparser.elements;

import java.util.ArrayList;

/**
 * A set of elements in a specific order.
 */
public class OrderedSetElement implements PatternElement {
    /**
     * Creates an ordered set element with the specified pattern elements.
     * @param patternElements Pattern elements to put in the set
     */
    public OrderedSetElement(PatternElement... patternElements) {}

    ArrayList<PatternElement> patternSets;
}
