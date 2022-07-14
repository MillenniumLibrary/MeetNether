package millenniumlibrary.tt432.meetnether.item.reg;

import millenniumlibrary.tt432.meetnether.MeetNether;
import millenniumlibrary.tt432.meetnether.entity.reg.ModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author DustW
 **/
public class ModItems {
    public static final DeferredRegister<Item> REGISTER = DeferredRegister.create(ForgeRegistries.ITEMS, MeetNether.ID);

    public static final RegistryObject<Item> TEST_ENTITY = entity(ModEntities.TEST_ENTITY, 0xFFFFFFFF, 0);

    static <M extends Mob> RegistryObject<Item> entity(RegistryObject<EntityType<M>> type, int backgroundColor, int highlightColor) {
        return REGISTER.register(type.getId().getPath(), () -> new ForgeSpawnEggItem(type, backgroundColor, highlightColor, base()));
    }

    static Item.Properties base() {
        return new Item.Properties().tab(MeetNether.TAB);
    }
}
