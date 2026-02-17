package dev.blonicx.craftlib.internal.identifier;

import dev.blonicx.craftlib.api.identifier.GlobalIdentifier;

//? if >= 1.21.11 {
import net.minecraft.resources.Identifier;
//?} else {
/*import net.minecraft.resources.ResourceLocation;
 *///?}

public final class GlobalIdentifierImpl implements GlobalIdentifier {
    private final String namespace;
    private final String path;

    public GlobalIdentifierImpl(String namespace, String path) {
        this.namespace = namespace;
        this.path = path;
    }

    public String namespace() { return namespace; }
    public String path() { return path; }

    //? if >=1.21.11 {
    public Identifier unwrap() { return Identifier.fromNamespaceAndPath(this.namespace, this.path); }

    public Identifier tryBuild() { return Identifier.tryBuild(this.namespace, this.path); }

    public boolean isValidNamespace(String namespace) { return Identifier.isValidNamespace(namespace); }
    //?} else {
    /*public ResourceLocation unwrap() { return ResourceLocation.fromNamespaceAndPath(this.namespace, this.path); }

    public ResourceLocation tryBuild() { return ResourceLocation.tryBuild(this.namespace, this.path); }

    public boolean isValidNamespace(String namespace) { return ResourceLocation.isValidNamespace(namespace); }
    *///?}
}
