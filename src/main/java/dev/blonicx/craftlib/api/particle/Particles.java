package dev.blonicx.craftlib.api.particle;

import dev.blonicx.craftlib.internal.particle.CParticleEngineImpl;

/**
 * Creates a custom public accessible Particle Engine
 * @author Blonicx
 * @version 1.0.0
 * @since 1.0.0
 */
public final class Particles {

    private Particles() {}

    public static final CParticleEngine ENGINE = new CParticleEngineImpl();
}
