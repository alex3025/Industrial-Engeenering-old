package com.industrialengeenering.core;

import com.industrialengeenering.block.Blocks;
import com.industrialengeenering.utils.LiquidUtils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


public class ModCreativeTab extends CreativeTabs {
	public static CreativeTabs IndEngBlocks = new ModCreativeTab(CreativeTabs.getNextID(), "Industrial Engeenering - Blocks");
	public static CreativeTabs IndEngLiquids = new ModCreativeTab(CreativeTabs.getNextID(), "Industrial Engeenering - Liquids");

	private String name;

	public ModCreativeTab(int par1, String par2Str) {
		super(par1, par2Str);
		this.name = par2Str;
	}

	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		if (this.name == IndEngBlocks.getTabLabel()) {
			return new ItemStack(Blocks.blockOsmoGen.blockID, 1, 0);
		} else if (this.name == IndEngLiquids.getTabLabel()) {
			return new ItemStack(LiquidUtils.items.get(0).itemID, 1, 0);
		}

		return null;
	}

	public String getTranslatedTabLabel() {
		return this.name;
	}
}
