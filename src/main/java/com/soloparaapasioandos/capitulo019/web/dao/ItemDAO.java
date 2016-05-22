package com.soloparaapasioandos.capitulo019.web.dao;

import com.soloparaapasioandos.capitulo019.web.modelo.*;

import java.math.BigDecimal;
import java.util.List;

public interface ItemDAO extends GenericDAO<Item, Long> {

    List<ItemBidSummary> getItemBidSummaries(Page page);

    BigDecimal getMaxBidAmount(Item item);

}
