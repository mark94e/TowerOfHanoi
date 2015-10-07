package main.java.org.andengine.entity.modifier;

import main.java.org.andengine.entity.IEntity;
import main.java.org.andengine.util.modifier.ease.EaseLinear;
import main.java.org.andengine.util.modifier.ease.IEaseFunction;

/**
 * (c) 2011 Zynga Inc.
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 10:48:45 - 05.10.2011
 */
public class SkewYModifier extends SingleValueSpanEntityModifier {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public SkewYModifier(final float pDuration, final float pFromSkewY, final float pToSkewY) {
		this(pDuration, pFromSkewY, pToSkewY, null, EaseLinear.getInstance());
	}

	public SkewYModifier(final float pDuration, final float pFromSkewY, final float pToSkewY, final IEaseFunction pEaseFunction) {
		this(pDuration, pFromSkewY, pToSkewY, null, pEaseFunction);
	}

	public SkewYModifier(final float pDuration, final float pFromSkewY, final float pToSkewY, final IEntityModifierListener pEntityModifierListener) {
		super(pDuration, pFromSkewY, pToSkewY, pEntityModifierListener, EaseLinear.getInstance());
	}

	public SkewYModifier(final float pDuration, final float pFromSkewY, final float pToSkewY, final IEntityModifierListener pEntityModifierListener, final IEaseFunction pEaseFunction) {
		super(pDuration, pFromSkewY, pToSkewY, pEntityModifierListener, pEaseFunction);
	}

	protected SkewYModifier(final SkewYModifier pSkewYModifier) {
		super(pSkewYModifier);
	}

	@Override
	public SkewYModifier deepCopy() {
		return new SkewYModifier(this);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	protected void onSetInitialValue(final IEntity pEntity, final float pSkewY) {
		pEntity.setSkewY(pSkewY);
	}

	@Override
	protected void onSetValue(final IEntity pEntity, final float pPercentageDone, final float pSkewY) {
		pEntity.setSkewY(pSkewY);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}