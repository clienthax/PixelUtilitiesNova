package com.pixelmonmod.pixelutilities.items;

import com.pixelmonmod.pixelutilities.textures.TextureDatabase;
import nova.core.item.ItemFactory;
import nova.core.item.ItemManager;

/**
 * Created by clienthax on 27/7/2015.
 */
public class ItemDatabase {

    //Coins
    final ItemFactory coin1;
    final ItemFactory coin5;
    final ItemFactory coin10;
    final ItemFactory coin50;
    final ItemFactory coin100;

    //Badges
    final ItemFactory bugBadge;
    final ItemFactory darkBadge;
    final ItemFactory dragonBadge;
    final ItemFactory electricBadge;
    final ItemFactory fightingBadge;
    final ItemFactory fireBadge;
    final ItemFactory flyingBadge;
    final ItemFactory ghostBadge;
    final ItemFactory grassBadge;
    final ItemFactory groundBadge;
    final ItemFactory iceBadge;
    final ItemFactory normalBadge;
    final ItemFactory poisonBadge;
    final ItemFactory psychicBadge;
    final ItemFactory rockBadge;
    final ItemFactory steelBadge;
    final ItemFactory waterBadge;

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
    }

}
