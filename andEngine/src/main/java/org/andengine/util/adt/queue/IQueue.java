package main.java.org.andengine.util.adt.queue;

import main.java.org.andengine.util.adt.list.IList;

/**
 * (c) 2012 Zynga Inc.
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 15:00:30 - 24.01.2012
 */
public interface IQueue<T> extends IList<T> {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public T peek();
	public T poll();
	public void enter(final T pItem);
	public void enter(final int pIndex, final T pItem) throws IndexOutOfBoundsException;
}
