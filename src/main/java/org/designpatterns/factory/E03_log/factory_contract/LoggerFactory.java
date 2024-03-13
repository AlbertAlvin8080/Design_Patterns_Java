package org.designpatterns.factory.E03_log.factory_contract;

import org.designpatterns.factory.E03_log.logger.Logger;

import java.io.IOException;

public interface LoggerFactory {

    public Logger getLogger() throws IOException;
}
