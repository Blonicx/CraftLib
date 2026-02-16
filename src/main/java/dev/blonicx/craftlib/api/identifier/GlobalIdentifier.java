package dev.blonicx.craftlib.api.identifier;

import java.util.function.Function;

public interface GlobalIdentifier {
    String namespace();
    String path();

    <T> T apply(Function<Object, T> fn);
}
