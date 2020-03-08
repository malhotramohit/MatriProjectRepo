package com.matri.Matri.security.captcha;

import com.matri.Matri.security.exception.ReCaptchaInvalidException;

public interface ICaptchaService {
    void processResponse(final String response) throws ReCaptchaInvalidException;

    String getReCaptchaSite();

    String getReCaptchaSecret();
}
