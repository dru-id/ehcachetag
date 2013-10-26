package nl.siegmann.ehcachetag.cachekeyfactories;

import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletContext;

/**
 * Central location for managing cacheKeyFactories.
 * 
 * @author paul
 *
 */
public interface CacheKeyMetaFactory {

	/**
	 * Gets the cacheKeyFactory with the given name, null if not found.
	 * 
	 * @param cacheKeyFactoryName name of the cachekeyfactory we're looking for.
	 * 
	 * @return the cacheKeyFactory with the given name, null if not found.
	 */
	CacheKeyFactory getCacheKeyFactory(String cacheKeyFactoryName);

	/**
	 * Gets all CacheKeyFactories
	 * 
	 * @return
	 */
	Set<Entry<String, CacheKeyFactory>> getCacheKeyFactories();
	
	/**
	 * Called once after application is initialized.
	 * 
	 * @param servletContext
	 */
	void init(ServletContext servletContext);
	
	/**
	 * Called once on application destroy.
	 * 
	 */
	void destroy();
}
