/*
 * Janssen Project software is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2020, Janssen Project
 */

package io.jans.as.model.util;

/**
 * @author Yuriy Zabrovarnyy
 */
public class ByteUtils {

    private ByteUtils() {
    }

    public static int twoBytesAsInt(byte one, byte two) {
        return (byteAsInt(one) << 8) | byteAsInt(two);
    }

    public static int twoIntsAsInt(int one, int two) {
        return (one << 8) | two;
    }

    public static int byteAsInt(byte value) {
        return value & 0xff;
    }
}
