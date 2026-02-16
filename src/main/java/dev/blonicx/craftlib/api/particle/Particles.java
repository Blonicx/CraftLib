package dev.blonicx.craftlib.api.particle;

import dev.blonicx.craftlib.internal.particle.CParticleEngineImpl;

public final class Particles {

    private Particles() {}

    public static final CParticleEngine ENGINE = new CParticleEngineImpl();
}
