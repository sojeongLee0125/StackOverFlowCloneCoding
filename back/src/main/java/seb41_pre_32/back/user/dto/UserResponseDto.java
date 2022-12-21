package seb41_pre_32.back.user.dto;

import lombok.Builder;
import lombok.Getter;
import seb41_pre_32.back.user.domain.Role;
import seb41_pre_32.back.user.domain.User;

@Getter
public class UserResponseDto {

    private Long id;
    private String loginId;
    private String username;
    private String email;
    private String profileUrl;
    private int reputation;
    private String location;
    private Role role;

    private UserResponseDto() {
    }

    @Builder
    public UserResponseDto(final Long id,
                           final String loginId,
                           final String username,
                           final String email,
                           final String profileUrl,
                           final int reputation,
                           final String location,
                           final Role role) {
        this.id = id;
        this.loginId = loginId;
        this.username = username;
        this.email = email;
        this.profileUrl = profileUrl;
        this.reputation = reputation;
        this.location = location;
        this.role = role;
    }

    public static UserResponseDto of(final User user){
        return UserResponseDto.builder()
                .id(user.getId())
                .loginId(user.getLoginId())
                .username(user.getUsername())
                .email(user.getEmail())
                .profileUrl(user.getProfileUrl())
                .reputation(user.getReputation())
                .location(user.getLocation())
                .role(user.getRole())
                .build();
    }
}
