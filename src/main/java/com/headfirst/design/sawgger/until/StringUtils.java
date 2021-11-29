package com.headfirst.design.sawgger.until;

import java.util.Iterator;
import java.util.Objects;

/**
 * @author LiuCan
 * @date 2021/11/29 9:52
 * @description StringUtils
 */
public class StringUtils {

    public static final String EMPTY = "";

    /**
     * @author LiuCan
     * @date 2021/11/29 9:54
     * @param iterable
     * @param separator
     * @return java.lang.String
     */
    public static String join(final Iterable<?> iterable, final char separator) {
        if (iterable == null) {
            return null;
        }
        return join(iterable.iterator(), separator);
    }
    /**
     * @author LiuCan
     * @date 2021/11/29 9:55
     * @param iterator
     * @param separator
     * @return java.lang.String
     */
    public static String join(final Iterator<?> iterator, final char separator) {

        // handle null, zero and one elements before building a buffer
        if (iterator == null) {
            return null;
        }
        if (!iterator.hasNext()) {
            return EMPTY;
        }
        final Object first = iterator.next();
        if (!iterator.hasNext()) {
            return Objects.toString(first, "");
        }

        // two or more elements  Java default is 16, probably too small
        final StringBuilder buf = new StringBuilder(256);
        if (first != null) {
            buf.append(first);
        }

        while (iterator.hasNext()) {
            buf.append(separator);
            final Object obj = iterator.next();
            if (obj != null) {
                buf.append(obj);
            }
        }

        return buf.toString();
    }

    /**
     * @author LiuCan
     * @date 2021/11/29 9:57
     * @param cs
     * @return boolean
     */
    public static boolean isNotEmpty(final CharSequence cs) {
        return !isEmpty(cs);
    }

    /**
     * @author LiuCan
     * @date 2021/11/29 9:57
     * @param cs
     * @return boolean
     */
    public static boolean isEmpty(final CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

}
