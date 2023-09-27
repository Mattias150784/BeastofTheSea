package net.mattias.beastofsea.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mattias.beastofsea.BeastofSea;
import net.mattias.beastofsea.entity.custom.SeaBunnyEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SeaBunnyRenderer extends GeoEntityRenderer<SeaBunnyEntity> {
    public SeaBunnyRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SeaBunnyModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(SeaBunnyEntity instance) {
        return new ResourceLocation(BeastofSea.MOD_ID, "textures/entity/seabunny/seabunny.png");
    }

    @Override
    public RenderType getRenderType(SeaBunnyEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}