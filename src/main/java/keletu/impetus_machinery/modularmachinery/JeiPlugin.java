package keletu.impetus_machinery.modularmachinery;

import keletu.impetus_machinery.modularmachinery.crafting.jei.ImpetusHelper;
import keletu.impetus_machinery.modularmachinery.crafting.jei.ImpetusRender;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.ingredients.IModIngredientRegistration;

import java.util.Collections;

/**
 * @author youyihj
 */
@JEIPlugin
public class JeiPlugin implements IModPlugin {
    public static IJeiHelpers JEI_HELPER;

    @Override
    public void registerIngredients(IModIngredientRegistration registry) {
        registry.register(ModIngredientTypes.IMPETUS, Collections.emptyList(), new ImpetusHelper(), new ImpetusRender());
     }
}
