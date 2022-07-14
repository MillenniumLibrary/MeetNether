package millenniumlibrary.tt432.meetnether.client.entity.renderer.reg;

import millenniumlibrary.tt432.meetnether.client.entity.renderer.TestEntityRenderer;
import millenniumlibrary.tt432.meetnether.entity.reg.ModEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

/**
 * @author DustW
 **/
@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityRendererRegistry {
    @SubscribeEvent
    public static void onEvent(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.TEST_ENTITY.get(), TestEntityRenderer::new);
    }
}
