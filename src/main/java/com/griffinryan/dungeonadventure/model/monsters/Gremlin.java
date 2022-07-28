package com.griffinryan.dungeonadventure.model.monsters;

import com.griffinryan.dungeonadventure.model.heroes.Hero;

/**
 * Gremlin is a child object that
 * is abstracted by Monster.
 *
 * @see Monster
 * @author Yudong Lin (ydlin@uw.edu)
 */
public class Gremlin extends Monster {

    /**
     * @param theName
     * @param theHealth
     * @param theMinDamage
     * @param theMaxDamage
     * @param theAttackSpeed
     * @param theChanceToHit
     * @param theChanceToHeal
     * @param theMinHealing
     * @param theMaxHealing
     */
    public Gremlin(final String theName, final int theHealth, final int theMinDamage, final int theMaxDamage, final int theAttackSpeed, final byte theChanceToHit, final byte theChanceToHeal, final int theMinHealing, final int theMaxHealing) {
        super(theName, theHealth, theMinDamage, theMaxDamage, theAttackSpeed, theChanceToHit, theChanceToHeal, theMinHealing, theMaxHealing);
    }

    /**
     * @param theName
     */
    public Gremlin(final String theName) {
        super(theName, 70, 15, 30, 5, (byte) 80, (byte) 40, 20, 40);
    }

}
