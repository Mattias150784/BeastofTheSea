package net.mattias.beastofsea.entity.client;

import net.mattias.beastofsea.BeastofSea;
import net.mattias.beastofsea.entity.custom.CoralStarfishEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CoralStarfishModel extends AnimatedGeoModel<CoralStarfishEntity> {
    @Override
    public ResourceLocation getModelLocation(CoralStarfishEntity object) {
        return new ResourceLocation(BeastofSea.MOD_ID, "geo/coralstarfish.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(CoralStarfishEntity object) {
        return new ResourceLocation(BeastofSea.MOD_ID, "textures/entity/coralstarfish/starfish.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CoralStarfishEntity animatable) {
        return new ResourceLocation(BeastofSea.MOD_ID, "animations/starfish.animation.json");
    }
}