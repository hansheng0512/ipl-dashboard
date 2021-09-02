package ipldashboard.ipldashboard.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDate;

@Data
@Entity
public class Match {
    @javax.persistence.Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Id
    private String city;
    private LocalDate date;
    private String playerOfMatch;
    private String venue;
    private String team1;
    private String team2;
    private String tossWinner;
    private String tossDecision;
    private String matchWinner;
    private String resultMargin;
    private String result;
    private String umpire1;
    private String umpire2;
}
