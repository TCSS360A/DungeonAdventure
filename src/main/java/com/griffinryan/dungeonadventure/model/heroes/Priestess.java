package com.griffinryan.dungeonadventure.model.heroes;

import com.griffinryan.dungeonadventure.model.monsters.Monster;

/**
 * Priestess is a child object that
 * is abstracted by Hero.
 *
 * @author Yudong Lin (ydlin@uw.edu)
 * @see Hero
 */
public final class Priestess extends Hero {

    /**
     * @param theName          the name of the Priestess
     * @param theHealth        the health/hit point of the Priestess
     * @param theMinDamage     the minimum damage that the Priestess will do
     * @param theMaxDamage     the maximum damage that the Priestess will do
     * @param theAttackSpeed   the attack speed of the Priestess
     * @param theChanceToHit   the chance that Priestess will hit
     * @param theChanceToHeal  the chance that Priestess will heal himself/herself
     * @param theMinHealing    the minimum healing that the Priestess will do
     * @param theMaxHealing    the minimum healing that the Priestess will do
     * @param theChanceToBlock the chance that Priestess will block the damage
     */
    public Priestess(final String theName, final int theHealth, final int theMinDamage, final int theMaxDamage, final int theAttackSpeed, final int theChanceToHit, final int theChanceToHeal, final int theMinHealing, final int theMaxHealing, final int theChanceToBlock) {
        super(theName, theHealth, theMinDamage, theMaxDamage, theAttackSpeed, theChanceToHit, theChanceToHeal, theMinHealing, theMaxHealing, theChanceToBlock);
    }

    /**
     * the skill of the Priestess
     *
     * @param theTarget the target
     * @param theCost   the cost of using skill
     */
    public void skill(final Monster theTarget, final int theCost) {
        super.selfHeal();
        this.subtractCurrentAttackSpeed(theCost);
    }
}
