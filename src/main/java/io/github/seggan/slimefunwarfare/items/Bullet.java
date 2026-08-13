package io.github.seggan.slimefunwarfare.items;

import io.github.seggan.slimefunwarfare.lists.Categories;
import io.github.seggan.slimefunwarfare.lists.RecipeTypes;
import com.github.drakescraft_labs.slimefun4.api.items.SlimefunItem;
import com.github.drakescraft_labs.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

import lombok.Getter;

@Getter
public class Bullet extends SlimefunItem {

    private final double multiplier;
    private final boolean isFire;

    public Bullet(SlimefunItemStack item, ItemStack ammoType, double multiplier, boolean isFire) {
        super(Categories.GENERAL, item, RecipeTypes.BULLET_PRESS, new ItemStack[]{
            ammoType, null, null,
            null, null, null,
            null, null, null
        });

        this.multiplier = multiplier;
        this.isFire = isFire;
    }
}
