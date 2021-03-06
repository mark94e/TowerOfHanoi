package main.java.org.andengine.audio.exception;

import main.java.org.andengine.util.exception.AndEngineRuntimeException;

/**
 * (c) 2011 Zynga Inc.
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 20:44:53 - 09.11.2011
 */
public class AudioException extends AndEngineRuntimeException {
	// ===========================================================
	// Constants
	// ===========================================================

	private static final long serialVersionUID = 2647561236520151571L;

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	public AudioException() {
		super();
	}

	public AudioException(final String pMessage) {
		super(pMessage);
	}

	public AudioException(final Throwable pThrowable) {
		super(pThrowable);
	}

	public AudioException(final String pMessage, final Throwable pThrowable) {
		super(pMessage, pThrowable);
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
