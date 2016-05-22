package com.soloparaapasioandos.capitulo019.web.jsf;

import com.soloparaapasioandos.capitulo019.web.dao.OffsetPage;
import com.soloparaapasioandos.capitulo019.web.dao.Page;
import com.soloparaapasioandos.capitulo019.web.modelo.Item_;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class CatalogOffsetService extends CatalogService<OffsetPage> {

    @Override
    protected OffsetPage createPage() {
        return new OffsetPage(
            3,
                itemDAO.getCount(),
            Item_.name, Page.SortDirection.ASC,
            Item_.name, Item_.auctionEnd, Item_.maxBidAmount);
    }
}
