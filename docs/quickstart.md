# Quickstart
CraftLib hasn't really an Implementation Point and has rather just Single Classes that can be imported.
An example for that is the Particles Class. It can be used like this:
```java
import dev.blonicx.craftlib.api.particle.Particles;

// From Version 1.21.8 and above, you can't clear all Particles using the Built-In Particle Engine because the methode is private.
// CraftLib makes that Possible!
Particles.ENGINE.clearParticles();
```

Another useful thing is the GlobalIdentifier.
With that you can make a ResourceLocation and Identifier at the same Time.
An example would be:
```java
import dev.blonicx.craftlib.api.identifier.GlobalIdentifier;
import dev.blonicx.craftlib.api.identifier.GlobalIdentifiers;

public static <GenericItem extends Item> GenericItem register(String name, Function<Item.Properties, GenericItem> itemFactory, Item.Properties settings) {
    // Create an GlobalIdentifier
    GlobalIdentifier id = GlobalIdentifiers.of(ExampleMod.MOD_ID, name);
    
    // Create the item key.
    ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, id.unwrap());

    // Create the item instance.
    GenericItem item = itemFactory.apply(settings.setId(itemKey));

    // Register the item.
    Registry.register(BuiltInRegistries.ITEM, itemKey, item);

    return item;
}
```