package com.pixelmonmod.pixelutilities.blocks;

import com.pixelmonmod.pixelutilities.models.ModelDatabase;
import com.pixelmonmod.pixelutilities.textures.TextureDatabase;
import nova.core.block.Block;
import nova.core.component.Category;
import nova.core.component.misc.Collider;
import nova.core.component.renderer.ItemRenderer;
import nova.core.component.renderer.StaticRenderer;
import nova.core.render.model.Model;

/**
 * Created by clienthax on 27/7/2015.
 */
public class PokeDoll extends Block {

    public PokeDoll() {
        add(new Collider(this).isOpaqueCube(false));
        add(new StaticRenderer(this).setOnRender(model -> {
            Model dollModel = ModelDatabase.aronDoll.getModel();
            model.children.add(dollModel);
            model.bindAll(TextureDatabase.aronDollModel);
        }));
        add(new ItemRenderer(this));//TODO change to the hand items
        add(new Category("pokedolls"));
    }

    @Override
    public String getID() {
        return "pokedoll";
    }
}
