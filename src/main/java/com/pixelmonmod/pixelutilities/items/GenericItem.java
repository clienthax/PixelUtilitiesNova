package com.pixelmonmod.pixelutilities.items;

import nova.core.component.Category;
import nova.core.component.renderer.ItemRenderer;
import nova.core.item.Item;
import nova.core.render.texture.ItemTexture;

/**
 * Created by clienthax on 27/7/2015.
 */
public class GenericItem extends Item {

    public String id;

    public GenericItem(String id, ItemTexture texture) {
        this.id = id;
        add(new ItemRenderer()).setTexture(texture);
    }

    public GenericItem(String id, ItemTexture texture, String creativeTab) {
        this(id, texture);
        add(new Category(creativeTab));
    }

    @Override
    public String getID() {
        return id;
    }
}
