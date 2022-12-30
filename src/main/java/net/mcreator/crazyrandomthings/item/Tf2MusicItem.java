
package net.mcreator.crazyrandomthings.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.util.ActionResultType;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.mcreator.crazyrandomthings.procedures.Tf2MusicRightClickedOnBlockProcedure;
import net.mcreator.crazyrandomthings.itemgroup.BananaTabItemGroup;
import net.mcreator.crazyrandomthings.CrazyrandomthingsModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

@CrazyrandomthingsModElements.ModElement.Tag
public class Tf2MusicItem extends CrazyrandomthingsModElements.ModElement {
	@ObjectHolder("crazyrandomthings:tf_2_music")
	public static final Item block = null;

	public Tf2MusicItem(CrazyrandomthingsModElements instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, CrazyrandomthingsModElements.sounds.get(new ResourceLocation("crazyrandomthings:kazotsky_kick")),
					new Item.Properties().group(BananaTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("tf_2_music");
		}

		@Override
		public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context) {
			ActionResultType retval = super.onItemUseFirst(stack, context);
			World world = context.getWorld();
			BlockPos pos = context.getPos();
			PlayerEntity entity = context.getPlayer();
			Direction direction = context.getFace();
			BlockState blockstate = world.getBlockState(pos);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			ItemStack itemstack = context.getItem();

			Tf2MusicRightClickedOnBlockProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			return retval;
		}
	}
}
