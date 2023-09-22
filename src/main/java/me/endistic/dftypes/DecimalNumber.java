package me.endistic.dftypes;

/**
 * Represents DiamondFire's number type.
 * DiamondFire's number type is represented by a 64-bit integer, with the last 3 numbers representing
 * decimal places. To have accurate behavior to DiamondFire, use this whenever possible.
 */
public class DecimalNumber extends Number {
    long internalValue = 0;

    public static DecimalNumber MAX_VALUE = new DecimalNumber(Long.MAX_VALUE);
    public static DecimalNumber ZERO = DecimalNumber.valueOf(0);
    public static DecimalNumber MIN_VALUE = new DecimalNumber(Long.MIN_VALUE);

    public DecimalNumber(long value) {
        this.internalValue = value;
    }

    // thanks to DasDarkLord for helping with
    // some of the nonsense going on here lol
    public static DecimalNumber valueOf(long value) {
        return new DecimalNumber(value * 1000);
    }

    public static DecimalNumber valueOf(int value) {
        return new DecimalNumber(value * 1000L);
    }

    public static DecimalNumber valueOf(short value) {
        return new DecimalNumber(value * 1000);
    }

    public static DecimalNumber valueOf(byte value) {
        return new DecimalNumber(value * 1000);
    }

    public static DecimalNumber valueOf(double value) {
        return new DecimalNumber((long) (value * 1000));
    }

    public static DecimalNumber valueOf(float value) {
        return new DecimalNumber((long) (value * 1000));
    }

    @Override
    public int intValue() {
        return (int) internalValue / 1000;
    }

    @Override
    public long longValue() {
        return internalValue / 1000;
    }

    @Override
    public float floatValue() {
        return internalValue / 1000f;
    }

    @Override
    public double doubleValue() {
        return internalValue / 1000.0;
    }

    public DecimalNumber add(DecimalNumber otherNumber) {
        return new DecimalNumber(this.internalValue + otherNumber.internalValue);
    }

    public DecimalNumber subtract(DecimalNumber otherNumber) {
        return new DecimalNumber(this.internalValue - otherNumber.internalValue);
    }

    public DecimalNumber multiply(DecimalNumber otherNumber) {
        return new DecimalNumber(this.internalValue * otherNumber.internalValue / 1000);
    }

    public DecimalNumber divide(DecimalNumber otherNumber) {
        return new DecimalNumber(this.internalValue * 1000 / otherNumber.internalValue);
    }
}
