package fr.anatom3000.gwwhit.materials.peqy;

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

public class PeqyRoot {
    public static final Item PEQY = new Item(new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    public static final PeqyBlock PEQY_BLOCK = new PeqyBlock();
    public static final Block PEQY_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.0717287437950995f, 4.740894063711734f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2));
    public static final ArmorMaterial peqyArmorMaterial = new PeqyArmorMaterial();
    public static final PeqyHelmet PEQY_HELMET = new PeqyHelmet(peqyArmorMaterial);
    public static final PeqyChestplate PEQY_CHESTPLATE = new PeqyChestplate(peqyArmorMaterial);
    public static final PeqyLeggings PEQY_LEGGINGS = new PeqyLeggings(peqyArmorMaterial);
    public static final PeqyBoots PEQY_BOOTS = new PeqyBoots(peqyArmorMaterial);
    public static final PeqySword PEQY_SWORD = new PeqySword(PeqyMaterial.INSTANCE);

    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "peqy"), PEQY);
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "peqy_block"), PEQY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "peqy_block"), new BlockItem(PEQY_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "peqy_ore"), PEQY_ORE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "peqy_ore"), new BlockItem(PEQY_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "peqy_helmet"), PEQY_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "peqy_chestplate"), PEQY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "peqy_leggings"), PEQY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "peqy_boots"), PEQY_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "peqy_sword"), PEQY_SWORD);
        RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit", "ore_peqy"));
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
    }

    public void onInitializeClient() {

    }
}