package net.cbr.software.lambda_examples;

/**
 * Realistically you don't need this interface, instead use
 * java.util.function.Predicate;
 */
public interface Matcher<T> {

	public abstract boolean match(T t);

}
