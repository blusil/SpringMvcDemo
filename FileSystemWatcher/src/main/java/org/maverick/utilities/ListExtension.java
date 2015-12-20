package org.maverick.utilities;

import java.util.Iterator;
import java.util.List;

import com.google.common.collect.FluentIterable;
import com.google.common.collect.Iterators;

public final class ListExtension {
	
	private ListExtension() { }
	
	public static <T> Iterable<T> limit(final Iterable<T> lists, final int limitSize) throws Exception {
		if (limitSize < 0) {
			throw new Exception("Limit is negative");
		}
		
		FluentIterable<T> iterable = new FluentIterable<T>() {
			@Override
		    public Iterator<T> iterator() {
				return Iterators.limit(lists.iterator(), limitSize);
		    }
		};
		//return new ArrayList<T>();
		return iterable;
	}
}
