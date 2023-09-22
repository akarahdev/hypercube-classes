package me.endistic.argparser.elements;

import me.endistic.argparser.types.Argument;

/**
 * A node representing a single argument.
 */
public class SingletonNode implements PatternElement {
    /**
     * Creates a new Singleton Node.
     * @param name Name of the argument to reference
     * @param allowedTypes Allowed types of the argument
     */
    public SingletonNode(String name, Argument... allowedTypes) {

    }

    /**
     * Is this SingletonNode optional?
     */
    boolean isOptional = false;
    /**
     * If it is optional, what's the default value
     * of this singleton node?
     */
    Object defaultValue = null;

    public SingletonNode setOptional(Object defaultValue) {
        this.isOptional = true;
        this.defaultValue = defaultValue;
        return this;
    }

    public Object getDefaultValue() {
        return this.defaultValue;
    }

}
