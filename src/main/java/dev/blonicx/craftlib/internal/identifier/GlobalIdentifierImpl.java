package dev.blonicx.craftlib.internal.identifier;

import dev.blonicx.craftlib.api.identifier.GlobalIdentifier;

import java.util.function.Function;

//? if >= 1.21.11 {
import net.minecraft.resources.Identifier;
//?} else {
/*import net.minecraft.resources.ResourceLocation;
 *///?}

public final class GlobalIdentifierImpl implements GlobalIdentifier {

    //? if >= 1.21.11 {
    private final Identifier id;
    //?} else {
    /*private final ResourceLocation id;
     *///?}

    public GlobalIdentifierImpl(String namespace, String path) {
        //? if >= 1.21.11 {
        this.id = Identifier.fromNamespaceAndPath(namespace, path);
         //?} else {
        /*this.id = ResourceLocation.fromNamespaceAndPath(namespace, path);
        *///?}

    }

    @Override
    public String namespace() {
        return id.getNamespace();
    }

    @Override
    public String path() {
        return id.getPath();
    }

    @Override
    public <T> T apply(Function<Object, T> fn) {
        return fn.apply(id);
    }
}
