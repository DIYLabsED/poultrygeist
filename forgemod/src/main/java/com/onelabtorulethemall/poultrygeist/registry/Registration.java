package com.onelabtorulethemall.poultrygeist.registry;

import com.onelabtorulethemall.poultrygeist.Poultrygeist;
import com.onelabtorulethemall.poultrygeist.block.CoopBlock;
import com.onelabtorulethemall.poultrygeist.block.entity.CoopBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration{

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Poultrygeist.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Poultrygeist.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Poultrygeist.MODID);

    public static final RegistryObject<Block> COOP = BLOCKS.register("coop",
        () -> new CoopBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS) // temporarily copy oak plank block's properties
            .sound(SoundType.WOOD).strength(2.0f)));

    public static final RegistryObject<Item> COOP_ITEM = ITEMS.register("coop",
        () -> new BlockItem(COOP.get(), new Item.Properties()));

    public static final RegistryObject<BlockEntityType<CoopBlockEntity>> COOP_BE =
        BLOCK_ENTITY_TYPES.register("coop", 
        () -> BlockEntityType.Builder.of(CoopBlockEntity::new, COOP.get()).build(null));


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}