package org.moodminds.rdbms.reactive;

import io.r2dbc.spi.Connection;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryMetadata;
import org.moodminds.util.Function1;
import org.reactivestreams.Publisher;

import static java.util.Objects.requireNonNull;

/**
 * A {@link ConnectionFactory} implementation of the {@link ConnectionSource} interface.
 */
public class ConnectionFactorySource implements ConnectionSource {

    /**
     * The {@link ConnectionFactory} holder field.
     */
    private final ConnectionFactory connectionFactory;

    /**
     * The {@link Connection} function holder field.
     */
    private final Function1<? super ConnectionFactory, ? extends Publisher<? extends Connection>> connectionFunction;

    /**
     * Construct the object with the given {@link ConnectionFactory}.
     *
     * @param connectionFactory the given {@link ConnectionFactory}
     */
    public ConnectionFactorySource(ConnectionFactory connectionFactory) {
        this(connectionFactory, ConnectionFactory::create);
    }

    /**
     * Construct the object with the given {@link ConnectionFactory} and {@link Connection} function.
     *
     * @param connectionFactory the given {@link ConnectionFactory}
     * @param connectionFunction the given {@link Connection} function
     */
    public ConnectionFactorySource(ConnectionFactory connectionFactory,
                                   Function1<? super ConnectionFactory, ? extends Publisher<? extends Connection>> connectionFunction) {
        this.connectionFactory = requireNonNull(connectionFactory);
        this.connectionFunction = requireNonNull(connectionFunction);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Publisher<? extends Connection> getConnection() {
        return this.connectionFunction.eval(this.connectionFactory);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConnectionFactoryMetadata getMetadata() {
        return this.connectionFactory.getMetadata();
    }
}
