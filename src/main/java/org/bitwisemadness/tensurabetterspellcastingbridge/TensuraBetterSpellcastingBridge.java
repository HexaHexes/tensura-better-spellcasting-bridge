package org.bitwisemadness.tensurabetterspellcastingbridge;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

/**
 * Tensura - Better Spellcasting Bridge entry point.
 */
@Mod(TensuraBetterSpellcastingBridge.MOD_ID)
public final class TensuraBetterSpellcastingBridge {

    public static final String MOD_ID = "tensura_better_spellcasting_bridge";
    public static final Logger LOGGER = LogUtils.getLogger();

    public TensuraBetterSpellcastingBridge(IEventBus modBus) {
        LOGGER.info("Tensura - Better Spellcasting Bridge initialized");
    }
}
