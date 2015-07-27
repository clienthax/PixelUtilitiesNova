package com.pixelmonmod.pixelutilities.blocks;

import nova.core.block.Block;
import nova.core.block.component.StaticBlockRenderer;
import nova.core.component.Category;
import nova.core.component.misc.Collider;
import nova.core.component.renderer.ItemRenderer;
import nova.core.render.texture.BlockTexture;

/**
 * Created by clienthax on 27/7/2015.
 */
public class GenericBlock extends Block {

    public String id;

    public GenericBlock(String id, BlockTexture texture) {
        this.id = id;
        add(new StaticBlockRenderer(this)).setTexture(texture);
        add(new Collider(this));
        add(new ItemRenderer(this));
    }

    public GenericBlock(String id, BlockTexture texture, String creativeTab) {
        this(id, texture);
        add(new Category(creativeTab));
    }

    @Override
    public String getID() {
        return id;
    }

}
