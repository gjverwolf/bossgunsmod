package com.bossgunsmod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;

public class ModItems {
    public static final Item BLASTER = new GunItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT)).setRegistryName("bossgunsmod", "blaster");
    public static final Item ROCKET_LAUNCHER = new GunItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT)).setRegistryName("bossgunsmod", "rocket_launcher");
    public static final Item SNIPER_BEAM = new GunItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT)).setRegistryName("bossgunsmod", "sniper_beam");
    public static final Item FLAMETHROWER = new GunItem(new Item.Properties().tab(ItemGroup.TAB_COMBAT)).setRegistryName("bossgunsmod", "flamethrower");

    public static void registerAll(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
            BLASTER,
            ROCKET_LAUNCHER,
            SNIPER_BEAM,
            FLAMETHROWER
        );
    }
}