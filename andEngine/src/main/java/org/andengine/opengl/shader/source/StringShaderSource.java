package main.java.org.andengine.opengl.shader.source;

import main.java.org.andengine.opengl.util.GLState;

/**
 * (c) 2011 Zynga Inc.
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 16:26:08 - 10.10.2011
 */
public class StringShaderSource implements IShaderSource {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private final String mShaderSource;

	// ===========================================================
	// Constructors
	// ===========================================================

	public StringShaderSource(final String pShaderSource) {
		this.mShaderSource = pShaderSource;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public String getShaderSource(final GLState pGLState) {
		return this.mShaderSource;
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
