package com.jerielb.additions.item;

import com.jerielb.additions.Additions;
import com.jerielb.additions.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	// tab group for ITEMS
	public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(Additions.MOD_ID, "additional_items"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(Items.CHARCOAL)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additions.additional_items")) // to be changed in /lang/en_us.json
					.entries((displayContext, entries) -> {
						// add items
						entries.add(ModItems.KINGDOM_KEY);
						entries.add(ModItems.JUNGLE_KING);
						entries.add(ModItems.THREE_WISHES);
						entries.add(ModItems.CRAB_CLAW);
						entries.add(ModItems.PUMPKINHEAD);
						entries.add(ModItems.FAIRY_HARP);
						entries.add(ModItems.WISHING_STAR);
						entries.add(ModItems.SPELLBINDER);
						entries.add(ModItems.METAL_CHOCOBO);
						entries.add(ModItems.OLYMPIA);
						entries.add(ModItems.LIONHEART);
						entries.add(ModItems.OATHKEEPER);
						entries.add(ModItems.OBLIVION);
						entries.add(ModItems.LADY_LUCK);
						entries.add(ModItems.DIVINE_ROSE);
						entries.add(ModItems.DIAMOND_DUST);
						entries.add(ModItems.ONE_WINGED_ANGEL);
						entries.add(ModItems.ULTIMA_WEAPON);
						entries.add(ModItems.KINGDOM_KEY_DARKSIDE);
						entries.add(ModItems.SOUL_EATER);
					})
					.build());
	
	// tab group for BLOCKS
	public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(Additions.MOD_ID, "additional_blocks"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(ModBlocks.CHARCOAL_BLOCK)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additions.additional_blocks")) // to be changed in /lang/en_us.json
					.entries((displayContext, entries) -> {
						// add blocks
						entries.add(ModBlocks.CHARCOAL_BLOCK);
						
						entries.add(ModBlocks.RED_SLIME_BLOCK);
						entries.add(ModBlocks.PINK_SLIME_BLOCK);
						entries.add(ModBlocks.MAGENTA_SLIME_BLOCK);
						entries.add(ModBlocks.PURPLE_SLIME_BLOCK);
						entries.add(ModBlocks.BLUE_SLIME_BLOCK);
						entries.add(ModBlocks.LIGHT_BLUE_SLIME_BLOCK);
						entries.add(ModBlocks.CYAN_SLIME_BLOCK);
						entries.add(ModBlocks.GREEN_SLIME_BLOCK);
						entries.add(ModBlocks.YELLOW_SLIME_BLOCK);
						entries.add(ModBlocks.ORANGE_SLIME_BLOCK);
						entries.add(ModBlocks.BROWN_SLIME_BLOCK);
						entries.add(ModBlocks.BLACK_SLIME_BLOCK);
						entries.add(ModBlocks.GRAY_SLIME_BLOCK);
						entries.add(ModBlocks.LIGHT_GRAY_SLIME_BLOCK);
						entries.add(ModBlocks.WHITE_SLIME_BLOCK);
					})
					.build());
	
	// gets called by the Main class onInitialize() method
	public static void registerItemGroups() {
		Additions.LOGGER.info("Registering Item Groups for " + Additions.MOD_ID);
	}
}
