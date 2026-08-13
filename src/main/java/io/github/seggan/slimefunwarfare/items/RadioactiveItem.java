package io.github.seggan.slimefunwarfare.items;

import com.github.drakescraft_labs.slimefun4.api.items.ItemGroup;
import com.github.drakescraft_labs.slimefun4.api.items.SlimefunItem;
import com.github.drakescraft_labs.slimefun4.api.items.SlimefunItemStack;
import com.github.drakescraft_labs.slimefun4.api.recipes.RecipeType;
import com.github.drakescraft_labs.slimefun4.core.attributes.Radioactive;
import com.github.drakescraft_labs.slimefun4.core.attributes.Radioactivity;
import org.bukkit.inventory.ItemStack;

import lombok.Getter;

public class RadioactiveItem extends SlimefunItem implements Radioactive {

    @Getter(onMethod_ = @Override)
    private final Radioactivity radioactivity;

    public RadioactiveItem(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, Radioactivity radioactivity) {
        super(category, item, recipeType, recipe);
        this.radioactivity = radioactivity;
    }
}
