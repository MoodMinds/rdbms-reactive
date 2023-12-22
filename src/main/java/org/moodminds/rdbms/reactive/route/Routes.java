package org.moodminds.rdbms.reactive.route;

import org.moodminds.rdbms.Types;
import org.moodminds.rdbms.clause.Statings;
import org.moodminds.rdbms.config.Setting;
import org.moodminds.rdbms.config.Settings;
import org.moodminds.rdbms.reactive.ConnectionSource;
import org.moodminds.rdbms.render.Renderer;
import org.moodminds.rdbms.route.Flow;
import org.moodminds.reactive.Publishable;
import org.moodminds.route.Emitting;
import org.moodminds.route.Flowing;
import org.moodminds.route.Route;
import org.moodminds.route.Route1;
import org.moodminds.route.Route2;
import org.moodminds.route.Route3;
import org.moodminds.route.Route4;
import org.moodminds.route.Route5;
import org.moodminds.route.Route6;
import org.moodminds.route.Route7;
import org.moodminds.route.Route8;
import org.moodminds.route.reactive.FluxEmittable;
import org.moodminds.route.reactive.MonoEmittable;

import static java.util.Objects.requireNonNull;

/**
 * The materializing {@link Publishable} implementation of the {@link org.moodminds.rdbms.route.Routes}
 * interface backed by the R2DBC SPI.
 */
public class Routes implements org.moodminds.rdbms.route.Routes {

    /**
     * Connection source holder field;
     */
    private final ConnectionSource connectionSource;

    private Integer fetchSize, batchSize;

    /**
     * Construct the object with the specified {@link ConnectionSource}.
     *
     * @param connectionSource the {@link ConnectionSource} specified
     */
    public Routes(ConnectionSource connectionSource) {
        this(connectionSource, config -> {});
    }

    /**
     * Construct the object with the specified {@link ConnectionSource} and {@link Settings} consuming configuration.
     *
     * @param connectionSource the specified {@link ConnectionSource}
     * @param setting the specified {@link Settings} consuming configuration
     * @throws NullPointerException if the specified {@link ConnectionSource} or {@link Settings} is {@code null}
     */
    public Routes(ConnectionSource connectionSource, Setting<? super Settings> setting) {
        this.connectionSource = requireNonNull(connectionSource);
        setting.set(new Settings() {
            @Override public Settings fetch(int fetch) { fetchSize = fetch; return this; }
            @Override public Settings batch(int batch) { batchSize = batch; return this; }
            @Override @SafeVarargs public final Settings render(Class<? extends Renderer<?, ?>> renderer, Class<? extends Renderer<?, ?>>... renderers) {
                return this; }
        });
    }

    @Override
    public <V, E extends Exception> FluxEmittable<V, E> stream(Route<? super Flow<?, Statings, Types, E>, ? extends Emitting<? extends V>> route) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <V, E extends Exception> FluxEmittable<V, E> stream(Class<? extends E> thrown, Route<? super Flow<?, Statings, Types, E>, ? extends Emitting<? extends V>> route) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <E extends Exception> MonoEmittable<Void, E> action(Route<? super Flow<?, Statings, Types, E>, ? extends Flowing<?>> route) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <E extends Exception> MonoEmittable<Void, E> action(Class<? extends E> thrown, Route<? super Flow<?, Statings, Types, E>, ? extends Flowing<?>> route) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I, V, E extends Exception> FluxEmittable<V, E> stream(Route1<? super Flow<?, Statings, Types, E>, I, ? extends Emitting<? extends V>> route, I value) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I, V, E extends Exception> FluxEmittable<V, E> stream(Class<? extends E> thrown, Route1<? super Flow<?, Statings, Types, E>, I, ? extends Emitting<? extends V>> route, I value) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I, E extends Exception> MonoEmittable<Void, E> action(Route1<? super Flow<?, Statings, Types, E>, I, ? extends Flowing<?>> route, I value) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I, E extends Exception> MonoEmittable<Void, E> action(Class<? extends E> thrown, Route1<? super Flow<?, Statings, Types, E>, I, ? extends Flowing<?>> route, I value) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, V, E extends Exception> FluxEmittable<V, E> stream(Route2<? super Flow<?, Statings, Types, E>, I1, I2, ? extends Emitting<? extends V>> route, I1 value1, I2 value2) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, V, E extends Exception> FluxEmittable<V, E> stream(Class<? extends E> thrown, Route2<? super Flow<?, Statings, Types, E>, I1, I2, ? extends Emitting<? extends V>> route, I1 value1, I2 value2) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, E extends Exception> MonoEmittable<Void, E> action(Route2<? super Flow<?, Statings, Types, E>, I1, I2, ? extends Flowing<?>> route, I1 value1, I2 value2) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, E extends Exception> MonoEmittable<Void, E> action(Class<? extends E> thrown, Route2<? super Flow<?, Statings, Types, E>, I1, I2, ? extends Flowing<?>> route, I1 value1, I2 value2) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, V, E extends Exception> FluxEmittable<V, E> stream(Route3<? super Flow<?, Statings, Types, E>, I1, I2, I3, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, V, E extends Exception> FluxEmittable<V, E> stream(Class<? extends E> thrown, Route3<? super Flow<?, Statings, Types, E>, I1, I2, I3, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, E extends Exception> MonoEmittable<Void, E> action(Route3<? super Flow<?, Statings, Types, E>, I1, I2, I3, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, E extends Exception> MonoEmittable<Void, E> action(Class<? extends E> thrown, Route3<? super Flow<?, Statings, Types, E>, I1, I2, I3, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, V, E extends Exception> FluxEmittable<V, E> stream(Route4<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, V, E extends Exception> FluxEmittable<V, E> stream(Class<? extends E> thrown, Route4<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, E extends Exception> MonoEmittable<Void, E> action(Route4<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, E extends Exception> MonoEmittable<Void, E> action(Class<? extends E> thrown, Route4<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, V, E extends Exception> FluxEmittable<V, E> stream(Route5<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, V, E extends Exception> FluxEmittable<V, E> stream(Class<? extends E> thrown, Route5<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, E extends Exception> MonoEmittable<Void, E> action(Route5<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, E extends Exception> MonoEmittable<Void, E> action(Class<? extends E> thrown, Route5<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, I6, V, E extends Exception> FluxEmittable<V, E> stream(Route6<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, I6, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, I6, V, E extends Exception> FluxEmittable<V, E> stream(Class<? extends E> thrown, Route6<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, I6, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, I6, E extends Exception> MonoEmittable<Void, E> action(Route6<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, I6, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, I6, E extends Exception> MonoEmittable<Void, E> action(Class<? extends E> thrown, Route6<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, I6, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, I6, I7, V, E extends Exception> FluxEmittable<V, E> stream(Route7<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, I6, I7, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6, I7 value7) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, I6, I7, V, E extends Exception> FluxEmittable<V, E> stream(Class<? extends E> thrown, Route7<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, I6, I7, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6, I7 value7) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, I6, I7, E extends Exception> MonoEmittable<Void, E> action(Route7<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, I6, I7, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6, I7 value7) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, I6, I7, E extends Exception> MonoEmittable<Void, E> action(Class<? extends E> thrown, Route7<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, I6, I7, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6, I7 value7) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, I6, I7, I8, V, E extends Exception> FluxEmittable<V, E> stream(Route8<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, I6, I7, I8, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6, I7 value7, I8 value8) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, I6, I7, I8, V, E extends Exception> FluxEmittable<V, E> stream(Class<? extends E> thrown, Route8<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, I6, I7, I8, ? extends Emitting<? extends V>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6, I7 value7, I8 value8) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, I6, I7, I8, E extends Exception> MonoEmittable<Void, E> action(Route8<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, I6, I7, I8, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6, I7 value7, I8 value8) {
        throw new RuntimeException("Not implemented yet.");
    }

    @Override
    public <I1, I2, I3, I4, I5, I6, I7, I8, E extends Exception> MonoEmittable<Void, E> action(Class<? extends E> thrown, Route8<? super Flow<?, Statings, Types, E>, I1, I2, I3, I4, I5, I6, I7, I8, ? extends Flowing<?>> route, I1 value1, I2 value2, I3 value3, I4 value4, I5 value5, I6 value6, I7 value7, I8 value8) {
        throw new RuntimeException("Not implemented yet.");
    }
}
