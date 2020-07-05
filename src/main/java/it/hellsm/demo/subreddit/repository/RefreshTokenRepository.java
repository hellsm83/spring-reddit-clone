package it.hellsm.demo.subreddit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.hellsm.demo.subreddit.model.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    void deleteByToken(String token);
}
