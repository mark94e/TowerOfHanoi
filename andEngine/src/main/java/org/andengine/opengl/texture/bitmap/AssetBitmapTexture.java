package main.java.org.andengine.opengl.texture.bitmap;

import java.io.IOException;

import main.java.org.andengine.opengl.texture.ITextureStateListener;
import main.java.org.andengine.opengl.texture.TextureManager;
import main.java.org.andengine.opengl.texture.TextureOptions;
import main.java.org.andengine.util.adt.io.in.AssetInputStreamOpener;

import android.content.res.AssetManager;

/**
 * (c) 2012 Zynga Inc.
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 10:45:48 - 02.03.2012
 */
public class AssetBitmapTexture extends BitmapTexture {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public AssetBitmapTexture(final TextureManager pTextureManager, final AssetManager pAssetManager, final String pAssetPath) throws IOException {
		super(pTextureManager, new AssetInputStreamOpener(pAssetManager, pAssetPath));
	}

	public AssetBitmapTexture(final TextureManager pTextureManager, final AssetManager pAssetManager, final String pAssetPath, final BitmapTextureFormat pBitmapTextureFormat) throws IOException {
		super(pTextureManager, new AssetInputStreamOpener(pAssetManager, pAssetPath), pBitmapTextureFormat);
	}

	public AssetBitmapTexture(final TextureManager pTextureManager, final AssetManager pAssetManager, final String pAssetPath, final TextureOptions pTextureOptions) throws IOException {
		super(pTextureManager, new AssetInputStreamOpener(pAssetManager, pAssetPath), pTextureOptions);
	}

	public AssetBitmapTexture(final TextureManager pTextureManager, final AssetManager pAssetManager, final String pAssetPath, final BitmapTextureFormat pBitmapTextureFormat, final TextureOptions pTextureOptions) throws IOException {
		super(pTextureManager, new AssetInputStreamOpener(pAssetManager, pAssetPath), pBitmapTextureFormat, pTextureOptions);
	}

	public AssetBitmapTexture(final TextureManager pTextureManager, final AssetManager pAssetManager, final String pAssetPath, final BitmapTextureFormat pBitmapTextureFormat, final TextureOptions pTextureOptions, final ITextureStateListener pTextureStateListener) throws IOException {
		super(pTextureManager, new AssetInputStreamOpener(pAssetManager, pAssetPath), pBitmapTextureFormat, pTextureOptions, pTextureStateListener);
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
