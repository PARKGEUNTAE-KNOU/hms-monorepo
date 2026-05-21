package app.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Map;

@Component
public class JwtTokenProvider {

    @Value("${app.jwt.secret}")
    private String jwtSecret;

    @Value("${app.jwt.expiration-ms:43200000}")
    private long jwtExpirationMs;

    @Value("${app.jwt.refresh-expiration-ms:1209600000}")
    private long refreshExpirationMs;

    private SecretKey signingKey;

    @PostConstruct
    public void init() {
        this.signingKey = Keys.hmacShaKeyFor(jwtSecret.getBytes(StandardCharsets.UTF_8));
    }

    public String createToken(String username, Map<String, Object> claims) {
        return createToken(username, claims, jwtExpirationMs);
    }

    public String createRefreshToken(String username, Map<String, Object> claims) {
        return createToken(username, claims, refreshExpirationMs);
    }

    public String createToken(String username, Map<String, Object> claims, long expirationMs) {
        Date now = new Date();
        Date expiry = new Date(now.getTime() + expirationMs);

        JwtBuilder builder = Jwts.builder()
                .subject(username)
                .issuedAt(now)
                .expiration(expiry)
                .signWith(signingKey);

        if (claims != null) {
            claims.forEach(builder::claim);
        }

        return builder.compact();
    }

    public Claims parseClaims(String token) {
        return Jwts.parser()
                .verifyWith(signingKey)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }

    public boolean isValid(String token) {
        try {
            parseClaims(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public long getExpirationSeconds() {
        return jwtExpirationMs / 1000;
    }

    public long getRefreshExpirationSeconds() {
        return refreshExpirationMs / 1000;
    }
}
