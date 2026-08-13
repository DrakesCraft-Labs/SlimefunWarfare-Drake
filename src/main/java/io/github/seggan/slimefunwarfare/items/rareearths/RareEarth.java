package io.github.seggan.slimefunwarfare.items.rareearths;

import io.github.seggan.slimefunwarfare.lists.Categories;
import io.github.seggan.slimefunwarfare.lists.Items;
import io.github.seggan.slimefunwarfare.lists.RecipeTypes;
import com.github.drakescraft_labs.slimefun4.api.items.SlimefunItemStack;
import com.github.drakescraft_labs.slimefun4.core.handlers.ItemUseHandler;
import com.github.drakescraft_labs.slimefun4.implementation.items.SimpleSlimefunItem;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class RareEarth extends SimpleSlimefunItem<ItemUseHandler> {

    public RareEarth(SlimefunItemStack item) {
        super(Categories.RESOURCES, item, RecipeTypes.ION_SEPARATOR, new ItemStack[]{
            Items.MONAZITE, null, null,
            null, null, null,
            null, null, null
        });
    }

    @Nonnull
    @Override
    public ItemUseHandler getItemHandler() {
        return (u) -> {};
    }
}
