package com.projoh.block;

import com.projoh.ProgressionOverhaul;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //special blocks - do for blocks without item(crops, etc)

    public static final Block STRAWBERRY_BUSH = RegisterSpecialBlock("strawberry_bush",
            new StrawberryBushBlock(FabricBlockSettings.copyOf(Blocks.SWEET_BERRY_BUSH)));

    public static Block RegisterSpecialBlock(String name, Block block){
        return Registry.register(Registries.BLOCK, new Identifier(ProgressionOverhaul.MODID, name), block);
    }
    //regular

    private static Block RegisterBlock(String name, Block block){
        RegisterBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier(ProgressionOverhaul.MODID, name), block);
    }
    private static Item RegisterBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(ProgressionOverhaul.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
}
