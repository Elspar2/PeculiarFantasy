package com.elspar2.fantasymod.items.food;

import com.elspar2.fantasymod.Main;
import com.elspar2.fantasymod.init.ModItems;
import com.elspar2.fantasymod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel
{

	public FoodBase(String name, int amount, float saturation, boolean isAnimalFood)
	{
		super(amount, saturation, isAnimalFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.FantasyTab);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	
}
