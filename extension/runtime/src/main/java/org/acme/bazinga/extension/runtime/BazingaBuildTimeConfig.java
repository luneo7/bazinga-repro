package org.acme.bazinga.extension.runtime;

import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigMapping(prefix = "quarkus.bazinga")
@ConfigRoot
public interface BazingaBuildTimeConfig {
    /**
     * Defines if the Bazinga extension is enabled.
     */
    @WithDefault("true")
    boolean enabled();

    /**
     * Defines if the Bazinga will be stubbed
     */
    @WithDefault("false")
    boolean stub();
}
