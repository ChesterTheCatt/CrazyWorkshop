package net.mcreator.crazyrandomthings.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Block;

import net.mcreator.crazyrandomthings.CrazyrandomthingsMod;

import java.util.Map;

public class RainbowPickaxeBlockDestroyedWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CrazyrandomthingsMod.LOGGER.warn("Failed to load dependency world for procedure RainbowPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CrazyrandomthingsMod.LOGGER.warn("Failed to load dependency x for procedure RainbowPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CrazyrandomthingsMod.LOGGER.warn("Failed to load dependency y for procedure RainbowPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CrazyrandomthingsMod.LOGGER.warn("Failed to load dependency z for procedure RainbowPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CrazyrandomthingsMod.LOGGER.warn("Failed to load dependency entity for procedure RainbowPickaxeBlockDestroyedWithTool!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getHorizontalFacing()) == Direction.NORTH || (entity.getHorizontalFacing()) == Direction.SOUTH) {
			if ((world.getBlockState(new BlockPos(x + 0, y + 1, z + 0))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& world.getBlockState(new BlockPos(x + 0, y + 1, z + 0)).getHarvestLevel() < 3) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x + 0, y + 1, z + 0)), (World) world, new BlockPos(x + 0, y + 1, z + 0));
					world.destroyBlock(new BlockPos(x + 0, y + 1, z + 0), false);
				}
				(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setDamage(
						(int) ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getDamage()
								+ 1));
				if ((world.getBlockState(new BlockPos(x + 1, y + 1, z + 0))).getMaterial() == net.minecraft.block.material.Material.ROCK
						&& world.getBlockState(new BlockPos(x + 1, y + 1, z + 0)).getHarvestLevel() < 3) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y + 1, z + 0)), (World) world, new BlockPos(x + 1, y + 1, z + 0));
						world.destroyBlock(new BlockPos(x + 1, y + 1, z + 0), false);
					}
					(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setDamage(
							(int) ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getDamage()
									+ 1));
					if ((world.getBlockState(new BlockPos(x - 1, y + 1, z + 0))).getMaterial() == net.minecraft.block.material.Material.ROCK
							&& world.getBlockState(new BlockPos(x - 1, y + 1, z + 0)).getHarvestLevel() < 3) {
						if (world instanceof World) {
							Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y + 1, z + 0)), (World) world,
									new BlockPos(x - 1, y + 1, z + 0));
							world.destroyBlock(new BlockPos(x - 1, y + 1, z + 0), false);
						}
						(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setDamage(
								(int) ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
										.getDamage() + 1));
						if ((world.getBlockState(new BlockPos(x + 1, y + 0, z + 0))).getMaterial() == net.minecraft.block.material.Material.ROCK
								&& world.getBlockState(new BlockPos(x + 1, y + 0, z + 0)).getHarvestLevel() < 3) {
							if (world instanceof World) {
								Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y + 0, z + 0)), (World) world,
										new BlockPos(x + 1, y + 0, z + 0));
								world.destroyBlock(new BlockPos(x + 1, y + 0, z + 0), false);
							}
							(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setDamage(
									(int) ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
											.getDamage() + 1));
							if ((world.getBlockState(new BlockPos(x - 1, y + 0, z + 0))).getMaterial() == net.minecraft.block.material.Material.ROCK
									&& world.getBlockState(new BlockPos(x - 1, y + 0, z + 0)).getHarvestLevel() < 3) {
								if (world instanceof World) {
									Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y + 0, z + 0)), (World) world,
											new BlockPos(x - 1, y + 0, z + 0));
									world.destroyBlock(new BlockPos(x - 1, y + 0, z + 0), false);
								}
								(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setDamage(
										(int) ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
												.getDamage() + 1));
								if ((world.getBlockState(new BlockPos(x + 0, y - 1, z + 0)))
										.getMaterial() == net.minecraft.block.material.Material.ROCK
										&& world.getBlockState(new BlockPos(x + 0, y - 1, z + 0)).getHarvestLevel() < 3) {
									if (world instanceof World) {
										Block.spawnDrops(world.getBlockState(new BlockPos(x + 0, y - 1, z + 0)), (World) world,
												new BlockPos(x + 0, y - 1, z + 0));
										world.destroyBlock(new BlockPos(x + 0, y - 1, z + 0), false);
									}
									(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
											.setDamage((int) ((((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)).getDamage() + 1));
									if ((world.getBlockState(new BlockPos(x + 1, y - 1, z + 0)))
											.getMaterial() == net.minecraft.block.material.Material.ROCK
											&& world.getBlockState(new BlockPos(x + 1, y - 1, z + 0)).getHarvestLevel() < 3) {
										if (world instanceof World) {
											Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y - 1, z + 0)), (World) world,
													new BlockPos(x + 1, y - 1, z + 0));
											world.destroyBlock(new BlockPos(x + 1, y - 1, z + 0), false);
										}
										(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
												.setDamage((int) ((((entity instanceof LivingEntity)
														? ((LivingEntity) entity).getHeldItemMainhand()
														: ItemStack.EMPTY)).getDamage() + 1));
										if ((world.getBlockState(new BlockPos(x - 1, y - 1, z + 0)))
												.getMaterial() == net.minecraft.block.material.Material.ROCK
												&& world.getBlockState(new BlockPos(x - 1, y - 1, z + 0)).getHarvestLevel() < 3) {
											if (world instanceof World) {
												Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y - 1, z + 0)), (World) world,
														new BlockPos(x - 1, y - 1, z + 0));
												world.destroyBlock(new BlockPos(x - 1, y - 1, z + 0), false);
											}
											(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
													.setDamage((int) ((((entity instanceof LivingEntity)
															? ((LivingEntity) entity).getHeldItemMainhand()
															: ItemStack.EMPTY)).getDamage() + 1));
										}
									}
								}
							}
						}
					}
				}
			}
		} else if ((entity.getHorizontalFacing()) == Direction.WEST || (entity.getHorizontalFacing()) == Direction.EAST) {
			if ((world.getBlockState(new BlockPos(x + 0, y + 1, z + 0))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& world.getBlockState(new BlockPos(x + 0, y + 1, z + 0)).getHarvestLevel() < 3) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x + 0, y + 1, z + 0)), (World) world, new BlockPos(x + 0, y + 1, z + 0));
					world.destroyBlock(new BlockPos(x + 0, y + 1, z + 0), false);
				}
				(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setDamage(
						(int) ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getDamage()
								+ 1));
				if ((world.getBlockState(new BlockPos(x + 0, y + 1, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
						&& world.getBlockState(new BlockPos(x + 0, y + 1, z + 1)).getHarvestLevel() < 3) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 0, y + 1, z + 1)), (World) world, new BlockPos(x + 0, y + 1, z + 1));
						world.destroyBlock(new BlockPos(x + 0, y + 1, z + 1), false);
					}
					(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setDamage(
							(int) ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).getDamage()
									+ 1));
					if ((world.getBlockState(new BlockPos(x - 0, y + 1, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
							&& world.getBlockState(new BlockPos(x - 0, y + 1, z - 1)).getHarvestLevel() < 3) {
						if (world instanceof World) {
							Block.spawnDrops(world.getBlockState(new BlockPos(x - 0, y + 1, z - 1)), (World) world,
									new BlockPos(x - 0, y + 1, z - 1));
							world.destroyBlock(new BlockPos(x - 0, y + 1, z - 1), false);
						}
						(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setDamage(
								(int) ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
										.getDamage() + 1));
						if ((world.getBlockState(new BlockPos(x + 0, y + 0, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
								&& world.getBlockState(new BlockPos(x + 0, y + 0, z + 1)).getHarvestLevel() < 3) {
							if (world instanceof World) {
								Block.spawnDrops(world.getBlockState(new BlockPos(x + 0, y + 0, z + 1)), (World) world,
										new BlockPos(x + 0, y + 0, z + 1));
								world.destroyBlock(new BlockPos(x + 0, y + 0, z + 1), false);
							}
							(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setDamage(
									(int) ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
											.getDamage() + 1));
							if ((world.getBlockState(new BlockPos(x - 0, y + 0, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
									&& world.getBlockState(new BlockPos(x - 0, y + 0, z - 1)).getHarvestLevel() < 3) {
								if (world instanceof World) {
									Block.spawnDrops(world.getBlockState(new BlockPos(x - 0, y + 0, z - 1)), (World) world,
											new BlockPos(x - 0, y + 0, z - 1));
									world.destroyBlock(new BlockPos(x - 0, y + 0, z - 1), false);
								}
								(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).setDamage(
										(int) ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
												.getDamage() + 1));
								if ((world.getBlockState(new BlockPos(x + 0, y - 1, z + 0)))
										.getMaterial() == net.minecraft.block.material.Material.ROCK
										&& world.getBlockState(new BlockPos(x + 0, y - 1, z + 0)).getHarvestLevel() < 3) {
									if (world instanceof World) {
										Block.spawnDrops(world.getBlockState(new BlockPos(x + 0, y - 1, z + 0)), (World) world,
												new BlockPos(x + 0, y - 1, z + 0));
										world.destroyBlock(new BlockPos(x + 0, y - 1, z + 0), false);
									}
									(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
											.setDamage((int) ((((entity instanceof LivingEntity)
													? ((LivingEntity) entity).getHeldItemMainhand()
													: ItemStack.EMPTY)).getDamage() + 1));
									if ((world.getBlockState(new BlockPos(x + 0, y - 1, z + 1)))
											.getMaterial() == net.minecraft.block.material.Material.ROCK
											&& world.getBlockState(new BlockPos(x + 0, y - 1, z + 1)).getHarvestLevel() < 3) {
										if (world instanceof World) {
											Block.spawnDrops(world.getBlockState(new BlockPos(x + 0, y - 1, z + 1)), (World) world,
													new BlockPos(x + 0, y - 1, z + 1));
											world.destroyBlock(new BlockPos(x + 0, y - 1, z + 1), false);
										}
										(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
												.setDamage((int) ((((entity instanceof LivingEntity)
														? ((LivingEntity) entity).getHeldItemMainhand()
														: ItemStack.EMPTY)).getDamage() + 1));
										if ((world.getBlockState(new BlockPos(x - 0, y - 1, z - 1)))
												.getMaterial() == net.minecraft.block.material.Material.ROCK
												&& world.getBlockState(new BlockPos(x - 0, y - 1, z - 1)).getHarvestLevel() < 3) {
											if (world instanceof World) {
												Block.spawnDrops(world.getBlockState(new BlockPos(x - 0, y - 1, z - 1)), (World) world,
														new BlockPos(x - 0, y - 1, z - 1));
												world.destroyBlock(new BlockPos(x - 0, y - 1, z - 1), false);
											}
											(((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))
													.setDamage((int) ((((entity instanceof LivingEntity)
															? ((LivingEntity) entity).getHeldItemMainhand()
															: ItemStack.EMPTY)).getDamage() + 1));
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
