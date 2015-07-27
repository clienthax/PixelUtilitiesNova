package com.pixelmonmod.pixelutilities.blocks;

import com.pixelmonmod.pixelutilities.items.ItemDatabase;
import com.pixelmonmod.pixelutilities.textures.TextureDatabase;
import nova.core.block.BlockFactory;
import nova.core.block.BlockManager;

/**
 * Created by clienthax on 27/7/2015.
 */
public class BlockDatabase {

    //Ores
    public static BlockFactory amethystOre;
    public static BlockFactory crystalOre;
    public static BlockFactory rubyOre;
    public static BlockFactory siliconOre;
    public static BlockFactory sapphireOre;

    //Blocks
    public static BlockFactory amethystBlock;
    public static BlockFactory crystalBlock;
    public static BlockFactory rubyBlock;
    public static BlockFactory sapphireBlock;
    public static BlockFactory bridgeBlock;
    public static BlockFactory caveRock;
    public static BlockFactory insideMolding;
    public static BlockFactory insideWall;
    public static BlockFactory outsideWall;
    public static BlockFactory pokecenter;
    public static BlockFactory pokeDirt;
    public static BlockFactory pokeGrass;
    public static BlockFactory pokeIce;
    public static BlockFactory pokeIceCrushed;
    public static BlockFactory pokeMart;
    public static BlockFactory pokeSand;
    public static BlockFactory pokeSandC1;
    public static BlockFactory pokeSandC2;
    public static BlockFactory pokeSandC3;
    public static BlockFactory pokeSandC4;
    public static BlockFactory pokeSandSide1;
    public static BlockFactory pokeSandSide2;
    public static BlockFactory pokeSandSide3;
    public static BlockFactory pokeSandSide4;
    public static BlockFactory pokeTile1;
    public static BlockFactory rock;
    public static BlockFactory roofCorner1;
    public static BlockFactory roofCorner2;
    public static BlockFactory roofTopSide;
    public static BlockFactory sandyGrass;
    public static BlockFactory shingles;
    public static BlockFactory treeBottom;
    public static BlockFactory treeTop;
    public static BlockFactory window1;
    public static BlockFactory window2;
    public static BlockFactory woodenFlooring;

    //Poke Dolls
    public static BlockFactory aronBlock;

    public BlockDatabase(BlockManager blockManager) {
        //Ores
        amethystOre = blockManager.register(args -> new GenericOre("amethystOre", TextureDatabase.amethystOre, "PixelUtilOres", ItemDatabase.amethyst, 1));
        crystalOre = blockManager.register(args -> new GenericOre("crystalOre", TextureDatabase.crystalOre, "PixelUtilOres", ItemDatabase.crystal, 1));
        rubyOre = blockManager.register(args -> new GenericOre("rubyOre", TextureDatabase.rubyOre, "PixelUtilOres", ItemDatabase.ruby, 1));
        siliconOre = blockManager.register(args -> new GenericOre("siliconOre", TextureDatabase.siliconOre, "PixelUtilOres", ItemDatabase.silicon, 1));
        sapphireOre = blockManager.register(args -> new GenericOre("sapphireOre", TextureDatabase.sapphireOre, "PixelUtilOres", ItemDatabase.sapphire, 1));

        //Blocks
        amethystBlock = blockManager.register(args -> new GenericBlock("amethystBlock", TextureDatabase.amethystBlock, "PixelUtilBlocks"));
        crystalBlock = blockManager.register(args -> new GenericBlock("crystalBlock", TextureDatabase.crystalBlock, "PixelUtilBlocks"));
        rubyBlock = blockManager.register(args -> new GenericBlock("rubyBlock", TextureDatabase.rubyBlock, "PixelUtilBlocks"));
        sapphireBlock = blockManager.register(args -> new GenericBlock("sapphireBlock", TextureDatabase.sapphireBlock, "PixelUtilBlocks"));
        bridgeBlock = blockManager.register(args -> new GenericRotatableBlock("bridgeBlock", TextureDatabase.bridgeBlock, "PixelUtilBlocks"));//TODO needs to rotate texture

        caveRock = blockManager.register(args -> new GenericBlock("caveRock", TextureDatabase.caveRock, "PixelUtilBlocks"));
        insideMolding = blockManager.register(args -> new GenericBlock("insideMolding", TextureDatabase.insideMolding, "PixelUtilBlocks"));//TODO needs to have the insidewall png on top face
        insideWall = blockManager.register(args -> new GenericBlock("insideWall", TextureDatabase.insideWall, "PixelUtilBlocks"));
        outsideWall = blockManager.register(args -> new GenericBlock("outsideWall", TextureDatabase.outsideWall, "PixelUtilBlocks"));
        pokecenter = blockManager.register(args -> new GenericBlock("pokecenter", TextureDatabase.pokecenter, "PixelUtilBlocks"));
        pokeDirt = blockManager.register(args -> new GenericBlock("pokeDirt", TextureDatabase.pokeDirt, "PixelUtilBlocks"));
        pokeGrass = blockManager.register(args -> new GenericBlock("pokeGrass", TextureDatabase.pokeGrass, "PixelUtilBlocks"));
        pokeIce = blockManager.register(args -> new GenericBlock("pokeIce", TextureDatabase.pokeIce, "PixelUtilBlocks"));//TODO maybe make rotatable?
        pokeIceCrushed = blockManager.register(args -> new GenericBlock("pokeIceCrushed", TextureDatabase.pokeIceCrushed, "PixelUtilBlocks"));
        pokeMart = blockManager.register(args -> new GenericBlock("pokeMart", TextureDatabase.pokeMart, "PixelUtilBlocks"));
        pokeSand = blockManager.register(args -> new GenericBlock("pokeSand", TextureDatabase.pokeSand, "PixelUtilBlocks"));
        pokeSandC1 = blockManager.register(args -> new GenericBlock("pokeSandC1", TextureDatabase.pokeSandC1, "PixelUtilBlocks"));
        pokeSandC2 = blockManager.register(args -> new GenericBlock("pokeSandC2", TextureDatabase.insideWall, "PixelUtilBlocks"));
        pokeSandC3 = blockManager.register(args -> new GenericBlock("pokeSandC3", TextureDatabase.pokeSandC3, "PixelUtilBlocks"));
        pokeSandC4 = blockManager.register(args -> new GenericBlock("pokeSandC4", TextureDatabase.pokeSandC4, "PixelUtilBlocks"));
        pokeSandSide1 = blockManager.register(args -> new GenericBlock("pokeSandSide1", TextureDatabase.pokeSandSide1, "PixelUtilBlocks"));
        pokeSandSide2 = blockManager.register(args -> new GenericBlock("pokeSandSide2", TextureDatabase.pokeSandSide2, "PixelUtilBlocks"));
        pokeSandSide3 = blockManager.register(args -> new GenericBlock("pokeSandSide3", TextureDatabase.pokeSandSide3, "PixelUtilBlocks"));
        pokeSandSide4 = blockManager.register(args -> new GenericBlock("pokeSandSide4", TextureDatabase.pokeSandSide4, "PixelUtilBlocks"));
        pokeTile1 = blockManager.register(args -> new GenericBlock("pokeTile1", TextureDatabase.pokeTile1, "PixelUtilBlocks"));
        rock = blockManager.register(args -> new GenericBlock("rock", TextureDatabase.rock, "PixelUtilBlocks"));
        roofCorner1 = blockManager.register(args -> new GenericBlock("roofCorner1", TextureDatabase.roofCorner1, "PixelUtilBlocks"));//rotatable?
        roofCorner2 = blockManager.register(args -> new GenericBlock("roofCorner2", TextureDatabase.roofCorner2, "PixelUtilBlocks"));
        roofTopSide = blockManager.register(args -> new GenericBlock("roofTopSide", TextureDatabase.roofTopSide, "PixelUtilBlocks"));
        sandyGrass = blockManager.register(args -> new GenericBlock("sandyGrass", TextureDatabase.sandyGrass, "PixelUtilBlocks"));
        shingles = blockManager.register(args -> new GenericBlock("shingles", TextureDatabase.shingles, "PixelUtilBlocks"));
        treeBottom = blockManager.register(args -> new GenericBlock("treeBottom", TextureDatabase.treeBottom, "PixelUtilBlocks"));
        treeTop = blockManager.register(args -> new GenericBlock("treeTop", TextureDatabase.treeTop, "PixelUtilBlocks"));
        window1 = blockManager.register(args -> new GenericBlock("window1", TextureDatabase.window1, "PixelUtilBlocks"));
        window2 = blockManager.register(args -> new GenericBlock("window2", TextureDatabase.window2, "PixelUtilBlocks"));
        woodenFlooring = blockManager.register(args -> new GenericBlock("woodenFlooring", TextureDatabase.woodenFlooring, "PixelUtilBlocks"));

        //Poke Dolls
        aronBlock = blockManager.register(PokeDoll.class);//TODO needs to be rotatable

    }

}
