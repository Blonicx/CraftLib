package dev.blonicx.craftlib.api.particle;

import dev.blonicx.craftlib.internal.particle.CParticleEngineImpl;

/**
 * Particle class containing a Custom Particle Engine
 * @author Blonicx
 * @version 1.0.0
 * @since 1.0.0
 */
public final class Particles {

    private Particles() {}

    /**
     * Custom Public Particle Engine Implementation
     */
    public static final CParticleEngine ENGINE = new CParticleEngineImpl();
}
