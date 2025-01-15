package com.kh.totalproject.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TokenResponse {
    private String grantType;
    private String accessToken; // Access Token
    private Long accessTokenExpiresIn; // Access Token 만기일
    private String refreshToken; // Refresh Token
    private Long refreshTokenExpiresIn; // Refresh Token 만기일
    private boolean isNewUser;  // 신규 사용자 여부 추가

}
