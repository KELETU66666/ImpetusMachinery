package keletu.impetus_machinery.client;

import keletu.impetus_machinery.modularmachinery.block.BlockImpetusHatch;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * @author youyihj
 */
@Mod.EventBusSubscriber(Side.CLIENT)
public class ModelRegistry {
    @SubscribeEvent
    public static void register(ModelRegistryEvent event) {
        registerMultipleItemsModel(
                BlockImpetusHatch.Input.ITEM_BLOCK,
                BlockImpetusHatch.Output.ITEM_BLOCK
        );
    }

    private static void registerItemModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    private static void registerMultipleItemsModel(Item... items) {
        for (Item item : items) {
            registerItemModel(item);
        }
    }
}
