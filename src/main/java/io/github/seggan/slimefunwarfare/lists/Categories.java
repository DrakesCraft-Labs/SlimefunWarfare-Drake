package io.github.seggan.slimefunwarfare.lists;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;
import io.github.seggan.slimefunwarfare.SlimefunWarfare;
import com.github.drakescraft_labs.slimefun4.api.items.ItemGroup;
import com.github.drakescraft_labs.slimefun4.libraries.dough.items.CustomItemStack;
import com.github.drakescraft_labs.slimefun4.libraries.dough.skins.PlayerHead;
import org.bukkit.Material;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class Categories {

    public static final ItemGroup GENERAL = new SubGroup(
        "slimefunwarfare_general",
        new CustomItemStack(Material.DIAMOND_SWORD, "nave de guerra - Universal")
    );

    public static final ItemGroup MACHINES = new SubGroup(
        "slimefunwarfare_machines",
        new CustomItemStack(Material.STONECUTTER, "nave de guerra - máquina")
    );

    public static final ItemGroup GUNS = new SubGroup(
        "slimefunwarfare_guns",
        new CustomItemStack(Material.CROSSBOW, "nave de guerra - armas de fuego")
    );

    public static final ItemGroup MELEE = new SubGroup(
        "slimefunwarfare_melee",
        new CustomItemStack(Material.IRON_AXE, "nave de guerra - armas cuerpo a cuerpo")
    );

    public static final ItemGroup EXPLOSIVES = new SubGroup(
        "slimefunwarfare_explosives",
        new CustomItemStack(Material.TNT, "nave de guerra - explosivo")
    );

    public static final ItemGroup RESOURCES = new SubGroup(
        "slimefunwarfare_resources",
        new CustomItemStack(Material.IRON_ORE, "nave de guerra - recurso")
    );

    public static final ItemGroup POWER_SUITS = new SubGroup(
        "slimefunwarfare_power_suits",
        new CustomItemStack(PlayerHead.getItemStack(Heads.SUIT_HELMET), "nave de guerra - Armadura potenciada")
    );

    private static final ItemGroup MAIN = new MultiGroup(
        "slimefunwarfare",
        new CustomItemStack(Material.DIAMOND_SWORD, "nave de guerra"),
        GENERAL, MACHINES, GUNS, MELEE, EXPLOSIVES, RESOURCES, POWER_SUITS
    );

    public static void setup(SlimefunWarfare addon) {
        MAIN.register(addon);
    }
}
