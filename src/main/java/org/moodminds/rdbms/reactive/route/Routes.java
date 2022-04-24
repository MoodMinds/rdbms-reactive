package org.moodminds.rdbms.reactive.route;

import org.moodminds.lang.Publishable;
import org.moodminds.rdbms.reactive.ConnectionSource;
import org.moodminds.route.Emitting;
import org.moodminds.route.Flowing;
import org.moodminds.route.reactive.FluxEmittable;
import org.moodminds.route.reactive.MonoEmittable;
import org.moodminds.util.Consumer1;

import static java.util.Objects.requireNonNull;

/**
 * The {@link Publishable} implementation of the {@link org.moodminds.route.Routes} interface
 * backed by R2DBC API.
 */
public class Routes implements org.moodminds.rdbms.route.Routes {

    /**
     * Connection source holder field;
     */
    private final ConnectionSource connectionSource;

    private Integer fetchSize;
    private Integer batchSize;

    /**
     * Construct the object with the specified {@link ConnectionSource}.
     *
     * @param connectionSource the {@link ConnectionSource} specified
     */
    public Routes(ConnectionSource connectionSource) {
        this(connectionSource, config -> {});
    }

    /**
     * Construct the object with the specified {@link ConnectionSource} and {@link Config} consuming configuration.
     *
     * @param connectionSource the specified {@link ConnectionSource}
     * @param configuration the specified {@link Config} consuming configuration
     */
    public Routes(ConnectionSource connectionSource, Consumer1<? super Config> configuration) {
        this.connectionSource = requireNonNull(connectionSource);
        configuration.exec(new Config() {
            @Override public Config fetch(int fetch) { fetchSize = fetch; return this; }
            @Override public Config batch(int batch) { batchSize = batch; return this; }
        });
    }

    /**
     * The {@link Routes} configuration interface.
     */
    public interface Config {

        /**
         * Configure the default relation result fetch size.
         *
         * @param fetch the specified default relation result fetch size
         * @return the configuration self-instance
         */
        Config fetch(int fetch);

        /**
         * Configure the default insert batch size.
         *
         * @param batch the specified the default insert batch size
         * @return the configuration self-instance
         */
        Config batch(int batch);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <V, E extends Exception> FluxEmittable<V, E> stream(org.moodminds.route.Route<? super Flow<E>, ? extends Emitting<? extends V>> route) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <V, E extends RuntimeException> FluxEmittable<V, E> stream(Route<? super Flow<E>, ? extends Emitting<? extends V>> route) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <V, E extends Exception> FluxEmittable<V, E> stream(Class<? extends E> thrown, Route<? super Flow<E>, ? extends Emitting<? extends V>> route) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends Exception> MonoEmittable<Void, E> action(org.moodminds.route.Route<? super Flow<E>, ? extends Flowing<?>> route) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends RuntimeException> MonoEmittable<Void, E> action(Route<? super Flow<E>, ? extends Flowing<?>> route) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends Exception> MonoEmittable<Void, E> action(Class<? extends E> thrown, Route<? super Flow<E>, ? extends Flowing<?>> route) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I, V, E extends Exception> FluxEmittable<V, E> stream(org.moodminds.route.Route1<? super Flow<E>, I, ? extends Emitting<? extends V>> route, I value) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I, E extends Exception> MonoEmittable<Void, E> action(org.moodminds.route.Route1<? super Flow<E>, I, ? extends Flowing<?>> route, I value) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, V, E extends Exception> FluxEmittable<V, E> stream(org.moodminds.route.Route2<? super Flow<E>, I1, I2, ? extends Emitting<? extends V>> route, I1 value1, I2 value2) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, E extends Exception> MonoEmittable<Void, E> action(org.moodminds.route.Route2<? super Flow<E>, I1, I2, ? extends Flowing<?>> route, I1 value1, I2 value2) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, I3, V, E extends Exception> FluxEmittable<V, E> stream(org.moodminds.route.Route3<? super Flow<E>, I1, I2, I3, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, I3, E extends Exception> MonoEmittable<Void, E> action(org.moodminds.route.Route3<? super Flow<E>, I1, I2, I3, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, I3, I4, V, E extends Exception> FluxEmittable<V, E> stream(org.moodminds.route.Route4<? super Flow<E>, I1, I2, I3, I4, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, I3, I4, E extends Exception> MonoEmittable<Void, E> action(org.moodminds.route.Route4<? super Flow<E>, I1, I2, I3, I4, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, I3, I4, I5, V, E extends Exception> FluxEmittable<V, E> stream(org.moodminds.route.Route5<? super Flow<E>, I1, I2, I3, I4, I5, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, I3, I4, I5, E extends Exception> MonoEmittable<Void, E> action(org.moodminds.route.Route5<? super Flow<E>, I1, I2, I3, I4, I5, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, I3, I4, I5, I6, V, E extends Exception> FluxEmittable<V, E> stream(org.moodminds.route.Route6<? super Flow<E>, I1, I2, I3, I4, I5, I6, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, I3, I4, I5, I6, E extends Exception> MonoEmittable<Void, E> action(org.moodminds.route.Route6<? super Flow<E>, I1, I2, I3, I4, I5, I6, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, I3, I4, I5, I6, I7, V, E extends Exception> FluxEmittable<V, E> stream(org.moodminds.route.Route7<? super Flow<E>, I1, I2, I3, I4, I5, I6, I7, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6, I7 value7) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, I3, I4, I5, I6, I7, E extends Exception> MonoEmittable<Void, E> action(org.moodminds.route.Route7<? super Flow<E>, I1, I2, I3, I4, I5, I6, I7, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6, I7 value7) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, I3, I4, I5, I6, I7, I8, V, E extends Exception> FluxEmittable<V, E> stream(org.moodminds.route.Route8<? super Flow<E>, I1, I2, I3, I4, I5, I6, I7, I8, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6, I7 value7, I8 value8) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <I1, I2, I3, I4, I5, I6, I7, I8, E extends Exception> MonoEmittable<Void, E> action(org.moodminds.route.Route8<? super Flow<E>, I1, I2, I3, I4, I5, I6, I7, I8, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6, I7 value7, I8 value8) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
