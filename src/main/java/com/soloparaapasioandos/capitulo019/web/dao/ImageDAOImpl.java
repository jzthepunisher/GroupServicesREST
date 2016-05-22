package com.soloparaapasioandos.capitulo019.web.dao;

import org.hibernate.engine.jdbc.StreamUtils;
import com.soloparaapasioandos.capitulo019.web.modelo.Image;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class ImageDAOImpl extends GenericDAOImpl<Image, Long> implements ImageDAO {

    @Inject
    public ImageDAOImpl(EntityManager em) {
        super(em, Image.class);
    }

    @Override
    public Image hydrateImage(InputStream inputStream) throws Exception {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream(1024*1024)) {
            StreamUtils.copy(inputStream, outputStream);
            Image image = new Image();
            image.setData(outputStream.toByteArray());
            return image;
        }
    }
}
