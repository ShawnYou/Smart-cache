package com.shawn.cache;

import java.util.Collection;
import java.util.Map;

/**
 * local cache interface
 */
public interface InnerCache<K,V> {

    V getValue(K key);

    Map getAllValues(Collection keys);

    V putValue(K key, V value);

    void putAllValues(Map<K, V> map);

    void removeAllValues(Collection keys);
}
