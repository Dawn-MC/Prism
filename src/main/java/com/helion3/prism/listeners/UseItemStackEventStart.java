package com.helion3.prism.listeners;

import com.helion3.prism.api.records.PrismRecord;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.filter.cause.Root;
import org.spongepowered.api.event.item.inventory.UseItemStackEvent;

/**
 * Created by johnfg10 on 03/06/2017.
 */
public class UseItemStackEventStart {
    @Listener
    public void onUseItemStackEventStart(UseItemStackEvent.Start event, @Root Player useCause){
        PrismRecord.create().entity(useCause).itemUsed(event.getItemStackInUse()).save();
    }
}
