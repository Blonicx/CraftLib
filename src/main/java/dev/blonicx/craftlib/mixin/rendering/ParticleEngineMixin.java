package dev.blonicx.craftlib.mixin.rendering;


import dev.blonicx.craftlib.internal.particle.ParticleEngineAccess;
import net.minecraft.client.particle.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

//? if <= 1.21.8 {
/*import net.minecraft.core.particles.ParticleGroup;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import org.spongepowered.asm.mixin.Final;

import java.util.Map;
import java.util.Queue;
 *///?}

@Mixin(ParticleEngine.class)
public abstract class ParticleEngineMixin implements ParticleEngineAccess {
    //? if >= 1.21.9 {
    @Shadow
    public abstract void clearParticles();

    @Override
    public void craftlib$clearParticles() {
        this.clearParticles();
    }
    //?} else {
    /*@Shadow @Final
    private Map<ParticleRenderType, Queue<Particle>> particles;

    @Shadow @Final
    private Queue<Particle> particlesToAdd;

    @Shadow @Final
    private Queue<TrackingEmitter> trackingEmitters;

    @Shadow @Final
    private Object2IntOpenHashMap<ParticleGroup> trackedParticleCounts;

    @Override
    public void craftlib$clearParticles() {
        particles.clear();
        particlesToAdd.clear();
        trackingEmitters.clear();
        trackedParticleCounts.clear();
    }
*///?}
}
