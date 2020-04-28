package com.elspar2.fantasymod.tabs;

import com.elspar2.fantasymod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FantasyTab extends CreativeTabs
{
	public FantasyTab(String label) { super("FantasyTab");}
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.BLACK_OPAL);}
}
