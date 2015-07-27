package com.pixelmonmod.pixelutilities.textures;

import com.pixelmonmod.pixelutilities.PixelUtilities;
import nova.core.render.RenderManager;
import nova.core.render.texture.ItemTexture;
import nova.core.render.texture.Texture;

/**
 * Created by clienthax on 26/7/2015.
 */
public class TextureDatabase {

    //Coins
    public static Texture coin1;
    public static Texture coin5;
    public static Texture coin10;
    public static Texture coin50;
    public static Texture coin100;

    //Badges
    public static Texture bugBadge;
    public static Texture darkBadge;
    public static Texture dragonBadge;
    public static Texture electricBadge;
    public static Texture fightingBadge;
    public static Texture fireBadge;
    public static Texture flyingBadge;
    public static Texture ghostBadge;
    public static Texture grassBadge;
    public static Texture groundBadge;
    public static Texture iceBadge;
    public static Texture normalBadge;
    public static Texture poisonBadge;
    public static Texture psychicBadge;
    public static Texture rockBadge;
    public static Texture steelBadge;
    public static Texture waterBadge;

    public TextureDatabase(RenderManager renderManager) {
        //Coins
        coin1 = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "coin1"));
        coin5 = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "coin5"));
        coin10 = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "coin10"));
        coin50 = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "coin50"));
        coin100 = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "coin100"));

        //Badges
        bugBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/BugBadge"));
        darkBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/DarkBadge"));
        dragonBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/DragonBadge"));
        electricBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/ElectricBadge"));
        fightingBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/FightingBadge"));
        fireBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/FireBadge"));
        flyingBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/FlyingBadge"));
        ghostBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/GhostBadge"));
        grassBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/GrassBadge"));
        groundBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/GroundBadge"));
        iceBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/IceBadge"));
        normalBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/NormalBadge"));
        poisonBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/PoisonBadge"));
        psychicBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/PsychicBadge"));
        rockBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/RockBadge"));
        steelBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/BugBadge"));
        waterBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/WaterBadge"));



    }

}
