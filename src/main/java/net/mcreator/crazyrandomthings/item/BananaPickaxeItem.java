
package net.mcreator.crazyrandomthings.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.crazyrandomthings.itemgroup.BananaTabItemGroup;
import net.mcreator.crazyrandomthings.CrazyrandomthingsModElements;

@CrazyrandomthingsModElements.ModElement.Tag
public class BananaPickaxeItem extends CrazyrandomthingsModElements.ModElement {
	@ObjectHolder("crazyrandomthings:banana_pickaxe")
	public static final Item block = null;

	public BananaPickaxeItem(CrazyrandomthingsModElements instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BananaItem.block));
			}
		}, 1, -2.5f, new Item.Properties().group(BananaTabItemGroup.tab)) {
		}.setRegistryName("banana_pickaxe"));
	}
}
