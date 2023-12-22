package org.moodminds.rdbms.reactive;

import io.r2dbc.spi.Connection;
import io.r2dbc.spi.ConnectionFactoryMetadata;
import org.reactivestreams.Publisher;

/**
 * Connection supplying interface.
 */
public interface ConnectionSource {

    /**
     * Return the {@link Connection}.
     *
     * @return the {@link Connection}
     */
    Publisher<? extends Connection> getConnection();

    /**
     * Returns the {@link ConnectionFactoryMetadata}.
     *
     * @return the {@link ConnectionFactoryMetadata
     */
    ConnectionFactoryMetadata getMetadata();
}
