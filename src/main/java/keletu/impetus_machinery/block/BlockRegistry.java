package keletu.impetus_machinery.block;

import keletu.impetus_machinery.modularmachinery.block.BlockImpetusHatch;
import keletu.impetus_machinery.modularmachinery.tile.TileImpetusComponent;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import static keletu.impetus_machinery.main.MOD_ID;

/**
 * @author youyihj
 */
@Mod.EventBusSubscriber
public class BlockRegistry {

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        registry.registerAll(
                BlockImpetusHatch.Input.INSTANCE,
                BlockImpetusHatch.Output.INSTANCE
        );
        GameRegistry.registerTileEntity(TileImpetusComponent.Input.class, new ResourceLocation(MOD_ID, "impetus_input_hatch"));
        GameRegistry.registerTileEntity(TileImpetusComponent.Output.class, new ResourceLocation(MOD_ID, "impetus_output_hatch"));
    }
}
