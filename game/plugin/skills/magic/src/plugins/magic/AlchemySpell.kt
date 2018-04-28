package plugins.magic

import org.apollo.game.model.Animation
import org.apollo.game.model.Graphic
import org.apollo.game.plugin.api.Definitions

/**
 * A spell that converts an item into gold.
 */
enum class AlchemySpell(
    val button: Int,
    val level: Int,
    animation: Int,
    graphic: Int,
    private val multiplier: Double,
    val experience: Int,
    val delay: Int,
    runes: SpellComponentsBuilder.() -> Unit
) {

    LOW(button = 1162, level = 21, animation = 712, graphic = 112, multiplier = 0.4, experience = 31, delay = 2,
        runes = {
            nature = 1
            fire = 3
        }
    ),

    HIGH(button = 1178, level = 55, animation = 713, graphic = 113, multiplier = 0.6, experience = 65, delay = 3,
        runes = {
            nature = 1
            fire = 5
        }
    );

    val animation = Animation(animation)
    val graphic = Graphic(graphic)
    val components = runes(runes)

    fun alchemyValue(item: Int): Int {
        return (Definitions.item(item)!!.value * multiplier).toInt()
    }

    companion object {
        private val spells = AlchemySpell.values().associateBy(AlchemySpell::button)
        fun forButton(button: Int): AlchemySpell? = spells[button]
    }

}