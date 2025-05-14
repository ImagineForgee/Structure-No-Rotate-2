package com.github.imagineforgee.structure_no_rotate;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;

public class StrTemplatePoolTags {
    private static TagKey<StructureTemplatePool> create(String name) {
        return TagKey.create(Registries.TEMPLATE_POOL, new ResourceLocation(Str.mod_id, name));
    }

    public static final TagKey<StructureTemplatePool> doNotRotate = create("do_not_rotate");
}
