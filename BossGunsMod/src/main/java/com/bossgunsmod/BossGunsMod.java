package com.bossgunsmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraft.item.Item;

@Mod("bossgunsmod")
@EventBusSubscriber(modid = "bossgunsmod", bus = EventBusSubscriber.Bus.MOD)
public class BossGunsMod {
    public static final String MODID = "bossgunsmod";

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        ModItems.registerAll(event);
    }
}