package io.github.nma.utils.stream;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * @author Nick Ma (nickma38@gmail.com)
 */
public class StreamUtils {

    public static <T> Stream<T> asStream(Iterable<T> sourceIterable) {
        return asStream(sourceIterable.iterator());
    }

    public static <T> Stream<T> asStream(Iterator<T> sourceIterator) {
        return asStream(sourceIterator, false);
    }

    public static <T> Stream<T> asStream(Iterator<T> sourceIterator, boolean parallel) {
        Iterable<T> iterable = () -> sourceIterator;
        return StreamSupport.stream(iterable.spliterator(), parallel);
    }
}