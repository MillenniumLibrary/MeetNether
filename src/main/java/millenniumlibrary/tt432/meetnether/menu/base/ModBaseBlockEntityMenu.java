package millenniumlibrary.tt432.meetnether.menu.base;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

/**
 * @author DustW
 **/
public class ModBaseBlockEntityMenu<T extends BlockEntity> extends ModBaseMenu {
    public final T blockEntity;

    public ModBaseBlockEntityMenu(MenuType<?> type, int windowId, Inventory inv, T blockEntity) {
        super(type, windowId, inv);
        this.blockEntity = blockEntity;
    }

    @Override
    protected Slot addSlot(IItemHandler handler, int index, int x, int y) {
        return addSlot(new SlotItemHandler(handler, index, x, y) {
            @Override
            public void setChanged() {
                super.setChanged();
                blockEntity.setChanged();
            }
        });
    }
}
