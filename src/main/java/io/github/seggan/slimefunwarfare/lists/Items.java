package io.github.seggan.slimefunwarfare.lists;

import com.github.drakescraft_labs.slimefun4.api.items.SlimefunItemStack;
import com.github.drakescraft_labs.slimefun4.core.attributes.MachineTier;
import com.github.drakescraft_labs.slimefun4.core.attributes.MachineType;
import com.github.drakescraft_labs.slimefun4.core.attributes.Radioactivity;
import com.github.drakescraft_labs.slimefun4.libraries.dough.skins.PlayerHead;
import com.github.drakescraft_labs.slimefun4.utils.HeadTexture;
import com.github.drakescraft_labs.slimefun4.utils.LoreBuilder;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.meta.ItemMeta;

import lombok.experimental.UtilityClass;

import java.util.UUID;

@UtilityClass
public final class Items {

    // region explosives
    public static final SlimefunItemStack PYRO_POWDER = new SlimefunItemStack(
        "PYRO_POWDER",
        Material.REDSTONE,
        "&4polvo de pólvora",
        "",
        "&7De hecho, es una sustancia extremadamente explosiva."
    );
    public static final SlimefunItemStack LIQUID_AIR = new SlimefunItemStack(
        "LIQUID_AIR",
        HeadTexture.TIN_CAN,
        "&fAire liquido",
        "",
        "&7no tocar!"
    );
    public static final SlimefunItemStack LIQUID_NITROGEN = new SlimefunItemStack(
        "LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&fnitrógeno líquido",
        "",
        "&7¿Alguien quiere helado??"
    );
    public static final SlimefunItemStack PURIFIED_LIQUID_NITROGEN = new SlimefunItemStack(
        "PURIFIED_LIQUID_NITROGEN",
        HeadTexture.TIN_CAN,
        "&fNitrógeno líquido purificado",
        "",
        "&7lo más puro posible"
    );
    public static final SlimefunItemStack THIOACETONE = new SlimefunItemStack(
        "THIOACETONE",
        Material.BROWN_DYE,
        "&6tioacetona",
        "",
        "&7apesta"
    );
    public static final SlimefunItemStack NITROGEN_TRIIODIDE = new SlimefunItemStack(
        "NITROGEN_TRIIODIDE",
        Material.PURPLE_DYE,
        "&5triyoduro de nitrógeno",
        "",
        "&7Un material utilizado en la fabricación de granadas."
    );
    public static final SlimefunItemStack AZIDOAZIDE_AZIDE = new SlimefunItemStack(
        "AZIDOAZIDE_AZIDE",
        Material.SUGAR,
        "&eazida de carbono",
        "",
        "&7Un material utilizado en la fabricación de granadas."
    );
    public static final SlimefunItemStack ARSENIC = new SlimefunItemStack(
        "ARSENIC",
        Material.GUNPOWDER,
        "&7arsénico",
        "",
        "&7Un material utilizado en la fabricación de granadas."
    );
    public static final SlimefunItemStack ENRICHED_URANIUM = new SlimefunItemStack(
        "ENRICHED_URANIUM",
        HeadTexture.BOOSTED_URANIUM,
        "&aUranio enriquecido",
        "",
        LoreBuilder.radioactive(Radioactivity.VERY_DEADLY)
    );
    public static final SlimefunItemStack EMPTY_GRENADE = new SlimefunItemStack(
        "GRENADE",
        Material.SNOWBALL,
        "&fgranada química",
        "",
        "&7Incluir: ninguno"
    );
    public static final SlimefunItemStack REINFORCED_CONCRETE = new SlimefunItemStack(
        "REINFORCED_CONCRETE",
        Material.GRAY_CONCRETE,
        "&7hormigón armado",
        "",
        "&7Un hormigón a prueba de explosiones(No completamente inmune a las explosiones.)"
    );
    public static final SlimefunItemStack NUCLEAR_BOMB = new SlimefunItemStack(
        "NUCLEAR_BOMB",
        Material.TNT,
        "&7bomba nuclear",
        "",
        "&7KABOOM!",
        LoreBuilder.radioactive(Radioactivity.VERY_DEADLY)
    );
    // endregion

    // region general
    public static final SlimefunItemStack BORAX = new SlimefunItemStack(
        "BORAX",
        Material.QUARTZ,
        "&fBórax",
        "",
        "&7un mineral común que cae de las piedras"
    );
    public static final SlimefunItemStack BORON = new SlimefunItemStack(
        "BORON",
        Material.CHARCOAL,
        "&7boro"
    );
    public static final SlimefunItemStack SLIMESTEEL = new SlimefunItemStack(
        "SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&aLingote de acero dulce",
        "",
        "Un material duro y elástico."
    );

    public static final SlimefunItemStack REINFORCED_SLIMESTEEL = new SlimefunItemStack(
        "REINFORCED_SLIMESTEEL_INGOT",
        Material.IRON_INGOT,
        "&aLingote de acero dulce reforzado",
        "",
        "Un material duro y elástico."
    );

    public static final SlimefunItemStack SCOPE = new SlimefunItemStack(
        "SCOPE",
        Material.STICK,
        "&avista"
    );

    public static final SlimefunItemStack BARREL = new SlimefunItemStack(
        "BARREL",
        Material.STICK,
        "&7barril"
    );

    public static final SlimefunItemStack ADVANCED_BARREL = new SlimefunItemStack(
        "ADVANCED_BARREL",
        Material.STICK,
        "&7barril premium"
    );

    public static final SlimefunItemStack BULLET_PRESS = new SlimefunItemStack(
        "BULLET_PRESS",
        Material.SMOKER,
        "&7maquina para fabricar balas",
        "",
        LoreBuilder.powerPerSecond(16),
        LoreBuilder.powerBuffer(32),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack AIR_LIQUEFIER = new SlimefunItemStack(
        "AIR_LIQUEFIER",
        Material.BEACON,
        "&blicuador de aire",
        "",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack EXPLOSIVE_SYNTHESIZER = new SlimefunItemStack(
        "EXPLOSIVE_SYNTHESIZER",
        Material.TNT,
        "&4sintetizador de explosivos",
        "",
        LoreBuilder.powerPerSecond(64),
        LoreBuilder.powerBuffer(128),
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE)
    );

    public static final SlimefunItemStack BOOMINATOR_9000 = new SlimefunItemStack(
        "BOOMINATOR_9000",
        Material.SMITHING_TABLE,
        "&4Ayudante de espuma 9000",
        "",
        "&7Procesamiento de uranio para bombas nucleares",
        LoreBuilder.powerPerSecond(1024),
        LoreBuilder.powerBuffer(2048),
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE)
    );

    public static final SlimefunItemStack IRON_BULLET = new SlimefunItemStack(
        "IRON_BULLET",
        Material.IRON_NUGGET,
        "&7bala de hierro",
        "",
        "&70.75 doble daño"
    );

    public static final SlimefunItemStack LEAD_BULLET = new SlimefunItemStack(
        "LEAD_BULLET",
        Material.IRON_NUGGET,
        "&7bala de plomo",
        "",
        "&71 doble daño"
    );

    public static final SlimefunItemStack DU_BULLET = new SlimefunItemStack(
        "DU_BULLET",
        Material.IRON_NUGGET,
        "&abomba de uranio empobrecido",
        "",
        "&7Prende fuego a la entidad golpeada",
        "&71.5 doble daño"
    );

    public static final SlimefunItemStack GOLD_BULLET = new SlimefunItemStack(
        "GOLD_BULLET",
        Material.GOLD_NUGGET,
        "&6bala de oro",
        "",
        "&72 doble daño"
    );

    public static final SlimefunItemStack TRINITROBULLETENE = new SlimefunItemStack(
        "TRINITROBULLETENE_BULLET",
        Material.GOLD_NUGGET,
        "&6bomba de trinitrobutileno",
        "",
        "&7Prende fuego a la entidad golpeada",
        "&72.75 doble daño"
    );

    public static final SlimefunItemStack GUN_CASE = new SlimefunItemStack(
        "GUN_CASE",
        Material.CROSSBOW,
        "&7funda",
        "",
        "&7Se utiliza para fabricar armas de fuego."
    );

    public static final SlimefunItemStack OSMIUM_METEOR = new SlimefunItemStack(
        "OSMIUM_METEOR",
        Material.IRON_ORE,
        "&9meteorito de osmio",
        "",
        "&7Fuente de osmio, un metal raro"
    );

    public static final SlimefunItemStack OSMIUM_DUST = new SlimefunItemStack(
        "OSMIUM_DUST",
        Material.SUGAR,
        "&9polvo de osmio",
        "",
        "&7muy venenoso!no inhalar!"
    );

    public static final SlimefunItemStack OSMIUM_INGOT = new SlimefunItemStack(
        "OSMIUM_INGOT",
        Material.IRON_INGOT,
        "&9lingote de osmio",
        "",
        "&7Un metal duro que sólo se encuentra en el espacio exterior."
    );

    public static final SlimefunItemStack OSMIUM_SUPERALLOY = new SlimefunItemStack(
        "OSMIUM_SUPERALLOY",
        Material.IRON_INGOT,
        "&9superaleación de osmio",
        "",
        "&7El metal más duro, resistente y resistente jamás creado."
    );

    public static final SlimefunItemStack SEGGANESSON_METEOR = new SlimefunItemStack(
        "SEGGANESSON_METEOR",
        Material.DIAMOND_ORE,
        "&7Meteoro Segnison",
        "",
        "&7La fuente del raro elemento Segnison"
    );

    public static final SlimefunItemStack SEGGANESSON = new SlimefunItemStack(
        "SEGGANESSON",
        Material.LIGHT_BLUE_DYE,
        "&bSegnison",
        "",
        "&7Un elemento raro que puede iluminar una ciudad entera"
    );

    public static final SlimefunItemStack ENERGY_RECTIFIER = new SlimefunItemStack(
        "ENERGY_RECTIFIER",
        Material.POWERED_RAIL,
        "&brectificador de energía",
        "",
        "&7Convertir la energía eléctrica en energía pura."
    );

    public static final SlimefunItemStack METEOR_ATTRACTOR = new SlimefunItemStack(
        "METEOR_ATTRACTOR",
        HeadTexture.MAGNET,
        "&fAtractor de meteoritos",
        "",
        "&7un poderoso imán",
        "&7Puede atraer meteoritos del espacio exterior."
    );

    public static final SlimefunItemStack ELEMENTAL_REACTOR = new SlimefunItemStack(
        "ELEMENTAL_REACTOR",
        HeadTexture.GENERATOR,
        "&bGenerador de elementos",
        "",
        "&7Utiliza elementos ricos en energía",
        "&7Productos genéricos y Segnison.",
        "&7producir electricidad",
        LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
        LoreBuilder.powerBuffer(32_768),
        LoreBuilder.powerPerSecond(32_768)
    );

    public static final SlimefunItemStack FIBER_OPTIC_GLASS = new SlimefunItemStack(
        "FIBER_OPTIC_GLASS",
        Material.BLUE_STAINED_GLASS,
        "&ffibra de vidrio optica"
    );

    public static final SlimefunItemStack FIBER_OPTIC_CABLE = new SlimefunItemStack(
        "FIBER_OPTIC_CABLE",
        Material.STRING,
        "&fcable de fibra óptica"
    );

    public static final SlimefunItemStack LASER_DIODE = new SlimefunItemStack(
        "LASER_DIODE",
        PlayerHead.getItemStack(Heads.LASER),
        "&4diodo láser"
    );

    public static final SlimefunItemStack ULTRA_MAGNET = new SlimefunItemStack(
        "ULTRA_MAGNET",
        HeadTexture.MAGNET.getTexture(),
        "&fsúper imán"
    );

    public static final SlimefunItemStack RADIO = new SlimefunItemStack(
        "RADIO",
        Material.REDSTONE_TORCH,
        "&fradio",
        "",
        "&7Sostenga el artículo,con otros artículos",
        "&7Chatea con jugadores que tengan este artículo..",
        "&7Clave utilizada para el cifrado/Descifrar mensaje",
        "&7Sólo los jugadores con la misma clave pueden leer el contenido del chat.",
        "&7Mantenga este elemento para chatear",
        "&7Haga clic derecho en el elemento mientras lo mantiene presionado para configurar la clave"
    );
    // endregion

    // region rare earths
    public static final SlimefunItemStack ION_EXCHANGE_SEPARATOR = new SlimefunItemStack(
        "ION_EXCHANGE_SEPARATOR",
        Material.SEA_LANTERN,
        "&bSeparador de intercambio iónico",
        "",
        "&7Separación de tierras raras difíciles de separar de la monacita",
        LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
        LoreBuilder.powerPerSecond(256),
        LoreBuilder.powerBuffer(512)
    );

    public static final SlimefunItemStack MONAZITE = new SlimefunItemStack(
        "MONAZITE",
        Material.ORANGE_DYE,
        "&eMonacita",
        "",
        "&7Fuente de todas las tierras raras.",
        "&7Se puede encontrar en rocas ígneas."
    );

    public static final SlimefunItemStack LANTHANUM_INGOT = new SlimefunItemStack(
        "LANTHANUM_INGOT",
        Material.IRON_INGOT,
        "&eLingote de lantano",
        "",
        "&7Se puede utilizar como pedernal y acero infinitos.",
        "&8Sin embargo, no se puede colocar en una máquina de encendido automático."
    );

    public static final SlimefunItemStack NEODYMIUM_INGOT = new SlimefunItemStack(
        "NEODYMIUM_INGOT",
        Material.NETHERITE_INGOT,
        "&eLingote de neodimio"
    );

    public static final SlimefunItemStack GADOLINIUM_INGOT = new SlimefunItemStack(
        "GADOLINIUM_INGOT",
        Material.IRON_INGOT,
        "&eTabletas de gadolinio"
    );

    public static final SlimefunItemStack TERBIUM_INGOT = new SlimefunItemStack(
        "TERBIUM_INGOT",
        Material.IRON_INGOT,
        "&eLingotes de terbio"
    );

    public static final SlimefunItemStack DYSPROSIUM_INGOT = new SlimefunItemStack(
        "DYSPROSIUM_INGOT",
        Material.NETHERITE_INGOT,
        "&eLingote de disprosio"
    );

    public static final SlimefunItemStack HOLMIUM_INGOT = new SlimefunItemStack(
        "HOLMIUM_INGOT",
        Material.BRICK,
        "&eLingote de holmio"
    );

    public static final SlimefunItemStack ERBIUM_INGOT = new SlimefunItemStack(
        "ERBIUM_INGOT",
        Material.IRON_INGOT,
        "&eLingote de erbio"
    );

    public static final SlimefunItemStack YTTERBIUM_INGOT = new SlimefunItemStack(
        "YTTERBIUM_INGOT",
        Material.IRON_INGOT,
        "&eLingote de iterbio"
    );

    public static final SlimefunItemStack TERFENOL_D = new SlimefunItemStack(
        "TERFENOL_D",
        Material.IRON_INGOT,
        "&6Terfenol-D",
        "",
        "&7Esta aleación tiene la propiedad de cambiar de forma en un campo magnético."
    );

    public static final SlimefunItemStack TERFENOL_D_BLOCK = new SlimefunItemStack(
        "TERFENOL_D_BLOCK",
        Material.IRON_BLOCK,
        "&6Terfenol-D pedazo"
    );

    public static final SlimefunItemStack NDFEB_ALLOY = new SlimefunItemStack(
        "NDFEB_ALLOY",
        Material.NETHERITE_INGOT,
        "&6Aleación de imán de neodimio",
        "",
        "&7Esta aleación es el material más magnético conocido por el hombre."
    );

    public static final SlimefunItemStack NDFEB_ALLOY_BLOCK = new SlimefunItemStack(
        "NDFEB_ALLOY_BLOCK",
        Material.NETHERITE_BLOCK,
        "&6Bloque de aleación de imán de neodimio"
    );
    // endregion

    // region suits
    public static final SlimefunItemStack UNPATENTABLIUM = new SlimefunItemStack(
        "UNPATENTABLIUM",
        Material.LIGHT_BLUE_DYE,
        "&bBienes genéricos",
        "",
        "&7por alguna razón，",
        "&7El gobierno federal no te dejará pagar por esto.",
        "&7Potente patente energética presentada"
    );

    public static final SlimefunItemStack POWER_SUIT_GENERATOR = new SlimefunItemStack(
        "POWER_SUIT_GENERATOR",
        "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTFkNWExZmY3Zjk3NmMxYzJlYmQ0ZWY5YTkwYWQ5MTQ2Nzk1YzFjNDRmZGFlNjI5NjQ5NDg0MzRhNzI1NyJ9fX0=",
        "&6Núcleo de energía de servoarmadura",
        "",
        "&7Núcleo de energía para todas las servoarmaduras."
    );

    public static final SlimefunItemStack ELEMENT_FORGE = new SlimefunItemStack(
        "ELEMENT_FORGE",
        Material.SMITHING_TABLE,
        "&cForja elemental",
        "",
        "&7Se utiliza para crear nuevos elementos.",
        "&cestructura multibloque"
    );

    public static final SlimefunItemStack POWER_SUIT_HELMET = new SlimefunItemStack(
        "POWER_SUIT_HELMET",
        PlayerHead.getItemStack(Heads.SUIT_HELMET),
        "&4Casco de servoarmadura",
        "",
        "&7parte de la servoarmadura",
        "&7Módulos instalables",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_CHESTPLATE = new SlimefunItemStack(
        "POWER_SUIT_CHESTPLATE",
        Material.LEATHER_CHESTPLATE, Color.MAROON,
        "&4Coraza de servoarmadura",
        "",
        "&7parte de la servoarmadura",
        "&7Módulos instalables",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_LEGGINGS = new SlimefunItemStack(
        "POWER_SUIT_LEGGINGS",
        Material.LEATHER_LEGGINGS, Color.MAROON,
        "&4Polainas de servoarmadura",
        "",
        "&7parte de la servoarmadura",
        "&7Módulos instalables",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );
    public static final SlimefunItemStack POWER_SUIT_BOOTS = new SlimefunItemStack(
        "POWER_SUIT_BOOTS",
        Material.LEATHER_BOOTS, Color.MAROON,
        "&4botas de servoarmadura",
        "",
        "&7parte de la servoarmadura",
        "&7Módulos instalables",
        LoreBuilder.powerPerSecond(5),
        LoreBuilder.powerCharged(0, 1000)
    );

    public static final SlimefunItemStack MODULE_MANIPULATOR = new SlimefunItemStack(
        "MODULE_MANIPULATOR",
        Material.CRAFTING_TABLE,
        "&fconsola mod",
        "",
        "&7Le permite instalar, desinstalar y ver módulos."
    );

    public static final SlimefunItemStack MODULE_CASE = new SlimefunItemStack(
        "MODULE_CASE",
        PlayerHead.getItemStack(Heads.MODULE),
        "&6Núcleo de modificación"
    );
    // endregion

    // region guns
    public static final SlimefunItemStack PISTOL = new SlimefunItemStack(
        "GUN_PISTOL",
        Material.CROSSBOW,
        "&7pistola",
        "",
        "&7corto alcance,Recarga más rápida.",
        "&7Especialmente útil en combate cuerpo a cuerpo..",
        "&crango: 10",
        "&cdañar: 6 (3 ♥)",
        "&ctiempo de enfriamiento: 0.5 Segundo"
    );
    public static final SlimefunItemStack REVOLVER = new SlimefunItemStack(
        "GUN_REVOLVER",
        Material.CROSSBOW,
        "&7revólver",
        "",
        "&7corto alcance,Recarga más rápida.",
        "&7Especialmente útil en combate cuerpo a cuerpo..",
        "&crango: 10",
        "&cdañar: 6 (3 ♥)",
        "&ctiempo de enfriamiento: 0.3 Segundo"
    );
    public static final SlimefunItemStack MACHINE_GUN = new SlimefunItemStack(
        "GUN_MACHINE_GUN",
        Material.CROSSBOW,
        "&7ametralladora",
        "",
        "&7Da da da~",
        "&crango: 30",
        "&cRango mínimo: 5",
        "&cdañar: 6 (3 ♥)",
        "&ctiempo de enfriamiento: 0.15 Segundo"
    );
    public static final SlimefunItemStack MINIGUN = new SlimefunItemStack(
        "GUN_MINIGUN",
        Material.CROSSBOW,
        "&7ametralladora pesada",
        "",
        "&7El equipo definitivo para añadir un poco de diversión a tus amigos..",
        "&crango: 40",
        "&cRango mínimo: 5",
        "&cdañar: 8 (4 ♥)",
        "&ctiempo de enfriamiento: ninguno"
    );
    public static final SlimefunItemStack RIFLE = new SlimefunItemStack(
        "GUN_RIFLE",
        Material.CROSSBOW,
        "&7rifle",
        "",
        "&7un rifle estándar.",
        "&crango: 40",
        "&cRango mínimo: 5",
        "&cdañar: 8 (4 ♥)",
        "&ctiempo de enfriamiento: 0.75 Segundo"
    );
    public static final SlimefunItemStack SHOTGUN = new SlimefunItemStack(
        "GUN_SHOTGUN",
        Material.CROSSBOW,
        "&7escopeta",
        "",
        "&7Tiene un alcance más cercano que un rifle.",
        "&7pero puede causar más daño.",
        "&crango: 25",
        "&cRango mínimo: 5",
        "&cdañar: 13 (6.5 ♥)",
        "&ctiempo de enfriamiento: 1.25 Segundo"
    );
    public static final SlimefunItemStack ASSAULT_RIFLE = new SlimefunItemStack(
        "GUN_ASSAULT_RIFLE",
        Material.CROSSBOW,
        "&7rifle de asalto",
        "",
        "&7Derivados del rifle",
        "&7Los rifles de asalto son estándar.",
        "&crango: 50",
        "&cRango mínimo: 3",
        "&cdañar: 13 (6.5 ♥)",
        "&ctiempo de enfriamiento: 0.3 Segundo"
    );
    public static final SlimefunItemStack SNIPER = new SlimefunItemStack(
        "GUN_SNIPER",
        Material.CROSSBOW,
        "&7rifle de francotirador",
        "",
        "&7Esta arma tiene un alcance súper largo.",
        "&7Equipo estándar para francotiradores..",
        "&crango: 130",
        "&cRango mínimo: 50",
        "&cdañar: 22 (11 ♥)",
        "&ctiempo de enfriamiento: 8 Segundo"
    );
    public static final SlimefunItemStack ENERGY_RIFLE = new SlimefunItemStack(
        "GUN_ENERGY_RIFLE",
        Material.CROSSBOW,
        "&erifle de energía",
        "",
        "&7Ya no es necesario llevar balas",
        "&cConsumo por disparo 5J",
        "&crango: 100",
        "&cdañar: 20 (10 ♥)",
        "&ctiempo de enfriamiento: 0.2 Segundo",
        LoreBuilder.powerCharged(0, 2500),
        "&eAviso: La bala parece haber fallado un poco.",
        "&ePero aún puedes dar en el blanco"
    );
    // endregion

    // region melee
    public static final SlimefunItemStack ENERGY_BLADE = new SlimefunItemStack(
        "ENERGY_BLADE",
        Material.DIAMOND_SWORD,
        "&bespada de energía",
        "",
        "&7puñado \"sable de luz\",",
        "&7Usa energía pura para atravesar todo.",
        "",
        "&9costo por golpe 5J",
        LoreBuilder.powerCharged(0, 2500),
        "",
        "&7en mano principal:",
        "&2 14 daño de ataque",
        "&2 1.6 velocidad de ataque"
    );
    public static final SlimefunItemStack BATTLE_AXE = new SlimefunItemStack(
        "BATTLE_AXE",
        Material.IRON_AXE,
        "&6&ltomahawk",
        "",
        "&7Este hacha está diseñada para el combate.! Ya no hay molestos tiempos de reutilización de ataques!",
        "",
        "&7en mano principal:",
        "&2 9 daño de ataque",
        "&2 1.6 velocidad de ataque"
    );
    public static final SlimefunItemStack OSMIUM_SWORD = new SlimefunItemStack(
        "OSMIUM_SWORD",
        Material.IRON_SWORD,
        "&6espada de osmio",
        "",
        "&7Se siente pesado en mi mano",
        "",
        "&7en mano principal:",
        "&2 10 daño de ataque",
        "&2 1.6 velocidad de ataque"
    );
    public static final SlimefunItemStack DUMMY = new SlimefunItemStack(
        "DUMMY",
        Material.HUSK_SPAWN_EGG,
        "&fHuevo de desove ficticio",
        "",
        "&7Haga clic derecho para crear un muñeco",
        "&7Muestra el daño que le has hecho.",
        "&7Haz clic derecho para destruir el muñeco."
    );
    // endregion

    static {
        ENERGY_BLADE.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 5);

        ItemMeta meta = Items.ENERGY_BLADE.getItemMeta();
        meta.setUnbreakable(true);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackDamage",
            13,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        ENERGY_BLADE.setItemMeta(meta);

        // Sets the attack speed to match that of a sword
        meta = BATTLE_AXE.getItemMeta();
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackSpeed",
            -2.4,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackDamage",
            8,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        BATTLE_AXE.setItemMeta(meta);

        OSMIUM_SWORD.addUnsafeEnchantment(Enchantment.UNBREAKING, 8);

        meta = OSMIUM_SWORD.getItemMeta();
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(
            UUID.randomUUID(),
            "generic.attackDamage",
            9,
            AttributeModifier.Operation.ADD_NUMBER,
            EquipmentSlot.HAND
        ));

        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        OSMIUM_SWORD.setItemMeta(meta);
    }
}
