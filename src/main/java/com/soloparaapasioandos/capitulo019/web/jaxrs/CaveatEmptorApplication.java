package com.soloparaapasioandos.capitulo019.web.jaxrs;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import static com.soloparaapasioandos.capitulo019.Constants.API_VERSION;

@ApplicationPath(API_VERSION) // You should version your Web API
public class CaveatEmptorApplication extends Application {
}
