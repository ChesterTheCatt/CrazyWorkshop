
package net.mcreator.crazyrandomthings.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.crazyrandomthings.item.GustavoFItem;
import net.mcreator.crazyrandomthings.CrazyrandomthingsModElements;

@CrazyrandomthingsModElements.ModElement.Tag
public class BananaTabItemGroup extends CrazyrandomthingsModElements.ModElement {
	public BananaTabItemGroup(CrazyrandomthingsModElements instance) {
		super(instance, 72);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbanana_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GustavoFItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
