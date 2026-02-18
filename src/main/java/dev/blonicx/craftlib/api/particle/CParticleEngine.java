package dev.blonicx.craftlib.api.particle;

/**
 * An interface for a custom ParticleEngine
 * @author Blonicx
 * @version 1.1.0
 * @since 1.0.0
 */
public interface CParticleEngine {
    /**
     * Cross-Version way to get the amount of Particles.
     * @return Amount of Particles
     * @since 1.1.0
     */
    int particleAmount();

    /**
     * Cross-Version implementation of the Minecraft Built-In function.
     * @since 1.0.0
     */
    void clearParticles();
}
