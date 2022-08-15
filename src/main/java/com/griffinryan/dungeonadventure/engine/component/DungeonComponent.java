package com.griffinryan.dungeonadventure.engine.component;

import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.dsl.views.MinimapView;
import com.griffinryan.dungeonadventure.menu.HeroType;
import com.griffinryan.dungeonadventure.model.HeroesFactory;
import com.griffinryan.dungeonadventure.model.dungeon.Dungeon;
import com.griffinryan.dungeonadventure.model.heroes.Thief;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;

import static com.almasb.fxgl.dsl.FXGL.getWorldProperties;

/**
 * The DungeonComponent class instantiates and
 * determines the layout of the dungeon maze.
 *
 * @author Griffin Ryan (glryan@uw.edu)
 * @see RoomComponent
 */
public class DungeonComponent extends AbstractComponent {

	//private MinimapView minimapView;

	private final Dungeon myDungeon;

	/**
	 * DungeonComponent() is a constructor that takes different
	 * that creates a new randomly generated Dungeon.
	 * Another constructed can be implemented if
	 * the player chooses to load a save file.
	 *
	 * @param theWidth  the width of the dungeon.
	 * @param theHeight the height of the dungeon.
	 */
	public DungeonComponent(int theWidth, int theHeight) {

		//minimapView = new MinimapView(FXGL.getGameWorld(), FXGL.getAppWidth(),
		//		FXGL.getAppWidth(), 600, 600);

		/* Creates the dungeon/room HashMap */
		//maze = createMaze();

		HeroType selectedHeroType = getWorldProperties().getObject("heroType");

		myDungeon = new Dungeon(HeroesFactory.spawn(selectedHeroType, selectedHeroType.toString()), theWidth, theHeight, 0,0);

		FXGL.getWorldProperties().setValue("playerHP", myDungeon.getHero().getHealth());

    }

	public Dungeon getDungeon() {
		return myDungeon;
	}
}
