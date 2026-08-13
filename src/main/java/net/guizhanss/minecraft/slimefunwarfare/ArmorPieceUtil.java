package net.guizhanss.minecraft.slimefunwarfare;

import io.github.seggan.slimefunwarfare.items.powersuits.ArmorPiece;
import lombok.experimental.UtilityClass;

import javax.annotation.Nonnull;

@UtilityClass
public class ArmorPieceUtil {
    public static @Nonnull String getName(@Nonnull ArmorPiece piece){
        switch (piece) {
            case HEAD:
                return "casco";
            case CHEST:
                return "Coraza";
            case LEGS:
                return "Polainas";
            case FEET:
                return "botas";
            default:
                return "desconocido";
        }
    }
}
