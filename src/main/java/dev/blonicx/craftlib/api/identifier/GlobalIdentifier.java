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

    /**
     * Checks if a given namespace is valid.
     * @param namespace The namespace that should be checked.
     * @return If the namespace is valid or not.
     * @since 1.2.0
     */
    boolean isValidNamespace(String namespace);

    //? if >=1.21.11 {
    /**
     * Returns an unsafe Identifier-Variant based on the Version.
     * @return Unsafe Identifier-Variant
     * @since 1.0.0
     */
    Identifier unwrap();

    /**
     * Returns a safe Identifier-Variant based on the Version.
     * @return Safe Identifier-Variant
     * @since 1.2.0
     */
    Identifier tryBuild();
    //?} else {

    /*/^*
     * Returns an unsafe ResourceLocation-Variant based on the Version.
     * @return Unsafe ResourceLocation-Variant
     * @since 1.0.0
     ^/
     ResourceLocation unwrap();

    /^*
     * Returns a safe ResourceLocation-Variant based on the Version.
     * @return Safe ResourceLocation-Variant
     * @since 1.2.0
     ^/
    ResourceLocation tryBuild();
    *///?}
}

