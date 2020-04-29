package com.elspar2.fantasymod.items.jewelry;

import com.elspar2.fantasymod.Main;
import com.elspar2.fantasymod.init.ModItems;
import com.elspar2.fantasymod.util.IHasModel;
import com.elspar2.fantasymod.util.handlers.ConfigHandler;
import com.tmtravlr.potioncore.potion.*;

import baubles.api.BaubleType;
import baubles.api.BaublesApi;
import baubles.api.IBauble;
import baubles.api.cap.IBaublesItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Amulet extends Item implements IBauble,IHasModel {
	
	public String gemName;
	public String materialName;

	public Amulet(String name, String material, String gem)
	{
		super();
		setMaxStackSize(1);
		setHasSubtypes(true);
		setMaxDamage(0);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.FantasyTab);
		
		gemName = gem;
		materialName = material;
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.AMULET;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		if(!world.isRemote) { 
			IBaublesItemHandler baubles = BaublesApi.getBaublesHandler(player);
			for(int i = 0; i < baubles.getSlots(); i++) 
				if((baubles.getStackInSlot(i) == null || baubles.getStackInSlot(i).isEmpty()) && baubles.isItemValidForSlot(i, player.getHeldItem(hand), player)) {
					baubles.setStackInSlot(i, player.getHeldItem(hand).copy());
					if(!player.capabilities.isCreativeMode){
						player.inventory.setInventorySlotContents(player.inventory.currentItem, ItemStack.EMPTY);
					}
					onEquipped(player.getHeldItem(hand), player);
					break;
				}
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
	}

	public PotionEffect GetPotionFromString(String effect, int strength) {
		switch (effect) {
			case "RESISTANCE":
				return new PotionEffect(MobEffects.RESISTANCE, 80,strength,true,true);
			case "FIRE_RESISTANCE":
				return new PotionEffect(MobEffects.FIRE_RESISTANCE, 80,strength,true,true);
			case "INSTANT_HEALTH":
				return new PotionEffect(MobEffects.INSTANT_HEALTH, 80,strength,true,true);
			case "JUMP_BOOST":
				return new PotionEffect(MobEffects.JUMP_BOOST, 80,strength,true,true);
			case "NIGHT_VISION":
				return new PotionEffect(MobEffects.NIGHT_VISION, 80,strength,true,true);
			case "INVISIBILITY":
				return new PotionEffect(MobEffects.INVISIBILITY, 80,strength,true,true);
			case "LEVITATION":
				return new PotionEffect(MobEffects.LEVITATION, 80,strength,true,true);
			case "STRENGTH":
				return new PotionEffect(MobEffects.STRENGTH, 80,strength,true,true);
			case "SATURATION":
				return new PotionEffect(MobEffects.SATURATION, 80,strength,true,true);
			case "SPEED":
				return new PotionEffect(MobEffects.SPEED, 80,strength,true,true);
			case "HASTE":
				return new PotionEffect(MobEffects.HASTE, 80,strength,true,true);
			case "WATER_BREATHING":
				return new PotionEffect(MobEffects.WATER_BREATHING, 80,strength,true,true);
				
			case "PotionRepair":
				return new PotionEffect(PotionRepair.INSTANCE, 80,strength,true,true);
			case "PotionSlowfall":
				return new PotionEffect(PotionSlowfall.INSTANCE, 80,strength,true,true);
			case "PotionDrown":
				return new PotionEffect(PotionDrown.INSTANCE, 80,strength,true,true);
			case "PotionCure":
				return new PotionEffect(PotionCure.INSTANCE, 80,strength,true,true);
			case "PotionAntidote":
				return new PotionEffect(PotionAntidote.INSTANCE, 80,strength,true,true);
			case "PotionSolidCore":
				return new PotionEffect(PotionSolidCore.INSTANCE, 80,strength,true,true);
			case "PotionDiamondSkin":
				return new PotionEffect(PotionDiamondSkin.INSTANCE, 80,strength,true,true);
			case "PotionArchery":
				return new PotionEffect(PotionArchery.INSTANCE, 80,strength,true,true);
			case "PotionClimb":
				return new PotionEffect(PotionClimb.INSTANCE, 80,strength,true,true);
			case "PotionMagicFocus":
				return new PotionEffect(PotionMagicFocus.INSTANCE, 80,strength,true,true);
			case "PotionMagicShield":
				return new PotionEffect(PotionMagicShield.INSTANCE, 80,strength,true,true);
			case "PotionBless":
				return new PotionEffect(PotionBless.INSTANCE, 80,strength,true,true);
			case "PotionPurity":
				return new PotionEffect(PotionPurity.INSTANCE, 80,strength,true,true);
			case "PotionVulnerable":
				return new PotionEffect(PotionVulnerable.INSTANCE, 80,strength,true,true);
			case "PotionKlutz":
				return new PotionEffect(PotionKlutz.INSTANCE, 80,strength,true,true);
			case "PotionReach":
				return new PotionEffect(PotionReach.INSTANCE, 80,strength,true,true);
			case "PotionStepup":
				return new PotionEffect(PotionStepup.INSTANCE, 80,strength,true,true);
			case "PotionIronSkin":
				return new PotionEffect(PotionIronSkin.INSTANCE, 80,strength,true,true);
			case "PotionMagicInhibition":
				return new PotionEffect(PotionMagicInhibition.INSTANCE, 80,strength,true,true);
			case "PotionCurse":
				return new PotionEffect(PotionCurse.INSTANCE, 80,strength,true,true);
			case "PotionChance":
				return new PotionEffect(PotionChance.INSTANCE, 80,strength,true,true);
		}
		return null;
	}
	
	public Potion GetRemovablePotionFromString(String effect) {
		switch (effect) {
			case "RESISTANCE":
				return MobEffects.RESISTANCE;
			case "FIRE_RESISTANCE":
				return MobEffects.FIRE_RESISTANCE;
			case "INSTANT_HEALTH":
				return MobEffects.INSTANT_HEALTH;
			case "JUMP_BOOST":
				return MobEffects.JUMP_BOOST;
			case "NIGHT_VISION":
				return MobEffects.NIGHT_VISION;
			case "INVISIBILITY":
				return MobEffects.INVISIBILITY;
			case "LEVITATION":
				return MobEffects.LEVITATION;
			case "STRENGTH":
				return MobEffects.STRENGTH;
			case "SATURATION":
				return MobEffects.SATURATION;
			case "SPEED":
				return MobEffects.SPEED;
			case "HASTE":
				return MobEffects.HASTE;
			case "WATER_BREATHING":
				return MobEffects.WATER_BREATHING;
				
			case "PotionRepair":
				return PotionRepair.INSTANCE;
			case "PotionSlowfall":
				return PotionSlowfall.INSTANCE;
			case "PotionDrown":
				return PotionDrown.INSTANCE;
			case "PotionCure":
				return PotionCure.INSTANCE;
			case "PotionAntidote":
				return PotionAntidote.INSTANCE;
			case "PotionSolidCore":
				return PotionSolidCore.INSTANCE;
			case "PotionDiamondSkin":
				return PotionDiamondSkin.INSTANCE;
			case "PotionArchery":
				return PotionArchery.INSTANCE;
			case "PotionClimb":
				return PotionClimb.INSTANCE;
			case "PotionMagicFocus":
				return PotionMagicFocus.INSTANCE;
			case "PotionMagicShield":
				return PotionMagicShield.INSTANCE;
			case "PotionBless":
				return PotionBless.INSTANCE;
			case "PotionPurity":
				return PotionPurity.INSTANCE;
			case "PotionVulnerable":
				return PotionVulnerable.INSTANCE;
			case "PotionKlutz":
				return PotionKlutz.INSTANCE;
			case "PotionReach":
				return PotionReach.INSTANCE;
			case "PotionStepup":
				return PotionStepup.INSTANCE;
			case "PotionIronSkin":
				return PotionIronSkin.INSTANCE;
			case "PotionMagicInhibition":
				return PotionMagicInhibition.INSTANCE;
			case "PotionCurse":
				return PotionCurse.INSTANCE;
			case "PotionChance":
				return PotionChance.INSTANCE;
		}
		return null;
	}
	
	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (itemstack.getItemDamage()==0 && player.ticksExisted%39==0) {
			switch (gemName) {
				case "amber":
					if (GetPotionFromString(ConfigHandler.AMBER_EFFECT, ConfigHandler.AMBER_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.AMBER_EFFECT, ConfigHandler.AMBER_STRENGTH)); 
					}
					break;
				case "amethyst":
					if (GetPotionFromString(ConfigHandler.AMETHYST_EFFECT, ConfigHandler.AMETHYST_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.AMETHYST_EFFECT, ConfigHandler.AMETHYST_STRENGTH));
					}
					break;
				case "angelite":
					if (GetPotionFromString(ConfigHandler.ANGELITE_EFFECT, ConfigHandler.ANGELITE_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.ANGELITE_EFFECT, ConfigHandler.ANGELITE_STRENGTH));
					}
					break;
				case "aquamarine":
					if (GetPotionFromString(ConfigHandler.AQUAMARINE_EFFECT, ConfigHandler.AQUAMARINE_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.AQUAMARINE_EFFECT, ConfigHandler.AQUAMARINE_STRENGTH));
					}
					break;
				case "blackOpal":
					if (GetPotionFromString(ConfigHandler.BLACK_OPAL_EFFECT, ConfigHandler.BLACK_OPAL_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.BLACK_OPAL_EFFECT, ConfigHandler.BLACK_OPAL_STRENGTH));
					}
					break;
				case "coral":
					if (GetPotionFromString(ConfigHandler.CORAL_EFFECT, ConfigHandler.CORAL_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.CORAL_EFFECT, ConfigHandler.CORAL_STRENGTH));
					}
					break;
				case "diamond":
					if (GetPotionFromString(ConfigHandler.DIAMOND_EFFECT, ConfigHandler.DIAMOND_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.DIAMOND_EFFECT, ConfigHandler.DIAMOND_STRENGTH));
					}
					break;
				case "emerald":
					if (GetPotionFromString(ConfigHandler.EMERALD_EFFECT, ConfigHandler.EMERALD_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.EMERALD_EFFECT, ConfigHandler.EMERALD_STRENGTH));
					}
					break;
				case "garnet":
					if (GetPotionFromString(ConfigHandler.GARNET_EFFECT, ConfigHandler.GARNET_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.GARNET_EFFECT, ConfigHandler.GARNET_STRENGTH));
					}
					break;
				case "jade":
					if (GetPotionFromString(ConfigHandler.JADE_EFFECT, ConfigHandler.JADE_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.JADE_EFFECT, ConfigHandler.JADE_STRENGTH));
					}
					break;
				case "lapis":
					if (GetPotionFromString(ConfigHandler.LAPIS_EFFECT, ConfigHandler.LAPIS_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.LAPIS_EFFECT, ConfigHandler.LAPIS_STRENGTH));
					}
					break;
				case "moonstone":
					if (GetPotionFromString(ConfigHandler.MOONSTONE_EFFECT, ConfigHandler.MOONSTONE_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.MOONSTONE_EFFECT, ConfigHandler.MOONSTONE_STRENGTH));
					}
					break;
				case "obsidian":
					if (GetPotionFromString(ConfigHandler.OBSIDIAN_EFFECT, ConfigHandler.OBSIDIAN_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.OBSIDIAN_EFFECT, ConfigHandler.OBSIDIAN_STRENGTH));
					}
					break;
				case "onyx":
					if (GetPotionFromString(ConfigHandler.ONYX_EFFECT, ConfigHandler.ONYX_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.ONYX_EFFECT, ConfigHandler.ONYX_STRENGTH));
					}
					break;
				case "opal":
					if (GetPotionFromString(ConfigHandler.OPAL_EFFECT, ConfigHandler.OPAL_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.OPAL_EFFECT, ConfigHandler.OPAL_STRENGTH));
					}
					break;
				case "orangeTopaz":
					if (GetPotionFromString(ConfigHandler.ORANGE_TOPAZ_EFFECT, ConfigHandler.ORANGE_TOPAZ_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.ORANGE_TOPAZ_EFFECT, ConfigHandler.ORANGE_TOPAZ_STRENGTH));
					}
					break;
				case "painite":
					if (GetPotionFromString(ConfigHandler.PAINITE_EFFECT, ConfigHandler.PAINITE_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.PAINITE_EFFECT, ConfigHandler.PAINITE_STRENGTH));
					}
					break;
				case "peridot":
					if (GetPotionFromString(ConfigHandler.PERIDOT_EFFECT, ConfigHandler.PERIDOT_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.PERIDOT_EFFECT, ConfigHandler.PERIDOT_STRENGTH));
					}
					break;
				case "ruby":
					if (GetPotionFromString(ConfigHandler.RUBY_EFFECT, ConfigHandler.RUBY_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.RUBY_EFFECT, ConfigHandler.RUBY_STRENGTH));
					}
					break;
				case "sapphire":
					if (GetPotionFromString(ConfigHandler.SAPPHIRE_EFFECT, ConfigHandler.SAPPHIRE_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.SAPPHIRE_EFFECT, ConfigHandler.SAPPHIRE_STRENGTH));
					}
					break;
				case "taaffeite":
					if (GetPotionFromString(ConfigHandler.TAAFFEITE_EFFECT, ConfigHandler.TAAFFEITE_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.TAAFFEITE_EFFECT, ConfigHandler.TAAFFEITE_STRENGTH));
					}
					break;
				case "tanzanite":
					if (GetPotionFromString(ConfigHandler.TANZANITE_EFFECT, ConfigHandler.TANZANITE_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.TANZANITE_EFFECT, ConfigHandler.TANZANITE_STRENGTH));
					}
					break;
				case "turquoise":
					if (GetPotionFromString(ConfigHandler.TURQUOISE_EFFECT, ConfigHandler.TURQUOISE_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.TURQUOISE_EFFECT, ConfigHandler.TURQUOISE_STRENGTH));
					}
					break;
				case "yellowTopaz":
					if (GetPotionFromString(ConfigHandler.YELLOW_TOPAZ_EFFECT, ConfigHandler.YELLOW_TOPAZ_STRENGTH) != null) {
						player.addPotionEffect(GetPotionFromString(ConfigHandler.YELLOW_TOPAZ_EFFECT, ConfigHandler.YELLOW_TOPAZ_STRENGTH));
					}
					break;
			}
		switch (materialName) {
			case "steel":
				if (GetPotionFromString(ConfigHandler.STEEL_EFFECT, ConfigHandler.STEEL_STRENGTH) != null) {
					player.addPotionEffect(GetPotionFromString(ConfigHandler.STEEL_EFFECT, ConfigHandler.STEEL_STRENGTH));
				}
				break;
			case "silver":
				if (GetPotionFromString(ConfigHandler.SILVER_EFFECT, ConfigHandler.SILVER_STRENGTH) != null) {
					player.addPotionEffect(GetPotionFromString(ConfigHandler.SILVER_EFFECT, ConfigHandler.SILVER_STRENGTH));
				}
				break;
			case "gold":
				if (GetPotionFromString(ConfigHandler.GOLD_EFFECT, ConfigHandler.GOLD_STRENGTH) != null) {
					player.addPotionEffect(GetPotionFromString(ConfigHandler.GOLD_EFFECT, ConfigHandler.GOLD_STRENGTH));
				}
				break;
			case "quicksilver":
				if (GetPotionFromString(ConfigHandler.QUICKSILVER_EFFECT, ConfigHandler.QUICKSILVER_STRENGTH) != null) {
					player.addPotionEffect(GetPotionFromString(ConfigHandler.QUICKSILVER_EFFECT, ConfigHandler.QUICKSILVER_STRENGTH));
				}
				break;
			case "mithril":
				if (GetPotionFromString(ConfigHandler.MITHRIL_EFFECT, ConfigHandler.MITHRIL_STRENGTH) != null) {
					player.addPotionEffect(GetPotionFromString(ConfigHandler.MITHRIL_EFFECT, ConfigHandler.MITHRIL_STRENGTH));
				}
				break;
			case "cobalt":
				if (GetPotionFromString(ConfigHandler.COBALT_EFFECT, ConfigHandler.COBALT_STRENGTH) != null) {
					player.addPotionEffect(GetPotionFromString(ConfigHandler.COBALT_EFFECT, ConfigHandler.COBALT_STRENGTH));
				}
				break;
			case "admantium":
				if (GetPotionFromString(ConfigHandler.ADMANTIUM_EFFECT, ConfigHandler.ADMANTIUM_STRENGTH) != null) {
					player.addPotionEffect(GetPotionFromString(ConfigHandler.ADMANTIUM_EFFECT, ConfigHandler.ADMANTIUM_STRENGTH));
				}
				break;
			case "ebony":
				if (GetPotionFromString(ConfigHandler.EBONY_EFFECT, ConfigHandler.EBONY_STRENGTH) != null) {
					player.addPotionEffect(GetPotionFromString(ConfigHandler.EBONY_EFFECT, ConfigHandler.EBONY_STRENGTH));
				}
				break;
			case "divinium":
				if (GetPotionFromString(ConfigHandler.DIVINIUM_EFFECT, ConfigHandler.DIVINIUM_STRENGTH) != null) {
					player.addPotionEffect(GetPotionFromString(ConfigHandler.DIVINIUM_EFFECT, ConfigHandler.DIVINIUM_STRENGTH));
				}
				break;
			case "malovenium":
				if (GetPotionFromString(ConfigHandler.MALOVENIUM_EFFECT, ConfigHandler.MALOVENIUM_STRENGTH) != null) {
					player.addPotionEffect(GetPotionFromString(ConfigHandler.MALOVENIUM_EFFECT, ConfigHandler.MALOVENIUM_STRENGTH));
				}
				break;
			case "chancium":
				if (GetPotionFromString(ConfigHandler.CHANCIUM_EFFECT, ConfigHandler.CHANCIUM_STRENGTH) != null) {
					player.addPotionEffect(GetPotionFromString(ConfigHandler.CHANCIUM_EFFECT, ConfigHandler.CHANCIUM_STRENGTH));
				}
				break;
		}
			
		}
	}

	@Override
	public boolean hasEffect(ItemStack par1ItemStack) {
		return false;
	}

	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.RARE;
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack)
	{
		return super.getUnlocalizedName() + "." + par1ItemStack.getItemDamage();
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
		player.playSound(SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, .75F, 1.9f);
	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		player.playSound(SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, .75F, 2f);
		switch (gemName) {
			case "amber":
				if (GetPotionFromString(ConfigHandler.AMBER_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.AMBER_EFFECT));
				}
				break;
			case "amethyst":
				if (GetPotionFromString(ConfigHandler.AMETHYST_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.AMETHYST_EFFECT));
				}
				break;
			case "angelite":
				if (GetPotionFromString(ConfigHandler.ANGELITE_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.ANGELITE_EFFECT));
				}
				break;
			case "aquamarine":
				if (GetPotionFromString(ConfigHandler.AQUAMARINE_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.AQUAMARINE_EFFECT));
				}
				break;
			case "blackOpal":
				if (GetPotionFromString(ConfigHandler.BLACK_OPAL_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.BLACK_OPAL_EFFECT));
				}
				break;
			case "coral":
				if (GetPotionFromString(ConfigHandler.CORAL_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.CORAL_EFFECT));
				}
				break;
			case "diamond":
				if (GetPotionFromString(ConfigHandler.DIAMOND_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.DIAMOND_EFFECT));
				}
				break;
			case "emerald":
				if (GetPotionFromString(ConfigHandler.EMERALD_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.EMERALD_EFFECT));
				}
				break;
			case "garnet":
				if (GetPotionFromString(ConfigHandler.GARNET_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.GARNET_EFFECT));
				}
				break;
			case "jade":
				if (GetPotionFromString(ConfigHandler.JADE_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.JADE_EFFECT));
				}
				break;
			case "lapis":
				if (GetPotionFromString(ConfigHandler.LAPIS_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.LAPIS_EFFECT));
				}
				break;
			case "moonstone":
				if (GetPotionFromString(ConfigHandler.MOONSTONE_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.MOONSTONE_EFFECT));
				}
				break;
			case "obsidian":
				if (GetPotionFromString(ConfigHandler.OBSIDIAN_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.OBSIDIAN_EFFECT));
				}
				break;
			case "onyx":
				if (GetPotionFromString(ConfigHandler.ONYX_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.ONYX_EFFECT));
				}
				break;
			case "opal":
				if (GetPotionFromString(ConfigHandler.OPAL_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.OPAL_EFFECT));
				}
				break;
			case "orangeTopaz":
				if (GetPotionFromString(ConfigHandler.ORANGE_TOPAZ_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.ORANGE_TOPAZ_EFFECT));
				}
				break;
			case "painite":
				if (GetPotionFromString(ConfigHandler.PAINITE_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.PAINITE_EFFECT));
				}
				break;
			case "peridot":
				if (GetPotionFromString(ConfigHandler.PERIDOT_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.PERIDOT_EFFECT));
				}
				break;
			case "ruby":
				if (GetPotionFromString(ConfigHandler.RUBY_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.RUBY_EFFECT));
				}
				break;
			case "sapphire":
				if (GetPotionFromString(ConfigHandler.SAPPHIRE_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.SAPPHIRE_EFFECT));
				}
				break;
			case "taaffeite":
				if (GetPotionFromString(ConfigHandler.TAAFFEITE_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.TAAFFEITE_EFFECT));
				}
				break;
			case "tanzanite":
				if (GetPotionFromString(ConfigHandler.TANZANITE_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.TANZANITE_EFFECT));
				}
				break;
			case "turquoise":
				if (GetPotionFromString(ConfigHandler.TURQUOISE_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.TURQUOISE_EFFECT));
				}
				break;
			case "yellowTopaz":
				if (GetPotionFromString(ConfigHandler.YELLOW_TOPAZ_EFFECT, 0) != null) {
					player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.YELLOW_TOPAZ_EFFECT));
				}
				break;
	}
	switch (materialName) {
		case "steel":
			if (GetPotionFromString(ConfigHandler.STEEL_EFFECT, 0) != null) {
				player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.STEEL_EFFECT));
			}
			break;
		case "silver":
			if (GetPotionFromString(ConfigHandler.SILVER_EFFECT, 0) != null) {
				player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.SILVER_EFFECT));
			}
			break;
		case "gold":
			if (GetPotionFromString(ConfigHandler.GOLD_EFFECT, 0) != null) {
				player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.GOLD_EFFECT));
			}
			break;
		case "quicksilver":
			if (GetPotionFromString(ConfigHandler.QUICKSILVER_EFFECT, 0) != null) {
				player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.QUICKSILVER_EFFECT));
			}
			break;
		case "mithril":
			if (GetPotionFromString(ConfigHandler.MITHRIL_EFFECT, 0) != null) {
				player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.MITHRIL_EFFECT));
			}
			break;
		case "cobalt":
			if (GetPotionFromString(ConfigHandler.COBALT_EFFECT, 0) != null) {
				player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.COBALT_EFFECT));
			}
			break;
		case "admantium":
			if (GetPotionFromString(ConfigHandler.ADMANTIUM_EFFECT, 0) != null) {
				player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.ADMANTIUM_EFFECT));
			}
			break;
		case "ebony":
			if (GetPotionFromString(ConfigHandler.EBONY_EFFECT, 0) != null) {
				player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.EBONY_EFFECT));
			}
			break;
		case "divinium":
			if (GetPotionFromString(ConfigHandler.DIVINIUM_EFFECT, 0) != null) {
				player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.DIVINIUM_EFFECT));
			}
			break;
		case "malovenium":
			if (GetPotionFromString(ConfigHandler.MALOVENIUM_EFFECT, 0) != null) {
				player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.MALOVENIUM_EFFECT));
			}
			break;
		case "chancium":
			if (GetPotionFromString(ConfigHandler.CHANCIUM_EFFECT, 0) != null) {
				player.removePotionEffect(GetRemovablePotionFromString(ConfigHandler.CHANCIUM_EFFECT));
			}
			break;
		}
	}
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
