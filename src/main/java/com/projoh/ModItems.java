package com.projoh;

import com.projoh.food.FoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Strawberry = new Item(new FabricItemSettings().food(FoodComponents.STRAWBERRY));

    public static void registerItems() {
        Registry.register(Registries.ITEM, new Identifier(ProgressOverhaul.MODID, "strawberry"), Strawberry);
    }
}
