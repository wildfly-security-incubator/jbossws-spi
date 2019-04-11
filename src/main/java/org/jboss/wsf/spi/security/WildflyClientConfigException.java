package org.jboss.wsf.spi.security;

public class WildflyClientConfigException extends RuntimeException {
    public WildflyClientConfigException() {
        super();
    }

    public WildflyClientConfigException(String message) {
        super(message);
    }

    public WildflyClientConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    public WildflyClientConfigException(Throwable cause) {
        super(cause);
    }
}
