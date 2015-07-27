package com.pixelmonmod.pixelutilities;

import com.pixelmonmod.pixelutilities.blocks.BlockDatabase;
import com.pixelmonmod.pixelutilities.blocks.GenericRotatableBlock;
import com.pixelmonmod.pixelutilities.items.ItemDatabase;
import com.pixelmonmod.pixelutilities.models.ModelDatabase;
import com.pixelmonmod.pixelutilities.textures.TextureDatabase;
import nova.core.block.BlockManager;
import nova.core.item.ItemManager;
import nova.core.loader.Loadable;
import nova.core.loader.NovaMod;
import nova.core.network.NetworkManager;
import nova.core.network.NetworkTarget;
import nova.core.recipes.RecipeManager;
import nova.core.render.RenderManager;

@NovaMod(name = PixelUtilities.MODNAME, id = PixelUtilities.MODID, version = PixelUtilities.MODVERSION, novaVersion = "0.0.1")
public class PixelUtilities implements Loadable {

    /***
     * TODO
     * WorldGen
     * Tile entities (yay for missing tcn files!)
     * armor
     * pixelboy + radio..
     * that god dam conveyer belt thing
     * fix window rendering
     * pokedolls textures
     */

    static PixelUtilities INSTANCE;

    public static final String MODID = "pixelutilities";
    public static final String MODNAME = "pixelutilities";
    public static final String MODVERSION = "3.3.8";

    private final ItemManager itemManager;
    private final BlockManager blockManager;
    private final RenderManager renderManager;
    private final RecipeManager recipeManager;
    private final NetworkManager networkManager;
    private TextureDatabase textureDatabase;
    private ItemDatabase itemDatabase;
    private BlockDatabase blockDatabase;
    private ModelDatabase modelDatabase;

    public PixelUtilities(ItemManager itemManager, BlockManager blockManager, RenderManager renderManager, RecipeManager recipeManager, NetworkManager networkManager) {
        INSTANCE = this;
        this.itemManager = itemManager;
        this.blockManager = blockManager;
        this.renderManager = renderManager;
        this.recipeManager = recipeManager;
        this.networkManager = networkManager;
    }

    @Override
    public void preInit() {
        this.textureDatabase = new TextureDatabase(renderManager);
        this.itemDatabase = new ItemDatabase(itemManager);
        this.blockDatabase = new BlockDatabase(blockManager);
        this.modelDatabase = new ModelDatabase(renderManager);
    }

    public static NetworkTarget.Side getSide() {
        return INSTANCE.networkManager.getSide();
    }

    public static void syncNetwork(Object sender) {
        INSTANCE.networkManager.sync(sender);
    }
}
