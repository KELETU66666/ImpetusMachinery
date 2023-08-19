package keletu.impetus_machinery.modularmachinery;

import keletu.impetus_machinery.modularmachinery.crafting.ingredient.Impetus;
import mezz.jei.api.recipe.IIngredientType;

/**
 * @author youyihj
 */
public class ModIngredientTypes {
    public static final IIngredientType<Impetus> IMPETUS = () -> Impetus.class;
}
