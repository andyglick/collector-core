/* Copyright 2014 Norconex Inc.
 * 
 * This file is part of Norconex Collector Core.
 * 
 * Norconex Collector Core is free software: you can redistribute it and/or 
 * modify it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Norconex Collector Core is distributed in the hope that it will be useful, 
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Norconex Collector Core. If not, 
 * see <http://www.gnu.org/licenses/>.
 */
package com.norconex.collector.core.crawler.event;

import com.norconex.collector.core.data.ICrawlData;

/**
 * @author Pascal Essiembre
 *
 */
public class CrawlerEvent {


    public static final String CRAWLER_STARTED = "CRAWLER_STARTED";
    public static final String CRAWLER_RESUMED = "CRAWLER_RESUMED";
    public static final String CRAWLER_FINISHED = "CRAWLER_FINISHED";

    public static final String REJECTED_FILTER = "REJECTED_FILTER";
    public static final String REJECTED_UNMODIFIED = "REJECTED_UNMODIFIED";
    public static final String REJECTED_NOTFOUND = "REJECTED_NOTFOUND";
    public static final String REJECTED_BAD_STATUS = "REJECTED_BAD_STATUS";
    public static final String REJECTED_IMPORT = "REJECTED_IMPORT";
    public static final String REJECTED_ERROR = "REJECTED_ERROR";
    
//    public static final String HEADERS_FETCHED = "HEADERS_FETCHED";

    public static final String DOCUMENT_PREIMPORTED = "DOCUMENT_PREIMPORTED";
    public static final String DOCUMENT_POSTIMPORTED = "DOCUMENT_POSTIMPORTED";
    public static final String DOCUMENT_COMMITTED = "DOCUMENT_COMMITTED";
    public static final String DOCUMENT_IMPORTED = "DOCUMENT_IMPORTED";
    public static final String DOCUMENT_META_FETCHED = "DOCUMENT_META_FETCHED";
    public static final String DOCUMENT_FETCHED = "DOCUMENT_FETCHED";
    public static final String DOCUMENT_SAVED = "DOCUMENT_SAVED";


    private final ICrawlData crawlData;
    private final Object subject;
    private final String eventType;

    public CrawlerEvent(String eventType, ICrawlData crawlData, Object subject) {
        super();
        this.crawlData = crawlData;
        this.subject = subject;
        this.eventType = eventType;
    }
    
    public Object getSubject() {
        return subject;
    }

    public ICrawlData getCrawlData() {
        return crawlData;
    }

    public String getEventType() {
        return eventType;
    }

}