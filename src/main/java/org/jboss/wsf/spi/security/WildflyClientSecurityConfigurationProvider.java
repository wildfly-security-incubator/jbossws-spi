package org.jboss.wsf.spi.security;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.net.URI;

public interface WildflyClientSecurityConfigurationProvider {
    SSLContext getCurrentSSLContext(URI uri);
    SSLSocketFactory getSSLSocketFactory(URI uri);
    String getUsername(URI uri);
    String getPassword(URI uri);
}
