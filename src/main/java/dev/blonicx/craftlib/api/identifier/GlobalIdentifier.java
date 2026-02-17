package dev.blonicx.craftlib.api.identifier;

//? if >=1.21.11 {
import net.minecraft.resources.Identifier;
//?} else {
/*import net.minecraft.resources.ResourceLocation;
*///?}

/**
 * The GlobalIdentifier interface
 * @author Blonicx
 * @version 2.0.0
 * @since 1.0.0
 */
public interface GlobalIdentifier {

    String namespace();
    String path();

    //? if >=1.21.11 {
    Identifier unwrap();
    //?} else {
     /*ResourceLocation unwrap();
    *///?}
}

