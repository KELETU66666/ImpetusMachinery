package keletu.impetus_machinery.crafttweaker;

import crafttweaker.annotations.ZenRegister;
import hellfirepvp.modularmachinery.common.integration.crafttweaker.RecipePrimer;
import hellfirepvp.modularmachinery.common.machine.IOType;
import keletu.impetus_machinery.modularmachinery.crafting.ingredient.Impetus;
import keletu.impetus_machinery.modularmachinery.crafting.requirement.RequirementImpetus;
import stanhebben.zenscript.annotations.ZenExpansion;
import stanhebben.zenscript.annotations.ZenMethod;

@ZenRegister
@ZenExpansion("mods.modularmachinery.RecipePrimer")
public class ImpetusMachineryPrimer {
    @ZenMethod
    public static RecipePrimer addImpetusInput(RecipePrimer primer, int amount) {
        primer.appendComponent(new RequirementImpetus(IOType.INPUT, new Impetus(amount)));
        return primer;
    }

    @ZenMethod
    public static RecipePrimer addImpetusOutput(RecipePrimer primer, int amount) {
        primer.appendComponent(new RequirementImpetus(IOType.OUTPUT, new Impetus(amount)));
        return primer;
    }
}