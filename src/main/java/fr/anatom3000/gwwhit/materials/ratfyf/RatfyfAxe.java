package fr.anatom3000.gwwhit.materials.ratfyf;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class RatfyfAxe extends AxeItem {
    public RatfyfAxe(ToolMaterial material) {
        super(material, 4, 0.260999147836505f, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    }

}