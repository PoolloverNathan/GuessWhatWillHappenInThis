package fr.anatom3000.gwwhit.materials.ijyqbag;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class IjyqbagLeggings extends ArmorItem {
    public IjyqbagLeggings(ArmorMaterial material) {
        super(material, EquipmentSlot.LEGS, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    }

}