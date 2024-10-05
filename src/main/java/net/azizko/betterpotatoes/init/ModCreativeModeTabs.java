package net.azizko.betterpotatoes.init;

import net.azizko.betterpotatoes.BetterPotatoes;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterPotatoes.MODID);

    public static final RegistryObject<CreativeModeTab> BETTERPOTATOES_TAB = CREATIVE_MODE_TABS.register("betterpotatoes_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.FRIES.get()))
                    .title(Component.translatable("creativetab.betterpotatoes.betterpotatoes_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_FRY.get());
                        output.accept(ModItems.FRY.get());
                        output.accept(ModItems.FRIES.get());

                        output.accept(ModItems.RAW_CRISP.get());
                        output.accept(ModItems.CRISP.get());
                        output.accept(ModItems.CRISPS.get());
                    })
                    .build()
            );

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
