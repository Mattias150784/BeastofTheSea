package net.mattias.beastofsea.entity.client;

import net.mattias.beastofsea.BeastofSea;
import net.mattias.beastofsea.entity.custom.SeaBunnyEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SeaBunnyModel extends AnimatedGeoModel<SeaBunnyEntity> {
    @Override
    public ResourceLocation getModelLocation(SeaBunnyEntity object) {
        return new ResourceLocation(BeastofSea.MOD_ID, "geo/seabunny.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SeaBunnyEntity object) {
        return new ResourceLocation(BeastofSea.MOD_ID, "textures/entity/seabunny/seabunny.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SeaBunnyEntity animatable) {
        return new ResourceLocation(BeastofSea.MOD_ID, "animations/seabunny.walk.json");
    }
}