package org.acme.bazinga.extension.runtime;

import org.acme.bazinga.extension.Bazinga;

public class BazingaStub implements Bazinga {
    @Override
    public String callSheldon() {
        return "Stub";
    }
}
