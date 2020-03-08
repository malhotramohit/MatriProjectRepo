package com.matri.Matri.security.config;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
