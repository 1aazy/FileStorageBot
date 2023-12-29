package com.max.service;

import com.max.dto.MailParams;

public interface MailSenderService {
    void send(MailParams mailParams);
}
