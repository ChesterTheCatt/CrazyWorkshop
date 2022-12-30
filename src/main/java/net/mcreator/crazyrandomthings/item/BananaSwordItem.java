
package net.mcreator.crazyrandomthings.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.crazyrandomthings.itemgroup.BananaTabItemGroup;
import net.mcreator.crazyrandomthings.CrazyrandomthingsModElements;

@CrazyrandomthingsModElements.ModElement.Tag
public class BananaSwordItem extends CrazyrandomthingsModElements.ModElement {
	@ObjectHolder("crazyrandomthings:banana_sword")
	public static final Item block = null;

	public BananaSwordItem(CrazyrandomthingsModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2f, new Item.Properties().group(BananaTabItemGroup.tab)) {
		}.setRegistryName("banana_sword"));
	}
}
