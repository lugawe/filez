package de.lugawe.filez;

import de.lugawe.filez.util.Lazy;
import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FilezServer extends Application<FilezServerConfiguration> {

    private static final Logger log = LoggerFactory.getLogger(FilezServer.class);

    private static final Lazy<FilezServer> instance = Lazy.of(FilezServer::new);

    public static void main(String[] args) throws Exception {
        instance.get().run(args);
    }

    @Override
    public void run(FilezServerConfiguration configuration, Environment environment) {}
}
