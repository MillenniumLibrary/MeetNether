package millenniumlibrary.tt432.meetnether.entity.reg;

import millenniumlibrary.tt432.meetnether.MeetNether;
import millenniumlibrary.tt432.meetnether.entity.TestEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author DustW
 **/
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
    public static final DeferredRegister<EntityType<?>> REGISTER = DeferredRegister.create(ForgeRegistries.ENTITIES, MeetNether.ID);

    public static final RegistryObject<EntityType<TestEntity>> TEST_ENTITY = withSize("test_entity", TestEntity::new, 1, 2);

    static <T extends Entity> RegistryObject<EntityType<T>> withSize(String name, EntityType.EntityFactory<T> factory, int width, int height) {
        return REGISTER.register(name, () -> EntityType.Builder.of(factory, MobCategory.CREATURE).sized(width, height).build(name));
    }

    @SubscribeEvent
    public static void onEvent(EntityAttributeCreationEvent event) {
        event.put(TEST_ENTITY.get(), TestEntity.createAttributes().build());
    }
}
