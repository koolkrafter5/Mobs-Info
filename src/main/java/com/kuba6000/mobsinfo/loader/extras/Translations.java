package com.kuba6000.mobsinfo.loader.extras;

import net.minecraft.util.StatCollector;

import com.kuba6000.mobsinfo.api.helper.TranslationHelper;

public enum Translations {

    MINECRAFT_SLIME,
    MINECRAFT_MAGMA_CUBE,

    CHANCE,
    BASE_CHANCE,
    VARIABLE_CHANCE,
    DROPS_ONLY_USING,
    DROPS_ONLY_WITH_WEAKNESS,
    DROPS_ONLY_WITH_WEAKNESS_3,
    DROPS_ONLY_WITH_ENCHANT,
    DROPS_ONLY_IN_DIMENSION,
    EACH_LEVEL_OF_GIVES,
    OR_BIOME,
    OR_USING,
    HALLOWEEN_ONLY,
    YULETIDE_ONLY,
    YULETIDE_DAY_ONLY,

    AVARITIA_SKULL_SWORD,
    DRACONIC_EVOLUTION_MOB_SOUL,
    DRACONIC_EVOLUTION_MOB_SOUL_1,
    DRACONIC_EVOLUTION_MOB_SOUL_2,
    DRACONIC_EVOLUTION_MOB_SOUL_3,
    DRACONIC_EVOLUTION_MOB_SOUL_4,
    DRACONIC_EVOLUTION_MOB_SOUL_5,
    POWERED_CREEPER,
    FORBIDDEN_MAGIC_NON_PLAYER,
    OPEN_BLOCKS_SMALL_CHANCE,
    TINKERS_CONSTRUCT_BEHEADING,
    TINKERS_CONSTRUCT_BEHEADING_1,
    WITCHERY_VAMPIRE_BOOK,
    WITCHERY_WAREWOLF,
    BLOODMAGIC_DEMON_SHARDS,
    BLOODMAGIC_DEMON_PLACER,
    ETFUTURUM_POWERED_CREEPER,
    ETFUTURUM_WITHER_ROSE,
    ETFUTURUM_WITHER_ROSE_1,
    LYCANITES_MOBS_OR_ON_YULETIDE_DAY,

    ;

    final String key;

    Translations() {
        key = "mobsinfo.extras." + this.name()
            .toLowerCase();
    }

    public String get() {
        return StatCollector.translateToLocal(key);
    }

    public String get(Object... args) {
        return TranslationHelper.translateFormattedFixed(key, args);
    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return get();
    }
}
