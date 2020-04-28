package com.elspar2.fantasymod.items.jewelry;

import com.elspar2.fantasymod.Main;
import com.elspar2.fantasymod.init.ModItems;
import com.elspar2.fantasymod.util.IHasModel;
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
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class Ring extends Item implements IBauble,IHasModel {
	
	public String gemName;
	public String materialName;

	public Ring(String name, String material, String gem)
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
		return BaubleType.RING;
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

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (itemstack.getItemDamage()==0 && player.ticksExisted%39==0) {
			if (gemName == "amber") {
				player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 80,0,true,true));
			}
			if (gemName == "amethyst") {
				player.addPotionEffect(new PotionEffect(PotionRepair.INSTANCE, 80,0,true,true));
			}
			if (gemName == "angelite") {
				player.addPotionEffect(new PotionEffect(PotionSlowfall.INSTANCE, 80,0,true,true));
			}
			if (gemName == "aquamarine") {
				player.addPotionEffect(new PotionEffect(PotionDrown.INSTANCE, 80,0,true,true));
			}
			if (gemName == "blackOpal") {
				player.addPotionEffect(new PotionEffect(PotionCure.INSTANCE, 80,0,true,true));
			}
			if (gemName == "coral") {
				player.addPotionEffect(new PotionEffect(PotionAntidote.INSTANCE, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionSolidCore.INSTANCE, 80,0,true,true));
			}
			if (gemName == "diamond") {
				player.addPotionEffect(new PotionEffect(PotionDiamondSkin.INSTANCE, 80,1,true,true));
			}
			if (gemName == "emerald") {
				player.addPotionEffect(new PotionEffect(PotionArchery.INSTANCE, 80,1,true,true));
			}
			if (gemName == "garnet") {
				player.addPotionEffect(new PotionEffect(MobEffects.INSTANT_HEALTH, 20,0,true,true));
			}
			if (gemName == "jade") {
				player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 80,1,true,true));
				player.addPotionEffect(new PotionEffect(PotionClimb.INSTANCE, 80,1,true,true));
			}
			if (gemName == "lapis") {
				player.addPotionEffect(new PotionEffect(PotionMagicFocus.INSTANCE, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionMagicShield.INSTANCE, 80,0,true,true));
			}
			if (gemName == "moonstone") {
				player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 1800,0,true,true));
			}
			if (gemName == "obsidian") {
				player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionSolidCore.INSTANCE, 80,0,true,true));
			}
			if (gemName == "onyx") {
				player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 80,0,true,true));
			}
			if (gemName == "opal") {
				player.addPotionEffect(new PotionEffect(PotionBless.INSTANCE, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionPurity.INSTANCE, 80,0,true,true));
			}
			if (gemName == "orangeTopaz") {
				player.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 80,0,true,true));
			}
			if (gemName == "painite") {
				player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 80,1,true,true));
				player.addPotionEffect(new PotionEffect(PotionVulnerable.INSTANCE, 80,1,true,true));
				player.addPotionEffect(new PotionEffect(PotionKlutz.INSTANCE, 80,1,true,true));
			}
			if (gemName == "peridot") {
				player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionAntidote.INSTANCE, 80,0,true,true));
			}
			if (gemName == "ruby") {
				player.addPotionEffect(new PotionEffect(PotionReach.INSTANCE, 80,1,true,true));
			}
			if (gemName == "sapphire") {
				player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionStepup.INSTANCE, 80,1,true,true));
			}
			if (gemName == "taaffeite") {
				player.addPotionEffect(new PotionEffect(MobEffects.SATURATION, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionPurity.INSTANCE, 80,0,true,true));
			}
			if (gemName == "tanzanite") {
				player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 80,0,true,true));
			}
			if (gemName == "turquoise") {
				player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 80,0,true,true));
			}
			if (gemName == "yellowTopaz") {
				player.addPotionEffect(new PotionEffect(PotionIronSkin.INSTANCE, 80,1,true,true));
			}
			//Material
			if (materialName == "steel") {
                if (gemName == "yellowTopaz") {
                    player.addPotionEffect(new PotionEffect (PotionIronSkin.INSTANCE, 80, 2, true, true));
                } else {
                	player.addPotionEffect(new PotionEffect(PotionIronSkin.INSTANCE, 80,0,true,true));
                }
            }
			if (materialName == "silver") {
				player.addPotionEffect(new PotionEffect(PotionPurity.INSTANCE, 80,0,true,true));
			}
			if (materialName == "gold") {
				player.addPotionEffect(new PotionEffect(PotionAntidote.INSTANCE, 80,0,true,true));
			}
			if (materialName == "quicksilver") {
				player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 80,0,true,true));
			}
			if (materialName == "mithril") {
				player.addPotionEffect(new PotionEffect(PotionMagicFocus.INSTANCE, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionMagicShield.INSTANCE, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionSolidCore.INSTANCE, 80,0,true,true));
			}
			if (materialName == "cobalt") {
				player.addPotionEffect(new PotionEffect(PotionSolidCore.INSTANCE, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 80,0,true,true));
			}
			if (materialName == "admantium") {
				player.addPotionEffect(new PotionEffect(PotionRepair.INSTANCE, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionSolidCore.INSTANCE, 80,0,true,true));
			}
			if (materialName == "ebony") {
				player.addPotionEffect(new PotionEffect(PotionMagicInhibition.INSTANCE, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionMagicShield.INSTANCE, 80,0,true,true));
				player.addPotionEffect(new PotionEffect(PotionSolidCore.INSTANCE, 80,0,true,true));
			}
			if (materialName == "divinium") {
				player.addPotionEffect(new PotionEffect(PotionBless.INSTANCE, 80,0,true,true));
			}
			if (materialName == "malovenium") {
				player.addPotionEffect(new PotionEffect(PotionCurse.INSTANCE, 80,0,true,true));
			}
			if (materialName == "chancium") {
				player.addPotionEffect(new PotionEffect(PotionChance.INSTANCE, 80,0,true,true));
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
		if (gemName == "amber") {
			player.removePotionEffect(MobEffects.RESISTANCE);
		}
		if (gemName == "amethyst") {
			player.removePotionEffect(PotionRepair.INSTANCE);
		}
		if (gemName == "angelite") {
			player.removePotionEffect(PotionSlowfall.INSTANCE);
		}
		if (gemName == "aquamarine") {
			player.removePotionEffect(PotionDrown.INSTANCE);
		}
		if (gemName == "blackOpal") {
			player.removePotionEffect(PotionCure.INSTANCE);
		}
		if (gemName == "coral") {
			player.removePotionEffect(PotionAntidote.INSTANCE);
			player.removePotionEffect(PotionSolidCore.INSTANCE);
		}
		if (gemName == "diamond") {
			player.removePotionEffect(PotionDiamondSkin.INSTANCE);
		}
		if (gemName == "emerald") {
			player.removePotionEffect(PotionArchery.INSTANCE);
		}
		if (gemName == "garnet") {
			player.removePotionEffect(MobEffects.INSTANT_HEALTH);
		}
		if (gemName == "jade") {
			player.removePotionEffect(MobEffects.JUMP_BOOST);
			player.removePotionEffect(PotionClimb.INSTANCE);
		}
		if (gemName == "lapis") {
			player.removePotionEffect(PotionMagicFocus.INSTANCE);
			player.removePotionEffect(PotionMagicShield.INSTANCE);
		}
		if (gemName == "moonstone") {
			player.removePotionEffect(MobEffects.NIGHT_VISION);
		}
		if (gemName == "obsidian") {
			player.removePotionEffect(MobEffects.FIRE_RESISTANCE);
			player.removePotionEffect(PotionSolidCore.INSTANCE);
		}
		if (gemName == "onyx") {
			player.removePotionEffect(MobEffects.INVISIBILITY);
		}
		if (gemName == "opal") {
			player.removePotionEffect(PotionBless.INSTANCE);
			player.removePotionEffect(PotionPurity.INSTANCE);
		}
		if (gemName == "orangeTopaz") {
			player.removePotionEffect(MobEffects.LEVITATION);
		}
		if (gemName == "painite") {
			player.removePotionEffect(PotionVulnerable.INSTANCE);
			player.removePotionEffect(PotionKlutz.INSTANCE);
			player.removePotionEffect(MobEffects.STRENGTH);
		}
		if (gemName == "peridot") {
			player.removePotionEffect(MobEffects.SATURATION);
			player.removePotionEffect(PotionAntidote.INSTANCE);
		}
		if (gemName == "ruby") {
			player.removePotionEffect(PotionReach.INSTANCE);
		}
		if (gemName == "sapphire") {
			player.removePotionEffect(MobEffects.SPEED);
			player.removePotionEffect(PotionStepup.INSTANCE);
		}
		if (gemName == "taaffeite") {
			player.removePotionEffect(MobEffects.SATURATION);
			player.removePotionEffect(PotionPurity.INSTANCE);
		}
		if (gemName == "tanzanite") {
			player.removePotionEffect(MobEffects.HASTE);
		}
		if (gemName == "turquoise") {
			player.removePotionEffect(MobEffects.WATER_BREATHING);
		}
		if (gemName == "yellowTopaz") {
			player.removePotionEffect(PotionIronSkin.INSTANCE);
		}
		//Material
		if (materialName == "steel") {
			player.removePotionEffect(PotionIronSkin.INSTANCE);
		}
		if (materialName == "silver") {
			player.removePotionEffect(PotionPurity.INSTANCE);
		}
		if (materialName == "gold") {
			player.removePotionEffect(PotionAntidote.INSTANCE);
		}
		if (materialName == "quicksilver") {
			player.removePotionEffect(MobEffects.HASTE);
			player.removePotionEffect(MobEffects.SPEED);
		}
		if (materialName == "mithril") {
			player.removePotionEffect(PotionMagicFocus.INSTANCE);
			player.removePotionEffect(PotionMagicShield.INSTANCE);
			player.removePotionEffect(PotionSolidCore.INSTANCE);
		}
		if (materialName == "cobalt") {
			player.removePotionEffect(PotionSolidCore.INSTANCE);
			player.removePotionEffect(MobEffects.RESISTANCE);
		}
		if (materialName == "admantium") {
			player.removePotionEffect(PotionSolidCore.INSTANCE);
			player.removePotionEffect(PotionRepair.INSTANCE);
		}
		if (materialName == "ebony") {
			player.removePotionEffect(PotionMagicInhibition.INSTANCE);
			player.removePotionEffect(PotionMagicShield.INSTANCE);
			player.removePotionEffect(PotionSolidCore.INSTANCE);
		}
		if (materialName == "divinium") {
			player.removePotionEffect(PotionBless.INSTANCE);
		}
		if (materialName == "malovenium") {
			player.removePotionEffect(PotionCurse.INSTANCE);
		}
		if (materialName == "chancium") {
			player.removePotionEffect(PotionChance.INSTANCE);
		}
	}
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
