package com.pixelmonmod.pixelutilities.items;

import com.pixelmonmod.pixelutilities.textures.TextureDatabase;
import nova.core.item.ItemFactory;
import nova.core.item.ItemManager;

/**
 * Created by clienthax on 27/7/2015.
 */
public class ItemDatabase {

    //Coins
    public static ItemFactory coin1;
    public static ItemFactory coin5;
    public static ItemFactory coin10;
    public static ItemFactory coin50;
    public static ItemFactory coin100;

    //Badges
    public static ItemFactory bugBadge;
    public static ItemFactory darkBadge;
    public static ItemFactory dragonBadge;
    public static ItemFactory electricBadge;
    public static ItemFactory fightingBadge;
    public static ItemFactory fireBadge;
    public static ItemFactory flyingBadge;
    public static ItemFactory ghostBadge;
    public static ItemFactory grassBadge;
    public static ItemFactory groundBadge;
    public static ItemFactory iceBadge;
    public static ItemFactory normalBadge;
    public static ItemFactory poisonBadge;
    public static ItemFactory psychicBadge;
    public static ItemFactory rockBadge;
    public static ItemFactory steelBadge;
    public static ItemFactory waterBadge;

    //Ore related
    public static ItemFactory amethyst;
    public static ItemFactory crystal;
    public static ItemFactory ruby;
    public static ItemFactory sapphire;
    public static ItemFactory silicon;


    public ItemDatabase(ItemManager itemManager) {
        //Coins
        coin1 = itemManager.register(args -> new GenericItem("coin1", TextureDatabase.coin1, "Coins"));
        coin5 = itemManager.register(args -> new GenericItem("coin5", TextureDatabase.coin5, "Coins"));
        coin10 = itemManager.register(args -> new GenericItem("coin10", TextureDatabase.coin10, "Coins"));
        coin50 = itemManager.register(args -> new GenericItem("coin50", TextureDatabase.coin50, "Coins"));
        coin100 = itemManager.register(args -> new GenericItem("coin100", TextureDatabase.coin100, "Coins"));

        //Badges
        bugBadge = itemManager.register(args -> new GenericItem("bugBadge", TextureDatabase.bugBadge, "Badges"));
        darkBadge = itemManager.register(args -> new GenericItem("darkBadge", TextureDatabase.darkBadge, "Badges"));
        dragonBadge = itemManager.register(args -> new GenericItem("dragonBadge", TextureDatabase.dragonBadge, "Badges"));
        electricBadge = itemManager.register(args -> new GenericItem("electricBadge", TextureDatabase.electricBadge, "Badges"));
        fightingBadge = itemManager.register(args -> new GenericItem("fightingBadge", TextureDatabase.fightingBadge, "Badges"));
        fireBadge = itemManager.register(args -> new GenericItem("fireBadge", TextureDatabase.fireBadge, "Badges"));
        flyingBadge = itemManager.register(args -> new GenericItem("flyingBadge", TextureDatabase.flyingBadge, "Badges"));
        ghostBadge = itemManager.register(args -> new GenericItem("ghostBadge", TextureDatabase.ghostBadge, "Badges"));
        grassBadge = itemManager.register(args -> new GenericItem("grassBadge", TextureDatabase.grassBadge, "Badges"));
        groundBadge = itemManager.register(args -> new GenericItem("groundBadge", TextureDatabase.groundBadge, "Badges"));
        iceBadge = itemManager.register(args -> new GenericItem("iceBadge", TextureDatabase.iceBadge, "Badges"));
        normalBadge = itemManager.register(args -> new GenericItem("normalBadge", TextureDatabase.normalBadge, "Badges"));
        poisonBadge = itemManager.register(args -> new GenericItem("poisonBadge", TextureDatabase.poisonBadge, "Badges"));
        psychicBadge = itemManager.register(args -> new GenericItem("psychicBadge", TextureDatabase.psychicBadge, "Badges"));
        rockBadge = itemManager.register(args -> new GenericItem("rockBadge", TextureDatabase.rockBadge, "Badges"));
        steelBadge = itemManager.register(args -> new GenericItem("steelBadge", TextureDatabase.steelBadge, "Badges"));
        waterBadge = itemManager.register(args -> new GenericItem("waterBadge", TextureDatabase.waterBadge, "Badges"));

        //Ore related
        amethyst = itemManager.register(args -> new GenericItem("amethyst", TextureDatabase.amethystItem));
        crystal = itemManager.register(args -> new GenericItem("crystal", TextureDatabase.crystalItem));
        ruby = itemManager.register(args -> new GenericItem("ruby", TextureDatabase.rubyItem));
        sapphire = itemManager.register(args -> new GenericItem("sapphire", TextureDatabase.sapphireItem));
        silicon = itemManager.register(args -> new GenericItem("silicon", TextureDatabase.siliconItem));
    }

}
