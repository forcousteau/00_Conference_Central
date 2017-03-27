package com.google.devrel.training.conference.domain;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
// Get the Memcache Service MemcacheService memcacheService = MemcacheServiceFactory.getMemcacheService();

/**
 * Created by forco on 27.03.2017.
 */
public class Announcement {
    private String message;

    public Announcement(){}

    public Announcement(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

