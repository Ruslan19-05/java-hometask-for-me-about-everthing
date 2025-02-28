package az.edu.turing.quiz9_10;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}