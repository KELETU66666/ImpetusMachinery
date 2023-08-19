package keletu.impetus_machinery.event;

import hellfirepvp.modularmachinery.common.crafting.ComponentType;
import hellfirepvp.modularmachinery.common.crafting.requirement.type.RequirementType;
import keletu.impetus_machinery.modularmachinery.crafting.component.ComponentImpetus;
import keletu.impetus_machinery.modularmachinery.crafting.requirement.RequirementImpetus;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * @author youyihj
 */
@Mod.EventBusSubscriber
public class EventHandler {

    @SubscribeEvent
    public static void registerComponentTypes(RegistryEvent.Register<ComponentType> event) {
        event.getRegistry().registerAll(ComponentImpetus.INSTANCE);
    }

    @SubscribeEvent
    public static void registerRequirementTypes(RegistryEvent.Register<RequirementType<?, ?>> event) {
        event.getRegistry().registerAll(RequirementImpetus.Type.INSTANCE);
    }
}
