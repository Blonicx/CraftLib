package dev.blonicx.craftlib.internal.identifier;

import dev.blonicx.craftlib.api.identifier.GlobalIdentifier;

//? if >= 1.21.11 {
import net.minecraft.resources.Identifier;
//?} else {
/*import net.minecraft.resources.ResourceLocation;
 *///?}

public final class GlobalIdentifierImpl implements GlobalIdentifier {

    //? if >=1.21.11 {
    private final Identifier id;
    //?} else {
    /*private final ResourceLocation id;
    *///?}

    public GlobalIdentifierImpl(String namespace, String path) {
        //? if >=1.21.11 {
        this.id = Identifier.fromNamespaceAndPath(namespace, path);
        //?} else {
         /*this.id = ResourceLocation.fromNamespaceAndPath(namespace, path);
        *///?}
    }

    public String namespace() { return id.getNamespace(); }
    public String path() { return id.getPath(); }

    //? if >=1.21.11 {
    public Identifier unwrap() { return id; }
    //?} else {
    /*public ResourceLocation unwrap() { return id; }
    *///?}
}
