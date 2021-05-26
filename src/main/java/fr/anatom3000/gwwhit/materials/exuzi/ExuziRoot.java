package fr.anatom3000.gwwhit.materials.exuzi;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
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

public class ExuziRoot {
    public static final Item EXUZI_INGOT = new Item(new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    public static final Block EXUZI_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(2.7347668944398564f, 2.251161755292984f).sounds(BlockSoundGroup.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block EXUZI_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.236883250592108f, 2.9149704952957434f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1));
    public static final ArmorMaterial exuziArmorMaterial = new ExuziArmorMaterial();
    public static final ExuziHelmet EXUZI_HELMET = new ExuziHelmet(exuziArmorMaterial);
    public static final ExuziChestplate EXUZI_CHESTPLATE = new ExuziChestplate(exuziArmorMaterial);
    public static final ExuziLeggings EXUZI_LEGGINGS = new ExuziLeggings(exuziArmorMaterial);
    public static final ExuziBoots EXUZI_BOOTS = new ExuziBoots(exuziArmorMaterial);
    public static final ExuziSword EXUZI_SWORD = new ExuziSword(ExuziMaterial.INSTANCE);

    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "exuzi_ingot"), EXUZI_INGOT);
        FuelRegistry.INSTANCE.add(EXUZI_INGOT, 502);
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "exuzi_block"), EXUZI_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "exuzi_block"), new BlockItem(EXUZI_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "exuzi_ore"), EXUZI_ORE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "exuzi_ore"), new BlockItem(EXUZI_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "exuzi_helmet"), EXUZI_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "exuzi_chestplate"), EXUZI_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "exuzi_leggings"), EXUZI_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "exuzi_boots"), EXUZI_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "exuzi_sword"), EXUZI_SWORD);
        RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit", "ore_exuzi"));
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
    }

    public void onInitializeClient() {

    }
}