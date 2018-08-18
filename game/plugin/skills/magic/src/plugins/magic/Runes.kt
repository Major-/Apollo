package plugins.magic

import org.apollo.game.plugin.api.Definitions

@DslMarker
annotation class RunesDslMarker

fun runes(builder: SpellComponentsBuilder.() -> Unit): Map<Int, Int> {
    return SpellComponentsBuilder().apply(builder).amounts.toMap()
}

@RunesDslMarker
class SpellComponentsBuilder {

    /**
     * The [Map] from rune id to amounts.
     */
    internal val amounts = mutableMapOf<Int, Int>().withDefault { 0 }

    fun other(name: String, amount: Int = 1) {
        val id = Definitions.item(name)?.id ?: throw IllegalArgumentException("Failed to find item for `$name`")
        amounts[id] = amount
    }

    var air: Int
        get() = amounts.getValue(AIR_RUNE)
        set(value) {
            amounts[AIR_RUNE] = value
        }

    var water: Int
        get() = amounts.getValue(WATER_RUNE)
        set(value) {
            amounts[WATER_RUNE] = value
        }

    var earth: Int
        get() = amounts.getValue(EARTH_RUNE)
        set(value) {
            amounts[EARTH_RUNE] = value
        }

    var fire: Int
        get() = amounts.getValue(FIRE_RUNE)
        set(value) {
            amounts[FIRE_RUNE] = value
        }

    var mind: Int
        get() = amounts.getValue(MIND_RUNE)
        set(value) {
            amounts[MIND_RUNE] = value
        }

    var chaos: Int
        get() = amounts.getValue(CHAOS_RUNE)
        set(value) {
            amounts[CHAOS_RUNE] = value
        }

    var death: Int
        get() = amounts.getValue(DEATH_RUNE)
        set(value) {
            amounts[DEATH_RUNE] = value
        }

    var blood: Int
        get() = amounts.getValue(BLOOD_RUNE)
        set(value) {
            amounts[BLOOD_RUNE] = value
        }

    var cosmic: Int
        get() = amounts.getValue(COSMIC_RUNE)
        set(value) {
            amounts[COSMIC_RUNE] = value
        }

    var law: Int
        get() = amounts.getValue(LAW_RUNE)
        set(value) {
            amounts[LAW_RUNE] = value
        }

    var nature: Int
        get() = amounts.getValue(NATURE_RUNE)
        set(value) {
            amounts[NATURE_RUNE] = value
        }

    var soul: Int
        get() = amounts.getValue(SOUL_RUNE)
        set(value) {
            amounts[SOUL_RUNE] = value
        }

    var mist: Int
        get() = amounts.getValue(MIST_RUNE)
        set(value) {
            amounts[MIST_RUNE] = value
        }

    var dust: Int
        get() = amounts.getValue(DUST_RUNE)
        set(value) {
            amounts[DUST_RUNE] = value
        }

    var smoke: Int
        get() = amounts.getValue(SMOKE_RUNE)
        set(value) {
            amounts[SMOKE_RUNE] = value
        }

    var mud: Int
        get() = amounts.getValue(MUD_RUNE)
        set(value) {
            amounts[MUD_RUNE] = value
        }

    var steam: Int
        get() = amounts.getValue(STEAM_RUNE)
        set(value) {
            amounts[STEAM_RUNE] = value
        }

    var lava: Int
        get() = amounts.getValue(LAVA_RUNE)
        set(value) {
            amounts[LAVA_RUNE] = value
        }

    private companion object {
        private const val AIR_RUNE = 556
        private const val WATER_RUNE = 555
        private const val EARTH_RUNE = 557
        private const val FIRE_RUNE = 554

        private const val MIND_RUNE = 558
        private const val CHAOS_RUNE = 562
        private const val DEATH_RUNE = 560
        private const val BLOOD_RUNE = 565

        private const val COSMIC_RUNE = 564
        private const val LAW_RUNE = 563
        private const val NATURE_RUNE = 561
        private const val SOUL_RUNE = 566

        private const val MIST_RUNE = 4695
        private const val DUST_RUNE = 4696
        private const val SMOKE_RUNE = 4697
        private const val MUD_RUNE = 4698
        private const val STEAM_RUNE = 4694
        private const val LAVA_RUNE = 4699
    }

}