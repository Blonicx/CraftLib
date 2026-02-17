package dev.blonicx.craftlib.api.identifier;

import java.util.function.Function;

/**
 * The GlobalIdentifier interface
 * @author Blonicx
 * @version 1.0.0
 * @since 1.0.0
 */
public interface GlobalIdentifier {
    String namespace();
    String path();

    <T> T apply(Function<Object, T> fn);
}
