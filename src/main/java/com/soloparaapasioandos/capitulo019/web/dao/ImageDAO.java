package com.soloparaapasioandos.capitulo019.web.dao;

import com.soloparaapasioandos.capitulo019.web.modelo.Image;

import java.io.InputStream;

public interface ImageDAO extends GenericDAO<Image, Long> {

    Image hydrateImage(InputStream inputStream) throws Exception;

}
