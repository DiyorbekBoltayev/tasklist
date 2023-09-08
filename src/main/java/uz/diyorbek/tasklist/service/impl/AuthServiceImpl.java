package uz.diyorbek.tasklist.service.impl;

import org.springframework.stereotype.Service;
import uz.diyorbek.tasklist.service.AuthService;
import uz.diyorbek.tasklist.web.dto.auth.JwtRequest;
import uz.diyorbek.tasklist.web.dto.auth.JwtResponse;
@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
