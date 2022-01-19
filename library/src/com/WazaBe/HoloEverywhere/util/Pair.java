package com.WazaBe.HoloEverywhere.util;

public class Pair<F, S> {
	public final F first;
	public final S second;

	public Pair(F first, S second) {
		this.first = first;
		this.second = second;
	}

	@SuppressWarnings("unchecked")
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Pair))
			return false;
		try {
			Pair<F, S> other = (Pair<F, S>) o;
			return first.equals(other.first) && second.equals(other.second);
		} catch (ClassCastException e) {
			return false;
		}
	}

	public int hashCode() {
		int result = 17;
		result = 31 * result + first.hashCode();
		result = 31 * result + second.hashCode();
		return result;
	}

	public static <A, B> Pair<A, B> create(A a, B b) {
		return new Pair<A, B>(a, b);
	}
}