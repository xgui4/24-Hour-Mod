package net.kaupenjoe.onedaymod.entity.client;

import net.kaupenjoe.onedaymod.OneDayMod;
import net.minecraft.client.render.entity.CreeperEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.util.Identifier;

public class HappyCreeperEntityRenderer extends CreeperEntityRenderer {
    private static final Identifier FAKE_TEXTURE = new Identifier("textures/entity/minecraft_creeper.png");
    private static final Identifier TEXTURE = new Identifier("textures/entity/creeper/creeper.png");

    public HappyCreeperEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    public Identifier getTexture(CreeperEntity creeperEntity) {
        if(creeperEntity.currentFuseTime > 100) {
            return TEXTURE;
        } else {
            return FAKE_TEXTURE;
        }
    }
}
