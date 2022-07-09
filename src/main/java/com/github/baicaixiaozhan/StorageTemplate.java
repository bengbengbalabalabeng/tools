package com.github.baicaixiaozhan;

/**
 * @author baicaixiaozhan
 * @since v1.0.0
 */
public interface StorageTemplate {

    void saveObj(StorageObject obj);

    StorageObject getObject();

}
