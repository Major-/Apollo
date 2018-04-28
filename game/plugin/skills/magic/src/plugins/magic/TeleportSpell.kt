package plugins.magic

import org.apollo.game.model.Position
import plugins.magic.Spellbook.ANCIENTS

/**
 * A spell that teleports a player from one location to another.
 */
enum class TeleportSpell(
    val button: Int,
    val level: Int,
    x: Int,
    y: Int,
    experience: Number,
    val spellbook: Spellbook = Spellbook.NORMAL,
    components: SpellComponentsBuilder.() -> Unit
) {
    VARROCK(button = 1164, level = 25, x = 3213, y = 3424, experience = 35, components = {
        law = 1
        air = 3
        fire = 1
    }),

    LUMBRIDGE(button = 1167, level = 31, x = 3222, y = 3219, experience = 41, components = {
        law = 1
        air = 3
        earth = 1
    }),

    FALADOR(button = 1170, level = 37, x = 2965, y = 3379, experience = 47, components = {
        law = 1
        air = 3
        water = 1
    }),

    CAMELOT(button = 1174, level = 45, x = 2757, y = 3478, experience = 55.5, components = {
        law = 1
        air = 5
    }),

    ARDOUGNE(button = 1540, level = 51, x = 2662, y = 3306, experience = 61, components = {
        law = 2
        water = 2
    }),

    WATCHTOWER(button = 1541, level = 58, x = 2549, y = 3114, experience = 68, components = {
        law = 2
        earth = 2
    }),

    PADDEWWA(button = 13_035, level = 54, x = 3098, y = 9882, experience = 64, spellbook = ANCIENTS, components = {
        law = 2
        fire = 1
        air = 1
    }),

    SENNTISTEN(button = 13_045, level = 60, x = 3320, y = 3338, experience = 70, spellbook = ANCIENTS, components = {
        law = 2
        soul = 2
    }),

    TROLLHEIM(button = 7455, level = 61, x = 2871, y = 3590, experience = 68, components = {
        law = 2
        fire = 2
    }),

    APE_ATOLL(button = 18_740, level = 64, x = 2754, y = 2785, experience = 76, components = {
        law = 2
        fire = 2
        water = 2
        other("Banana")
    }),

    KHARYLL(button = 13_053, level = 66, x = 3493, y = 3472, experience = 76, spellbook = ANCIENTS, components = {
        law = 2
        blood = 1
    }),

    LASSAR(button = 13_061, level = 72, x = 3003, y = 3470, experience = 82, spellbook = ANCIENTS, components = {
        law = 2
        water = 4
    }),

    DAREEYAK(button = 13_069, level = 78, x = 2966, y = 3_696, experience = 88, spellbook = ANCIENTS, components = {
        law = 2
        fire = 3
        air = 2
    }),

    CARRALLANGAR(button = 13_079, level = 84, x = 3163, y = 3664, experience = 94, spellbook = ANCIENTS, components = {
        law = 2
        soul = 2
    }),

    ANNAKARL(button = 13_087, level = 90, x = 3287, y = 3883, experience = 100, spellbook = ANCIENTS, components = {
        law = 2
        blood = 2
    }),

    GHORROCK(button = 13_095, level = 96, x = 2972, y = 3873, experience = 106, spellbook = ANCIENTS, components = {
        law = 2
        water = 8
    });

    val components: Map<Int, Int> = runes(components)
    val position = Position(x, y)
    val experience = experience.toDouble()

    companion object {
        private val spells = TeleportSpell.values().associateBy(TeleportSpell::button)
        fun forButton(button: Int): TeleportSpell? = spells[button]
    }

}