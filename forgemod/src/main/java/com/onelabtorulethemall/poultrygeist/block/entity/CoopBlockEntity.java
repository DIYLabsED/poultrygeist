package com.onelabtorulethemall.poultrygeist.block.entity;

import com.onelabtorulethemall.poultrygeist.registry.Registration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CoopBlockEntity extends BlockEntity {

    public CoopBlockEntity(BlockPos pPos, BlockState pState){

      super(Registration.COOP_BE.get(), pPos, pState);

    }

    public static void tick(Level pLevel, BlockPos pPos, BlockState pState, CoopBlockEntity pBlockEntity){

      // do nothing

    }
}
