package com.soloparaapasioandos.capitulo019.web.jsf;

import com.soloparaapasioandos.capitulo019.web.dao.Page;
import com.soloparaapasioandos.capitulo019.web.dao.SeekPage;
import com.soloparaapasioandos.capitulo019.web.modelo.Item_;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CatalogSeekService extends CatalogService<SeekPage> {

    @Override
    protected SeekPage createPage() {
        return new SeekPage(
            3,
            itemDAO.getCount(),
            Item_.name, Page.SortDirection.ASC,
            Item_.id,
            Item_.name, Item_.auctionEnd, Item_.maxBidAmount);
    }
}
