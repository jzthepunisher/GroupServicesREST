package com.soloparaapasioandos.capitulo019.web.jsf;

import com.soloparaapasioandos.capitulo019.web.dao.ItemDAO;
import com.soloparaapasioandos.capitulo019.web.dao.Page;
import com.soloparaapasioandos.capitulo019.web.modelo.ItemBidSummary;

import javax.inject.Inject;
import java.util.List;

public abstract class CatalogService<P extends Page> {

    @Inject
    ItemDAO itemDAO;

    List<ItemBidSummary> itemBidSummaries;
    P page;

    public List<ItemBidSummary> getItemBidSummaries() {
        if (itemBidSummaries == null)
            itemBidSummaries =
                itemDAO.getItemBidSummaries(getPage());
        return itemBidSummaries;
    }

    public P getPage() {
        if (page == null)
            page = createPage();
        return page;
    }

    abstract protected P createPage();
}
