package com.yourl.service;

/**
 * Created by sridharan.
 */
public interface IUrlStoreService {
    String findUrlById(String id);

    void storeUrl(String id, String url);
}
