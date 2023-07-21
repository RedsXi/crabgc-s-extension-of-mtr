package org.redsxi.mc.cgcem;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import org.redsxi.mc.cgcem.block_entity.BlockEntityTicketBarrierPayDirect;
import org.redsxi.mc.cgcem.util.NeedRsBlockEntityFactoryApi;

import static org.redsxi.mc.cgcem.CrabGcsExtensionOfMc.idOf;

public interface BlockEntityTypes {
    BlockEntityType<BlockEntityTicketBarrierPayDirect> TICKET_BARRIER_PAY_DIRECT = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            idOf("ticket_barrier_pay_direct"),
            FabricBlockEntityTypeBuilder.create(NeedRsBlockEntityFactoryApi.as(BlockEntityTicketBarrierPayDirect.class, false), Blocks.TICKET_BARRIER_PAY_DIRECT).build()
    );

    BlockEntityType<BlockEntityTicketBarrierPayDirect> TICKET_BARRIER_PAY_DIRECT_REDSTONE = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            idOf("ticket_barrier_pay_direct_redstone"),
            FabricBlockEntityTypeBuilder.create(NeedRsBlockEntityFactoryApi.as(BlockEntityTicketBarrierPayDirect.class, true), Blocks.TICKET_BARRIER_PAY_DIRECT_REDSTONE).build()
    );

    static void checkClassLoad() {

    }
}
