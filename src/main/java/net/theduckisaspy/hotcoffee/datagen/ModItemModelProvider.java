package net.theduckisaspy.hotcoffee.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.theduckisaspy.hotcoffee.HotCoffeeMod;
import net.theduckisaspy.hotcoffee.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HotCoffeeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.DONUT.get());

        withExistingParent(ModItems.MOCCA_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

    }
}
