package com.pixelmonmod.pixelutilities.textures;

import com.pixelmonmod.pixelutilities.PixelUtilities;
import nova.core.block.BlockFactory;
import nova.core.render.RenderManager;
import nova.core.render.texture.BlockTexture;
import nova.core.render.texture.ItemTexture;
import nova.core.render.texture.Texture;

/**
 * Created by clienthax on 26/7/2015.
 */
public class TextureDatabase {

    //Coins
    public static ItemTexture coin1;
    public static ItemTexture coin5;
    public static ItemTexture coin10;
    public static ItemTexture coin50;
    public static ItemTexture coin100;

    //Badges
    public static ItemTexture bugBadge;
    public static ItemTexture darkBadge;
    public static ItemTexture dragonBadge;
    public static ItemTexture electricBadge;
    public static ItemTexture fightingBadge;
    public static ItemTexture fireBadge;
    public static ItemTexture flyingBadge;
    public static ItemTexture ghostBadge;
    public static ItemTexture grassBadge;
    public static ItemTexture groundBadge;
    public static ItemTexture iceBadge;
    public static ItemTexture normalBadge;
    public static ItemTexture poisonBadge;
    public static ItemTexture psychicBadge;
    public static ItemTexture rockBadge;
    public static ItemTexture steelBadge;
    public static ItemTexture waterBadge;

    //Ores
    public static BlockTexture amethystOre;
    public static BlockTexture crystalOre;
    public static BlockTexture rubyOre;
    public static BlockTexture siliconOre;
    public static BlockTexture sapphireOre;

    //Blocks
    public static BlockTexture amethystBlock;
    public static BlockTexture crystalBlock;
    public static BlockTexture rubyBlock;
    public static BlockTexture sapphireBlock;
    public static BlockTexture bridgeBlock;
    public static BlockTexture caveRock;
    public static BlockTexture insideMolding;
    public static BlockTexture insideWall;
    public static BlockTexture outsideWall;
    public static BlockTexture pokecenter;
    public static BlockTexture pokeDirt;
    public static BlockTexture pokeGrass;
    public static BlockTexture pokeIce;
    public static BlockTexture pokeIceCrushed;
    public static BlockTexture pokeMart;
    public static BlockTexture pokeSand;
    public static BlockTexture pokeSandC1;
    public static BlockTexture pokeSandC2;
    public static BlockTexture pokeSandC3;
    public static BlockTexture pokeSandC4;
    public static BlockTexture pokeSandSide1;
    public static BlockTexture pokeSandSide2;
    public static BlockTexture pokeSandSide3;
    public static BlockTexture pokeSandSide4;
    public static BlockTexture pokeTile1;
    public static BlockTexture rock;
    public static BlockTexture roofCorner1;
    public static BlockTexture roofCorner2;
    public static BlockTexture roofTopSide;
    public static BlockTexture sandyGrass;
    public static BlockTexture shingles;
    public static BlockTexture treeBottom;
    public static BlockTexture treeTop;
    public static BlockTexture window1;
    public static BlockTexture window2;
    public static BlockTexture woodenFlooring;

    //Poke Dolls
    public static BlockTexture aronDollModel;

    //Ore related
    public static ItemTexture amethystItem;
    public static ItemTexture crystalItem;
    public static ItemTexture rubyItem;
    public static ItemTexture siliconItem;
    public static ItemTexture sapphireItem;

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
        steelBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/SteelBadge"));
        waterBadge = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "badges/WaterBadge"));

        //Ores
        amethystOre = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "AmethystOre"));
        crystalOre = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "CrystalOre"));
        rubyOre = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "RubyOre"));
        siliconOre = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "SiliconOre"));
        sapphireOre = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "SapphireOre"));

        //Blocks
        amethystBlock = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "AmethystBlock"));
        crystalBlock = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "CrystalBlock"));
        rubyBlock = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "RubyBlock"));
        sapphireBlock = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "SapphireBlock"));
        bridgeBlock = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "BridgeBlock"));
        caveRock = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "CaveRock"));
        insideMolding = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "InsideMolding"));
        insideWall = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "InsideWall"));
        outsideWall = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "OutsideWall"));
        pokecenter = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "Pokecenter"));
        pokeDirt = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeDirt"));
        pokeGrass = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeGrass"));
        pokeIce = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeIce"));
        pokeIceCrushed = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeIceCrushed"));
        pokeMart = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokemartSign"));
        pokeSand = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "pokesand"));
        pokeSandC1 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeSandC1"));
        pokeSandC2 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeSandC2"));
        pokeSandC3 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeSandC3"));
        pokeSandC4 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeSandC4"));
        pokeSandSide1 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeSandSide1"));
        pokeSandSide2 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeSandSide2"));
        pokeSandSide3 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeSandSide3"));
        pokeSandSide4 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeSandSide4"));
        pokeTile1 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "PokeTile1"));
        rock = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "Rock"));
        roofCorner1 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "RoofCorner1"));
        roofCorner2 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "RoofCorner2"));
        roofTopSide = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "RoofTopSide"));
        sandyGrass = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "SandyGrass"));
        shingles = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "Shingles"));
        treeBottom = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "TreeBottom"));
        treeTop = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "TreeTop"));
        window1 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "Window"));
        window2 = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "Window2"));
        woodenFlooring = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "WoodenFlooring"));

        //Poke Dolls
        aronDollModel = renderManager.registerTexture(new BlockTexture(PixelUtilities.MODID, "AronDollModel"));//TODO check out after

        //Ore related
        amethystItem = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "Amethyst"));
        crystalItem = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "Crystal"));
        rubyItem = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "Ruby"));
        sapphireItem = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "Sapphire"));
        siliconItem = renderManager.registerTexture(new ItemTexture(PixelUtilities.MODID, "Silicon"));

    }

}
