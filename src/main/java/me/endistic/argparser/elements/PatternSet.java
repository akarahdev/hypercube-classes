package me.endistic.argparser.elements;

import java.util.ArrayList;

/**
 * Represents a set of patterns.
 */
public class PatternSet {
    public PatternSet() {}

    ArrayList<PatternElement> patternSets;

    /**
     * Adds an element to the pattern set.
     * @param element Element to add to the pattern mset
     * @return New pattern set
     */
    public PatternSet addElement(PatternElement element) {
        patternSets.add(element);
        return this;
    }
}
