package dev.blonicx.craftlib.api.identifier;

import dev.blonicx.craftlib.internal.identifier.GlobalIdentifierImpl;

/**
 * Let you create a new GlobalIdentifier.
 * @author Blonicx
 * @version 1.0.0
 * @since 1.0.0
 */
public final class GlobalIdentifiers {

    private GlobalIdentifiers() {}

    /**
     * Creates a new GlobalIdentifier.
     * @param namespace The namespace that the Identifier should be used in.
     * @param path The path of the Identifier in the namespace.
     * @return Returns a new GlobalIdentifier.
     * @since 1.0.0
     */
    public static GlobalIdentifier of(String namespace, String path) {
        return new GlobalIdentifierImpl(namespace, path);
    }
}