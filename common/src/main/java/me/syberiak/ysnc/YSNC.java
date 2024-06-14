package me.syberiak.ysnc;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

import net.minecraft.world.entity.LivingEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class YSNC {
    public static final String MOD_ID = "ysnc";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final TagKey<EntityType<?>> CANT_CLIMB_LADDERS_TAG = TagKey.create(
            Registries.ENTITY_TYPE, ResourceLocation.tryBuild(MOD_ID, "cant_climb_ladders")
    );
    public static final boolean DEBUG_TURN_OFF = false;

    public static boolean cantClimbLadder(LivingEntity entity) {
        return !DEBUG_TURN_OFF && entity.getType().is(CANT_CLIMB_LADDERS_TAG);
    }

    public static void init() {
        LOGGER.info("Initialized.");
    }
}
