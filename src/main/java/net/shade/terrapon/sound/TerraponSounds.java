package net.shade.terrapon.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shade.terrapon.Terrapon;

public class TerraponSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Terrapon.MOD_ID);
    public static final RegistryObject<SoundEvent> ORBOFSEIDRIL_FOUND_ORE = registerSoundEvents("orbofseidril_found_ore");
    public static final RegistryObject<SoundEvent> JETSETRADIO1 = registerSoundEvents("jetsetradio1");
    public static final RegistryObject<SoundEvent> JETSETRADIO2 = registerSoundEvents("jetsetradio2");
    public static final RegistryObject<SoundEvent> JETSETRADIO3 = registerSoundEvents("jetsetradio3");
    public static final RegistryObject<SoundEvent> JETSETRADIO4 = registerSoundEvents("jetsetradio4");
    public static final RegistryObject<SoundEvent> JETSETRADIO5 = registerSoundEvents("jetsetradio5");

    public static final ForgeSoundType JETSETRADIO = new ForgeSoundType(1f, 1f,
            TerraponSounds.JETSETRADIO1, TerraponSounds.JETSETRADIO2, TerraponSounds.JETSETRADIO3,
            TerraponSounds.JETSETRADIO4, TerraponSounds.JETSETRADIO5);

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        ResourceLocation id = new ResourceLocation(Terrapon.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));

    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
