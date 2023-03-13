package ch16.example08;

@FunctionalInterface
public interface Function<T> {
	public double apply(T t);
}
