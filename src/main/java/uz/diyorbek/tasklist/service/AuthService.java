package uz.diyorbek.tasklist.service;

import uz.diyorbek.tasklist.web.dto.auth.JwtRequest;
import uz.diyorbek.tasklist.web.dto.auth.JwtResponse;

public interface AuthService {
    JwtResponse login(JwtRequest loginRequest);
    JwtResponse refresh(String refreshToken);

}
