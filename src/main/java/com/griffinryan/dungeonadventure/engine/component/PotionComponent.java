package com.griffinryan.dungeonadventure.engine.component;

import javafx.geometry.Point2D;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.component.Component;
import com.almasb.fxgl.texture.AnimatedTexture;
import com.almasb.fxgl.texture.AnimationChannel;
import com.almasb.fxgl.texture.Texture;

/**
 *
 * @author Griffin Ryan (glryan@uw.edu)
 * @author Yudong Lin (ydlin@uw.edu)
 * @author Elijah Amian (elijah25@uw.edu)
 */
public class PotionComponent extends Component {

	private AnimatedTexture texture;
	private Texture boundTexture;
	private AnimationChannel idleChannel;
	private int hpAmount = 100; // 100, 300, 500?

	/**
	 * PotionComponent() is a constructor that takes different
	 * AnimationChannel parameters to create an animated Entity.
	 * @param idle Channel for idle animation.
	 * @param bound Texture for boundary box.
	 */
	public PotionComponent(AnimationChannel idle, Texture bound){
		this.idleChannel = idle;
		this.boundTexture = bound;

		this.texture = new AnimatedTexture(idleChannel);
	}

	/**
	 * onAdded() sets properties upon instantiation of
	 * the Component object.
	 *
	 * @see Component
	 */
	@Override
	public void onAdded(){
		entity.getTransformComponent().setScaleOrigin(new Point2D(16, 21));
		entity.getViewComponent().addChild(texture);
		texture.loopAnimationChannel(idleChannel);
		FXGL.getWorldProperties().setValue("potionHP", hpAmount);
	}
}
