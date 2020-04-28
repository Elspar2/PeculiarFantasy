package com.elspar2.fantasymod.util.handlers;

import com.elspar2.fantasymod.entity.EntityCentaur;
import com.elspar2.fantasymod.entity.render.RenderCentaur;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenderers()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class, new IRenderFactory<EntityCentaur>()
				{
			@Override
			public Render<? super EntityCentaur> createRenderFor(RenderManager manager)
			{
				return new RenderCentaur(manager);
			}
				});
	}

}
