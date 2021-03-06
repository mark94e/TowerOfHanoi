package main.java.org.andengine.entity.sprite.vbo;

import main.java.org.andengine.entity.sprite.Sprite;
import main.java.org.andengine.opengl.vbo.IVertexBufferObject;

/**
 * (c) 2012 Zynga Inc.
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 18:40:47 - 28.03.2012
 */
public interface ISpriteVertexBufferObject extends IVertexBufferObject {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public void onUpdateColor(final Sprite pSprite);
	public void onUpdateVertices(final Sprite pSprite);
	public void onUpdateTextureCoordinates(final Sprite pSprite);
}