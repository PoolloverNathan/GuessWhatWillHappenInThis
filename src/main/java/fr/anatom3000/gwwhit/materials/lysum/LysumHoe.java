package fr.anatom3000.gwwhit.materials.lysum;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class LysumHoe extends HoeItem {
    public LysumHoe(ToolMaterial material) {
        super(material, 5, -0.31883089336116033f, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    }

}