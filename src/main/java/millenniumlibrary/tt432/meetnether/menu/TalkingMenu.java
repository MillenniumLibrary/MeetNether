package millenniumlibrary.tt432.meetnether.menu;

import millenniumlibrary.tt432.meetnether.menu.base.ModBaseMenu;
import millenniumlibrary.tt432.meetnether.menu.reg.ModMenus;
import net.minecraft.world.entity.player.Inventory;

/**
 * @author DustW
 **/
public class TalkingMenu extends ModBaseMenu {

    public TalkingMenu(int pContainerId, Inventory inventory) {
        super(ModMenus.TALKING.get(), pContainerId, inventory);
    }


}
