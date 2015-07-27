package com.pixelmonmod.pixelutilities.models;

import com.pixelmonmod.pixelutilities.PixelUtilities;
import nova.core.render.RenderManager;
import nova.core.render.model.ModelProvider;
import nova.core.render.model.TechneModelProvider;

/**
 * Created by clienthax on 27/7/2015.
 */
public class ModelDatabase {

    public static ModelProvider aronDoll;

    public ModelDatabase(RenderManager renderManager) {
        aronDoll = renderManager.registerModel(new TechneModelProvider(PixelUtilities.MODID, "AronDoll"));
    }

}
