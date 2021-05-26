package fr.anatom3000.gwwhit.materials.kigys;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class KigysSword extends SwordItem {
    public KigysSword(ToolMaterial material) {
        super(material, 3, 0.08274054394569219f, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    }

}