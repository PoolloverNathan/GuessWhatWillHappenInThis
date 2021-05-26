package fr.anatom3000.gwwhit.materials.mafab;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class MafabArmorMaterial implements ArmorMaterial {
    public static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    public static final int[] PROTECTION_VALUES = new int[]{1, 2, 3, 1};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 133;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 18;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(MafabRoot.MAFAB);
    }

    @Override
    public String getName() {
        return "mafab";
    }

    @Override
    public float getToughness() {
        return 3.3660238813706993f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.6761617637660324f;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }
}