package plugins.magic

import org.apollo.game.model.Animation
import org.apollo.game.model.Graphic

enum class EnchantSpell(
    val button: Int,
    val level: Int,
    animation: Int,
    graphic: Int,
    val experience: Double,
    val delay: Int,
    val item: Int,
    val enchanted: Int,
    runes: SpellComponentsBuilder.() -> Unit
) {

    SAPPHIRE_RING(
        button = 1155,
        level = 7,
        animation = 931,
        graphic = 238,
        delay = 2,
        experience = 17.5,
        item = 1637,
        enchanted = 2550,
        runes = {
            cosmic = 1
            water = 1
        }
    ),

    SAPPHIRE_NECKLACE(
        button = 1155,
        level = 7,
        animation = 719,
        graphic = 114,
        delay = 1,
        experience = 17.5,
        item = 1656,
        enchanted = 3853,
        runes = {
            cosmic = 1
            water = 1
        }
    ),

    SAPPHIRE_AMULET(
        button = 1155,
        level = 7,
        animation = 719,
        graphic = 114,
        delay = 1,
        experience = 17.5,
        item = 1692,
        enchanted = 1727,
        runes = {
            cosmic = 1
            water = 1
        }
    ),

    EMERALD_RING(
        button = 1165,
        level = 27,
        animation = 931,
        graphic = 238,
        delay = 2,
        experience = 37.0,
        item = 1639,
        enchanted = 2552,
        runes = {
            cosmic = 1
            air = 1
        }
    ),

    EMERALD_NECKLACE(
        button = 1165,
        level = 27,
        animation = 719,
        graphic = 114,
        delay = 1,
        experience = 37.0,
        item = 1658,
        enchanted = 5521,
        runes = {
            cosmic = 1
            air = 1
        }
    ),

    EMERALD_AMULET(
        button = 1165,
        level = 27,
        animation = 719,
        graphic = 114,
        delay = 1,
        experience = 37.0,
        item = 1696,
        enchanted = 1729,
        runes = {
            cosmic = 1
            air = 1
        }
    ),

    RUBY_RING(
        button = 1176,
        level = 49,
        animation = 931,
        graphic = 238,
        delay = 2,
        experience = 59.0,
        item = 1641,
        enchanted = 2568,
        runes = {
            cosmic = 1
            fire = 5
        }
    ),

    RUBY_AMULET(
        button = 1176,
        level = 49,
        animation = 720,
        graphic = 115,
        delay = 2,
        experience = 59.0,
        item = 1698,
        enchanted = 1725,
        runes = {
            cosmic = 1
            fire = 5
        }
    ),

    DIAMOND_RING(
        button = 1180,
        level = 57,
        animation = 931,
        graphic = 238,
        delay = 2,
        experience = 67.0,
        item = 1643,
        enchanted = 2570,
        runes = {
            cosmic = 1
            earth = 10
        }
    ),

    DIAMOND_AMULET(
        button = 1180,
        level = 57,
        animation = 720,
        graphic = 115,
        delay = 2,
        experience = 67.0,
        item = 1700,
        enchanted = 1731,
        runes = {
            cosmic = 1
            earth = 10
        }
    ),

    DRAGONSTONE_RING(
        button = 1187,
        level = 68,
        animation = 931,
        graphic = 238,
        delay = 2,
        experience = 78.0,
        item = 1645,
        enchanted = 2572,
        runes = {
            cosmic = 1
            earth = 15
            water = 15
        }
    ),

    DRAGONSTONE_AMULET(
        button = 1187,
        level = 68,
        animation = 721,
        graphic = 116,
        delay = 3,
        experience = 78.0,
        item = 1702,
        enchanted = 1712,
        runes = {
            cosmic = 1
            earth = 15
            water = 15
        }
    ),

    ONYX_RING(
        button = 6003,
        level = 87,
        animation = 931,
        graphic = 238,
        delay = 2,
        experience = 97.0,
        item = 6575,
        enchanted = 6583,
        runes = {
            cosmic = 1
            fire = 20
            earth = 20
        }
    ),

    ONYX_AMULET(
        button = 6003,
        level = 87,
        animation = 721,
        graphic = 452,
        delay = 2,
        experience = 97.0,
        item = 6581,
        enchanted = 6585,
        runes = {
            cosmic = 1
            fire = 20
            earth = 20
        }
    );

    val animation = Animation(animation)
    val graphic = Graphic(graphic, 0, 100)
    val components = runes(runes)

    companion object {
        private val spells = EnchantSpell.values().associateBy(EnchantSpell::button)
        fun forButton(button: Int): EnchantSpell? = spells[button]
    }

}