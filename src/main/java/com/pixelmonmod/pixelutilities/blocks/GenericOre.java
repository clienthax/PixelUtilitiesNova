package com.pixelmonmod.pixelutilities.blocks;

import nova.core.item.Item;
import nova.core.item.ItemFactory;
import nova.core.render.texture.BlockTexture;

import java.util.HashSet;

/**
 * Created by clienthax on 27/7/2015.
 */
public class GenericOre extends GenericBlock {

    Item item;

    public GenericOre(String id, BlockTexture texture, ItemFactory itemToDrop, int amountToDrop) {
        super(id, texture);
        setup(itemToDrop, amountToDrop);
    }

    public GenericOre(String id, BlockTexture texture, String creativeTab, ItemFactory itemToDrop, int amountToDrop) {
        super(id, texture, creativeTab);
        setup(itemToDrop, amountToDrop);
    }

    private void setup(ItemFactory itemToDrop, int amountToDrop) {
        events.on(DropEvent.class).bind(this::onDropEvent);//TODO this needs to be a break event with a pickaxe ~
        item = itemToDrop.makeItem().setCount(amountToDrop);
    }

    public void onDropEvent(DropEvent event) {
        event.drops = new HashSet<>();
        event.drops.add(item);
    }

    @Override
    public double getHardness() {//1/2 of the mc base value, so when porting we have to double
        return 8;
    }

}
