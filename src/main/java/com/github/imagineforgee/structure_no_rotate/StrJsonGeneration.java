package com.github.imagineforgee.structure_no_rotate;

import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.ExecutionException;

@Mod.EventBusSubscriber(modid = Str.mod_id, bus = Mod.EventBusSubscriber.Bus.MOD)
public class StrJsonGeneration {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        var generator = event.getGenerator();
        var existingFileHelper = event.getExistingFileHelper();
        var lookupProvider = event.getLookupProvider();
        var packOutput = generator.getPackOutput();

        generator.addProvider(
                event.includeServer(),
                new StrTemplatePoolTagsProvider(packOutput, lookupProvider, existingFileHelper)
        );
    }
}
