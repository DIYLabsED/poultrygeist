package com.onelabtorulethemall.poultrygeist.block;

import com.onelabtorulethemall.poultrygeist.registry.Registration;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import com.onelabtorulethemall.poultrygeist.block.entity.CoopBlockEntity;

public class CoopBlock extends BaseEntityBlock {

    public CoopBlock(Properties pProperties){

      super(pProperties);

    }

    @Override
    public RenderShape getRenderShape(BlockState pState){

      return RenderShape.MODEL;

    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState){

      return Registration.COOP_BE.get().create(pPos, pState);

    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType){

        if(pLevel.isClientSide){
          return null;
        }

        return createTickerHelper(pBlockEntityType, Registration.COOP_BE.get(), CoopBlockEntity::tick);
        
    }
} 