package dev.blonicx.craftlib.internal.particle;

import dev.blonicx.craftlib.api.particle.CParticleEngine;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.ParticleEngine;

public final class CParticleEngineImpl implements CParticleEngine {

    @Override
    public int particleAmount() {
        ParticleEngine engine = Minecraft.getInstance().particleEngine;

        if (engine instanceof ParticleEngineAccess access) {
            return access.craftlib$size();
        } else {
            return 0;
        }
    }

    @Override
    public void clearParticles() {
        ParticleEngine engine = Minecraft.getInstance().particleEngine;

        if (engine instanceof ParticleEngineAccess access) {
            access.craftlib$clearParticles();
        }
    }
}
