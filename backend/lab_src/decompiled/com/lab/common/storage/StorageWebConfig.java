/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lab.common.storage.StorageProperties
 *  com.lab.common.storage.StorageWebConfig
 *  lombok.Generated
 *  org.springframework.context.annotation.Configuration
 *  org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
 *  org.springframework.web.servlet.config.annotation.WebMvcConfigurer
 */
package com.lab.common.storage;

import com.lab.common.storage.StorageProperties;
import lombok.Generated;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class StorageWebConfig
implements WebMvcConfigurer {
    private final StorageProperties props;

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String location = "file:" + this.props.getUploadDirAbsolute() + "/";
        registry.addResourceHandler(new String[]{this.props.getUrlPrefix() + "/**"}).addResourceLocations(new String[]{location}).setCachePeriod(Integer.valueOf(3600));
    }

    @Generated
    public StorageWebConfig(StorageProperties props) {
        this.props = props;
    }
}

