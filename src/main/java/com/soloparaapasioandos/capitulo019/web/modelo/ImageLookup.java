package com.soloparaapasioandos.capitulo019.web.modelo;

public class ImageLookup {

    protected long id;
    protected Image image;

    public ImageLookup(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Image getImage() {
        return image;
    }
}
