package plugins.magic

import org.apollo.game.model.Animation
import org.apollo.game.model.Graphic
import org.apollo.game.plugin.api.Definitions


enum class EnchantSpell(
    val button: Int,
    val level: Int,
    animation: Int,
    graphic: Int,
    private val multiplier: Double,
    val experience: Int,
    val delay: Int,
    runes: SpellComponentsBuilder.() -> Unit
) {
    ;

    val animation = Animation(animation)
    val graphic = Graphic(graphic)
    val components = runes(runes)

    fun alchemyValue(item: Int): Int {
        return (Definitions.item(item)!!.value * multiplier).toInt()
    }

    companion object {
        private val spells = EnchantSpell.values().associateBy(EnchantSpell::button)
        fun forButton(button: Int): EnchantSpell? = spells[button]
    }

}