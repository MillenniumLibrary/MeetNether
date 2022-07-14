package millenniumlibrary.tt432.meetnether.client.entity.renderer;

import millenniumlibrary.tt432.meetnether.client.entity.model.TestEntityModel;
import millenniumlibrary.tt432.meetnether.entity.TestEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

/**
 * @author DustW
 **/
public class TestEntityRenderer extends GeoEntityRenderer<TestEntity> {
    public TestEntityRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TestEntityModel());
    }
}
