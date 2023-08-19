package keletu.impetus_machinery.item;

import keletu.impetus_machinery.modularmachinery.block.BlockImpetusHatch;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * @author youyihj
 */
@Mod.EventBusSubscriber
public class ItemRegistry {
    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.registerAll(
                BlockImpetusHatch.Input.ITEM_BLOCK,
                BlockImpetusHatch.Output.ITEM_BLOCK
        );
    }
}
