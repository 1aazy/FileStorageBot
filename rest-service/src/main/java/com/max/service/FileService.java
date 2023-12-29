package com.max.service;

import com.max.entity.AppDocument;
import com.max.entity.AppPhoto;

public interface FileService {
    AppDocument getDocument(String id);
    AppPhoto getPhoto(String id);
}
