package com.griffinryan.dungeonadventure.model.dungeon;

/**
 * Exit is a class abstracted by
 * AbstractRoom that constructs
 * an Exit object.
 *
 * @author Yudong Lin (ydlin@uw.edu)
 * @see AbstractRoom
 */
final class Exit extends AbstractRoom {
    Exit() {
        super(null, 0, 0);
    }

    /**
     * @return the char flag that represent the room type and info
     */
    @Override
    char getFlag() {
        return 'O';
    }
}
