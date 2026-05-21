package app.auth.common.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "AUTH_USER", schema = "CMH")
public class AuthAccount {

    @Id
    @Column(name = "ID", nullable = false, length = 20)
    private String id;

    // DB schema uses LOGIN_ID instead of USERNAME.
    @Column(name = "LOGIN_ID", nullable = false, length = 50)
    private String username;

    @Transient
    private String fullName;

    @Column(name = "ROLE_CODE", nullable = false, length = 50)
    private String role;

    @Column(name = "PASSWORD_HASH", nullable = false, length = 100)
    private String passwordHash;

    // DB has ACCOUNT_STATUS; profile/status is still enriched from JCH.EMPLOYEE.
    @Column(name = "ACCOUNT_STATUS")
    private String status;

    public AuthAccount(String id,
                       String username,
                       String role,
                       String passwordHash) {
        this.id = id;
        this.username = username;
        this.role = role;
        this.passwordHash = passwordHash;
    }
}
