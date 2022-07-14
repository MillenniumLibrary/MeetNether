package millenniumlibrary.tt432.meetnether.client.entity.model;

import millenniumlibrary.tt432.meetnether.MeetNether;
import millenniumlibrary.tt432.meetnether.entity.TestEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

/**
 * @author DustW
 **/
public class TestEntityModel extends AnimatedTickingGeoModel<TestEntity> {

    @Override
    public ResourceLocation getModelLocation(TestEntity object) {
        return new ResourceLocation(MeetNether.ID, "geo/test.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(TestEntity object) {
        return new ResourceLocation(MeetNether.ID, "textures/entity/test_entity.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(TestEntity animatable) {
        return new ResourceLocation(MeetNether.ID, "animations/model.animation.json");
    }
}
