package com.pixelmonmod.pixelutilities.blocks;

import com.pixelmonmod.pixelutilities.PixelUtilities;
import nova.core.block.Block;
import nova.core.block.Stateful;
import nova.core.block.component.RotatedRenderer;
import nova.core.component.Category;
import nova.core.component.misc.Collider;
import nova.core.component.renderer.ItemRenderer;
import nova.core.component.transform.Orientation;
import nova.core.network.Sync;
import nova.core.network.Syncable;
import nova.core.render.texture.BlockTexture;
import nova.core.retention.Storable;
import nova.core.retention.Store;

/**
 * Created by clienthax on 27/7/2015.
 */
public class GenericRotatableBlock extends Block implements Stateful, Syncable, Storable {

    public String id;
//TODO fix this..
    @Sync
    @Store
    private Orientation orientation = add(new Orientation(this).hookBasedOnEntity());

    public GenericRotatableBlock(String id, BlockTexture texture) {
        this.id = id;
        add(new RotatedRenderer(this)).setTexture(texture);
        add(new Collider(this));
        add(new ItemRenderer(this));
        events.on(Orientation.OrientationChangeEvent.class).bind(this::onOrientationChange);
    }

    public GenericRotatableBlock(String id, BlockTexture texture, String creativeTab) {
        this(id, texture);
        add(new Category(creativeTab));
    }

    private void onOrientationChange(Orientation.OrientationChangeEvent orientationChangeEvent) {
        if(PixelUtilities.getSide().isServer()) {
            PixelUtilities.syncNetwork(this);
        }
    }

    @Override
    public String getID() {
        return id;
    }

}
