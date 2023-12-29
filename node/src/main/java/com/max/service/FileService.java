package com.max.service;

import com.max.entity.AppDocument;
import com.max.service.enums.LinkType;
import org.telegram.telegrambots.meta.api.objects.Message;
import com.max.entity.AppPhoto;

public interface FileService {
    AppDocument processDoc(Message telegramMessage);
    AppPhoto processPhoto(Message telegramMessage);
    String generateLink(Long docId, LinkType linkType);
}
