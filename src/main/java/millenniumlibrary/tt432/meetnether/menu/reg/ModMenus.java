package millenniumlibrary.tt432.meetnether.menu.reg;

import millenniumlibrary.tt432.meetnether.MeetNether;
import millenniumlibrary.tt432.meetnether.menu.TalkingMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * @author DustW
 **/
public class ModMenus {
    public static final DeferredRegister<MenuType<?>> REGISTER = DeferredRegister.create(ForgeRegistries.CONTAINERS, MeetNether.ID);

    public static final RegistryObject<MenuType<TalkingMenu>> TALKING = REGISTER.register("talking", () -> new MenuType<>(TalkingMenu::new));
}
