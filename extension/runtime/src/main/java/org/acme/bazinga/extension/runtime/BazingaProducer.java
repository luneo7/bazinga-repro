package org.acme.bazinga.extension.runtime;

import io.quarkus.arc.DefaultBean;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Produces;
import org.acme.bazinga.extension.Bazinga;

@Dependent
public class BazingaProducer {
    @Produces
    @ApplicationScoped
    @DefaultBean
    public Bazinga bazinga() {
        return new BazingaStub();
    }
}
