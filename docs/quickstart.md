# Quickstart
CraftLib hasn't really an Implementation Point and has rather just Single Classes that can be imported.
An example for that is the Particles Class. It can be used like this:
```java
import dev.blonicx.craftlib.api.particle.Particles;

// From Version 1.21.8 and above, you can't clear all Particles using the Built-In Particle Engine because the methode is private.
// CraftLib makes that Possible!
Particles.ENGINE.clearParticles();
```