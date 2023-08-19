package keletu.impetus_machinery.modularmachinery.tile;

import hellfirepvp.modularmachinery.common.crafting.ComponentType;
import hellfirepvp.modularmachinery.common.machine.IOType;
import hellfirepvp.modularmachinery.common.machine.MachineComponent;
import keletu.impetus_machinery.modularmachinery.crafting.component.ComponentImpetus;

/**
 * @author youyihj
 */
public class MachineComponentImpetus extends MachineComponent<TileImpetusComponent> {
    private final TileImpetusComponent provider;

    public MachineComponentImpetus(IOType ioType, TileImpetusComponent provider) {
        super(ioType);
        this.provider = provider;
    }

    @Override
    public ComponentType getComponentType() {
        return ComponentImpetus.INSTANCE;
    }

    @Override
    public TileImpetusComponent getContainerProvider() {
        return provider;
    }
}
