package dev.blonicx.craftlib.api.identifier;

//? if >=1.21.11 {
import net.minecraft.resources.Identifier;
//?} else {
/*import net.minecraft.resources.ResourceLocation;
*///?}

/**
 * The GlobalIdentifier interface.
 * @author Blonicx
 * @version 2.1.0
 * @since 1.0.0
 */
public interface GlobalIdentifier {

    String namespace();
    String path();

    boolean isValidNamespace(String namespace);

    /**
     * Returns an Identifier-Variant based on the Version.
     * @return Identifier-Variant
     */
    //? if >=1.21.11 {
    Identifier unwrap();
    Identifier tryBuild();
    //?} else {
     /*ResourceLocation unwrap();
     ResourceLocation tryBuild();
    *///?}
}

