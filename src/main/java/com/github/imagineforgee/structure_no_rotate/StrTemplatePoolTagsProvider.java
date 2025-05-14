package com.github.imagineforgee.structure_no_rotate;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class StrTemplatePoolTagsProvider extends TagsProvider<StructureTemplatePool> {

    public StrTemplatePoolTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                       @Nullable ExistingFileHelper existingFileHelper) {
        super(output, Registries.TEMPLATE_POOL, lookupProvider, Str.mod_id, existingFileHelper);
    }


    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(StrTemplatePoolTags.doNotRotate)
                .addOptional(new ResourceLocation("chocolate", "white_palace/white_palace_left"))
                .addOptional(new ResourceLocation("chocolate", "white_palace/white_palace_middle"))
                .addOptional(new ResourceLocation("chocolate", "white_palace/white_palace_middle_bottom"))
                .addOptional(new ResourceLocation("chocolate", "white_palace/white_palace_right"))
                .addOptional(new ResourceLocation("chocolate", "white_palace/white_palace_basement"));
    }
}
