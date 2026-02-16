package dev.blonicx.craftlib.api.identifier;

import dev.blonicx.craftlib.internal.identifier.GlobalIdentifierImpl;

public final class GlobalIdentifiers {

    private GlobalIdentifiers() {}

    public static GlobalIdentifier of(String namespace, String path) {
        return new GlobalIdentifierImpl(namespace, path);
    }
}