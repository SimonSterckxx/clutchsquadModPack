package net.clutchsquad.clutchsquadmod.item;

import net.clutchsquad.clutchsquadmod.ClutchSquadMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ClutchSquadMod.MOD_ID, bus =  Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public  static CreativeModeTab CLUTCHSQUAD_TAB;

    @SubscribeEvent
    public  static void  registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        CLUTCHSQUAD_TAB = event.registerCreativeModeTab(new ResourceLocation(ClutchSquadMod.MOD_ID, "clutchsquad_tab"), builder -> builder.icon(() -> new ItemStack(ModItems.BLACK_OPAL.get())).title(Component.translatable("creativemodetab.clutchsquad_tab")));
    }
}
