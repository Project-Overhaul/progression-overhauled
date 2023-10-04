package com.projoh.item;

import com.projoh.ProgressOverhaul;
import com.projoh.block.ModBlocks;
import com.projoh.food.FoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STRAWBERRY = registerItem("strawberry",
            new AliasedBlockItem(ModBlocks.STRAWBERRY_BUSH ,new FabricItemSettings().food(FoodComponents.STRAWBERRY)));

    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM, new Identifier(ProgressOverhaul.MODID,name),item);
    }


    private static void addItemToItemGroup(FabricItemGroupEntries entries){
        entries.add(STRAWBERRY);
    }

    public static void registerItems() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToItemGroup);
    }
}
