package millenniumlibrary.tt432.meetnether;

import millenniumlibrary.tt432.meetnether.entity.reg.ModEntities;
import millenniumlibrary.tt432.meetnether.item.reg.ModItems;
import millenniumlibrary.tt432.meetnether.menu.reg.ModMenus;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * @author DustW
 */
@Mod(MeetNether.ID)
public class MeetNether {
    public static final String ID = "meetnether";

    public static final CreativeModeTab TAB = new CreativeModeTab(ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.TEST_ENTITY.get());
        }
    };

    public MeetNether() {
        var bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModEntities.REGISTER.register(bus);
        ModItems.REGISTER.register(bus);
        ModMenus.REGISTER.register(bus);
    }
}
