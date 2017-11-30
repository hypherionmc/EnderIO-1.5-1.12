package crazypants.enderio.machines.machine.generator.stirling;

import javax.annotation.Nonnull;

import crazypants.enderio.base.machine.gui.AbstractMachineContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class StirlingGeneratorContainer extends AbstractMachineContainer<TileEntityStirlingGenerator> {

  public StirlingGeneratorContainer(@Nonnull InventoryPlayer playerInv, @Nonnull TileEntityStirlingGenerator te) {
    super(playerInv, te);
  }

  @Override
  protected void addMachineSlots(@Nonnull InventoryPlayer playerInv) {
    addSlotToContainer(new Slot(getInv(), 0, 80, 34) {
      @Override
      public boolean isItemValid(@Nonnull ItemStack itemStack) {
        return getInv().isItemValidForSlot(0, itemStack);
      }
    });
  }

}
