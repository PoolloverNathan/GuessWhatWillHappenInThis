package fr.anatom3000.gwwhit.materials.lisluq;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class LisluqPickaxe extends PickaxeItem {
    public LisluqPickaxe(ToolMaterial material) {
        super(material, 3, -1.571281578110181f, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    }

}