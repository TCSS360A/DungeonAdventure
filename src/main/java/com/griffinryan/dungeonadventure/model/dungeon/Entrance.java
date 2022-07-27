package com.griffinryan.dungeonadventure.model.dungeon;

/**
 * 
 * @author Yudong Lin (ydlin@uw.edu) 
 * @author Griffin Ryan (glryan@uw.edu)
 * @author Elijah Amian (elijah25@uw.edu)
 */
final class Entrance extends AbstractRoom {
    
    /**
	 * 
	 */
    Entrance() {
        super(null, 0, 0);
    }

    /** 
     * @return char
     */
    @Override
    public char getFlag() {
        return 'i';
    }
}
