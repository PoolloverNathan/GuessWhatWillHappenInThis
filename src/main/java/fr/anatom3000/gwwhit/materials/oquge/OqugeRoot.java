package fr.anatom3000.gwwhit.materials.oquge;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class OqugeRoot {
    public static final Item OQUGE_INGOT = new Item(new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    public static final Block OQUGE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(3.6079647262184853f, 2.6323698050685547f).sounds(BlockSoundGroup.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0).slipperiness(0.9918251559219082f));
    public static final Block OQUGE_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.021755368926826f, 4.382757633251064f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1));
    public static final ArmorMaterial oqugeArmorMaterial = new OqugeArmorMaterial();
    public static final OqugeHelmet OQUGE_HELMET = new OqugeHelmet(oqugeArmorMaterial);
    public static final OqugeChestplate OQUGE_CHESTPLATE = new OqugeChestplate(oqugeArmorMaterial);
    public static final OqugeLeggings OQUGE_LEGGINGS = new OqugeLeggings(oqugeArmorMaterial);
    public static final OqugeBoots OQUGE_BOOTS = new OqugeBoots(oqugeArmorMaterial);

    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "oquge_ingot"), OQUGE_INGOT);
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "oquge_block"), OQUGE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "oquge_block"), new BlockItem(OQUGE_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "oquge_ore"), OQUGE_ORE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "oquge_ore"), new BlockItem(OQUGE_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "oquge_helmet"), OQUGE_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "oquge_chestplate"), OQUGE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "oquge_leggings"), OQUGE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "oquge_boots"), OQUGE_BOOTS);
        RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit", "ore_oquge"));
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
    }

    public void onInitializeClient() {

    }
}