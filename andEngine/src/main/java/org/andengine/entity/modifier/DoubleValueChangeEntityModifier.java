package main.java.org.andengine.entity.modifier;

import main.java.org.andengine.entity.IEntity;
import main.java.org.andengine.util.modifier.BaseDoubleValueChangeModifier;

/**
 * (c) 2011 Zynga Inc.
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 14:27:48 - 10.08.2011
 */
public abstract class DoubleValueChangeEntityModifier extends BaseDoubleValueChangeModifier<IEntity> implements IEntityModifier {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public DoubleValueChangeEntityModifier(final float pDuration, final float pValueChangeA, final float pValueChangeB) {
		super(pDuration, pValueChangeA, pValueChangeB);
	}

	public DoubleValueChangeEntityModifier(final float pDuration, final float pValueChangeA, final float pValueChangeB, final IEntityModifierListener pModifierListener) {
		super(pDuration, pValueChangeA, pValueChangeB, pModifierListener);
	}

	public DoubleValueChangeEntityModifier(final DoubleValueChangeEntityModifier pDoubleValueChangeEntityModifier) {
		super(pDoubleValueChangeEntityModifier);
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}