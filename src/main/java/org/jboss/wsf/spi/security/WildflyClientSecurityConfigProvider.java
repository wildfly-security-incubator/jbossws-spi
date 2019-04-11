package org.jboss.wsf.spi.security;

import javax.net.ssl.SSLContext;
import java.net.URI;

public interface WildflyClientSecurityConfigProvider {
    SSLContext getSSLContext(URI uri) throws WildflyClientConfigException;
    String getUsername(URI uri) throws WildflyClientConfigException;
    String getPassword(URI uri) throws WildflyClientConfigException;
}
