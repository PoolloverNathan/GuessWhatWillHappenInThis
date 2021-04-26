package fr.anatom3000.gwwhit.registry;

import fr.anatom3000.gwwhit.CustomItemGroups;
import fr.anatom3000.gwwhit.GuessWhatWillHappenInThisMod;
import fr.anatom3000.gwwhit.item.BoosterItem;
import fr.anatom3000.gwwhit.item.PortableBlackHoleItem;
import fr.anatom3000.gwwhit.item.TransdimensionalLensItem;
import fr.anatom3000.gwwhit.materials.CustomArmorMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class ItemRegistry {

    private static final HashMap<String, Item> ITEMS = new HashMap<String, Item>() {{
        put("portable_black_hole", new PortableBlackHoleItem(new FabricItemSettings().fireproof().group(CustomItemGroups.GWWHITGroup)));
        put("booster", new BoosterItem(new FabricItemSettings().fireproof().group(CustomItemGroups.GWWHITGroup)));
        put("transdimensional_lens", new TransdimensionalLensItem(new FabricItemSettings().fireproof().group(CustomItemGroups.GWWHITGroup)));
        put("shock_resistant_boots", new ArmorItem(CustomArmorMaterials.SHOCK_RESISTANT_MATERIAL, EquipmentSlot.FEET, new FabricItemSettings().fireproof().group(CustomItemGroups.GWWHITGroup)));
    }};

    public static void register() {
        for (Map.Entry<String, Item> item : ITEMS.entrySet()) {
            Registry.register(Registry.ITEM, GuessWhatWillHappenInThisMod.ID(item.getKey()), item.getValue());
        }
    }

    public static Item get(String itemId) {
        return ITEMS.getOrDefault(itemId, Items.AIR);
    }

}
