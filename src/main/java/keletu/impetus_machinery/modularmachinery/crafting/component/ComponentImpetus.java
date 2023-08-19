package keletu.impetus_machinery.modularmachinery.crafting.component;

import hellfirepvp.modularmachinery.common.crafting.ComponentType;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

import static keletu.impetus_machinery.main.MOD_ID;

/**
 * @author youyihj
 */
public class ComponentImpetus extends ComponentType {

    public static final ComponentImpetus INSTANCE = new ComponentImpetus();

    private ComponentImpetus() {
        setRegistryName(new ResourceLocation(MOD_ID, "impetus_component"));
    }

    @Nullable
    @Override
    public String requiresModid() {
        return "thaumicaugmentation";
    }
}
