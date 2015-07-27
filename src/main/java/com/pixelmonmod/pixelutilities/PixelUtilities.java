package com.pixelmonmod.pixelutilities;

import com.pixelmonmod.pixelutilities.items.ItemDatabase;
import com.pixelmonmod.pixelutilities.textures.TextureDatabase;
import nova.core.block.BlockManager;
import nova.core.item.ItemManager;
import nova.core.loader.Loadable;
import nova.core.loader.NovaMod;
import nova.core.recipes.RecipeManager;
import nova.core.render.RenderManager;

@NovaMod(name = PixelUtilities.MODNAME, id = PixelUtilities.MODID, version = PixelUtilities.MODVERSION, novaVersion = "0.0.1")
public class PixelUtilities implements Loadable {

    public static final String MODID = "pixelutilities";
    public static final String MODNAME = "pixelutilities";
    public static final String MODVERSION = "3.3.8";

    private final ItemManager itemManager;
    private final BlockManager blockManager;
    private final RenderManager renderManager;
    private final RecipeManager recipeManager;
    private TextureDatabase textureDatabase;
    private ItemDatabase itemDatabase;

    public PixelUtilities(ItemManager itemManager, BlockManager blockManager, RenderManager renderManager, RecipeManager recipeManager) {
        this.itemManager = itemManager;
        this.blockManager = blockManager;
        this.renderManager = renderManager;
        this.recipeManager = recipeManager;
    }

    @Override
    public void preInit() {
        this.textureDatabase = new TextureDatabase(renderManager);
        this.itemDatabase = new ItemDatabase(itemManager);
    }

}
