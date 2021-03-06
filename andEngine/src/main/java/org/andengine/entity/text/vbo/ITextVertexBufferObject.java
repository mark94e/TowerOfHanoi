package main.java.org.andengine.entity.text.vbo;

import main.java.org.andengine.entity.text.Text;
import main.java.org.andengine.opengl.vbo.IVertexBufferObject;

/**
 *
 * (c) 2012 Zynga Inc.
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 12:38:05 - 29.03.2012
 */
public interface ITextVertexBufferObject extends IVertexBufferObject {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public void onUpdateColor(final Text pText);
	public void onUpdateVertices(final Text pText);
}

