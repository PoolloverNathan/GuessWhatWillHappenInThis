package fr.anatom3000.gwwhit.materials.ebeqir;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class EbeqirAxe extends AxeItem {
    public EbeqirAxe(ToolMaterial material) {
        super(material, 2, -1.6434261463144182f, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    }

}