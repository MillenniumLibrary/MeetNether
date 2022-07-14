package millenniumlibrary.tt432.meetnether.screen.reg;

import millenniumlibrary.tt432.meetnether.menu.reg.ModMenus;
import millenniumlibrary.tt432.meetnether.screen.TalkingScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * @author DustW
 **/
@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GuiRegistry {
    @SubscribeEvent
    public static void init(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(ModMenus.TALKING.get(), TalkingScreen::new);
        });
    }
}
