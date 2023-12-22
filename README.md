# Asynchronous Reactive implementation of the [RDBMS](https://github.com/MoodMinds/rdbms) SPI

This implementation of the [RDBMS](https://github.com/MoodMinds/rdbms) SPI supports asynchronous reactive execution subscribing.
It is built on the [Routes Reactive](https://github.com/MoodMinds/routes-reactive) and utilizes the [R2DBC](https://r2dbc.io)
API under the hood. It can also serve as an [R2DBC Client](https://r2dbc.io/clients/) that provides a more user-friendly API.

## Example

Similar to the [Routes Reactive](https://github.com/MoodMinds/routes-reactive), the materialized execution representation
is a `FluxPublishable` and `MonoPublishable` extensions of [Project Reactor](https://projectreactor.io)'s `Flux` or `Mono`. Consider the following querying example
to see how it can be expressed and materialized:

```java
import io.r2dbc.spi.ConnectionFactories;
import org.moodminds.rdbms.clause.Script;
import org.moodminds.rdbms.reactive.ConnectionFactorySource;
import org.moodminds.rdbms.reactive.ConnectionSource;
import org.moodminds.rdbms.reactive.route.Routes;
import org.moodminds.rdbms.route.Stream1;
import org.moodminds.rdbms.statement.Query1;

import java.util.logging.Logger;

class Sample {

    static final Logger LOG = Logger.getLogger(Sample.class.getName());

    static final Script<Query1<String>> FIRST_NAMES_QUERY = ($$, t) -> $$
            .query1("SELECT firstname FROM PERSON WHERE age > :age")
                .param(Integer.class);

    static final Stream1<Integer, String, RuntimeException> FIRST_NAMES = ($, age) -> $
            .relate(FIRST_NAMES_QUERY)
                .input("age", age)
                .handle(person -> $
                    .expand(person, firstName -> $
                        .effect(firstName, s -> LOG.info(s))
                        .expect(firstName)));


    ConnectionSource connectionSource = new ConnectionFactorySource<>(ConnectionFactories.get("r2dbc:h2:mem:test"));

    public void subscribe() {

        new Routes(connectionSource).stream(FIRST_NAMES, 42) // materialize to FluxEmittable<String, RuntimeException>
            .subscribe(s -> LOG.info(s));
    }
}
```

## Maven configuration

Artifacts can be found on [Maven Central](https://search.maven.org/) after publication.

```xml
<dependency>
    <groupId>org.moodminds.rdbms</groupId>
    <artifactId>rdbms-reactive</artifactId>
    <version>${version}</version>
</dependency>
```

## Building from Source

You may need to build from source to use **RDBMS Reactive** (until it is in Maven Central) with Maven and JDK 1.8 at least.

## License
This project is going to be released under version 2.0 of the [Apache License][l].

[l]: https://www.apache.org/licenses/LICENSE-2.0