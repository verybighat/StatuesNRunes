package net.runedar.snr.registry;

import net.minecraft.block.enums.DoubleBlockHalf;
import net.runedar.snr.SnR;
import net.runedar.snr.blocks.*;
import net.runedar.snr.blocks.blockentities.StatueBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

            //statues
	      public static final Block CHICKEN_STATUE = new ChickenStatueBlock();
            public static final Block CREEPER_STATUE = new CreeperStatueBlock();
            public static final Block AXOLOTL_STATUE = new AxolotlStatueBlock();
            public static final Block BLAZE_STATUE = new BlazeStatueBlock();
            public static final Block STEVE_STATUE = new SteveStatueBlock();

            public static BlockEntityType<StatueBlockEntity> STATUE_BLOCK_ENTITY;

      public static void registerBlocks(){
            
            //statues
            Registry.register(Registry.BLOCK, new Identifier(SnR.MODID, "chicken_statue"), CHICKEN_STATUE);
            Registry.register(Registry.BLOCK, new Identifier(SnR.MODID, "creeper_statue"), CREEPER_STATUE);
            Registry.register(Registry.BLOCK, new Identifier (SnR.MODID, "axolotl_statue"), AXOLOTL_STATUE);
            Registry.register(Registry.BLOCK, new Identifier (SnR.MODID, "blaze_statue"), BLAZE_STATUE);
            Registry.register(Registry.BLOCK, new Identifier (SnR.MODID, "steve_statue"), STEVE_STATUE);

            STATUE_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "statesnrunes:statue", FabricBlockEntityTypeBuilder.create(StatueBlockEntity::new, 
            
            //statuesOnly
            CHICKEN_STATUE,
            CREEPER_STATUE,
            AXOLOTL_STATUE,
            BLAZE_STATUE,
            STEVE_STATUE

            ).build(null));
      }
}