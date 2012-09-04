package org.wicketstuff.gae;

import org.apache.wicket.pageStore.memory.IDataStoreEvictionStrategy;

/**
 * @author mkalina
 * @version $Id$
 */
public interface GaeApplication {

    IDataStoreEvictionStrategy getEvictionStrategy();
}
