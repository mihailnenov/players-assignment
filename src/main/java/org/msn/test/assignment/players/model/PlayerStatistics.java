package org.msn.test.assignment.players.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.msn.test.assignment.players.util.JsonBigDecimalSerializer;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PlayerStatistics extends Player {

    private Integer ranking;

    private String name;

    private Long playerId;

    private String playedPositionsShort;

    @JsonSerialize(using = JsonBigDecimalSerializer.class)
    private BigDecimal passSuccess;

    private Integer minsPlayed;

    @JsonSerialize(using = JsonBigDecimalSerializer.class)
    private BigDecimal rating;

    private Integer goal;

    private Integer assistTotal;

    private Integer yellowCard;

    private Integer redCard;

    @JsonSerialize(using = JsonBigDecimalSerializer.class)
    private BigDecimal shotsPerGame;

    @JsonSerialize(using = JsonBigDecimalSerializer.class)
    private BigDecimal aerialWonPerGame;

    private Integer manOfTheMatch;

    public PlayerStatistics() {
        // needed for deserialization
    }

    public PlayerStatistics(Long playerId) {
        this.playerId = playerId;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getPlayedPositionsShort() {
        return playedPositionsShort;
    }

    public void setPlayedPositionsShort(String playedPositionsShort) {
        this.playedPositionsShort = playedPositionsShort;
    }

    public BigDecimal getPassSuccess() {
        return passSuccess;
    }

    public void setPassSuccess(BigDecimal passSuccess) {
        this.passSuccess = passSuccess;
    }

    public Integer getMinsPlayed() {
        return minsPlayed;
    }

    public void setMinsPlayed(Integer minsPlayed) {
        this.minsPlayed = minsPlayed;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public Integer getGoal() {
        return goal;
    }

    public void setGoal(Integer goal) {
        this.goal = goal;
    }

    public Integer getAssistTotal() {
        return assistTotal;
    }

    public void setAssistTotal(Integer assistTotal) {
        this.assistTotal = assistTotal;
    }

    public Integer getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(Integer yellowCard) {
        this.yellowCard = yellowCard;
    }

    public Integer getRedCard() {
        return redCard;
    }

    public void setRedCard(Integer redCard) {
        this.redCard = redCard;
    }

    public BigDecimal getShotsPerGame() {
        return shotsPerGame;
    }

    public void setShotsPerGame(BigDecimal shotsPerGame) {
        this.shotsPerGame = shotsPerGame;
    }

    public BigDecimal getAerialWonPerGame() {
        return aerialWonPerGame;
    }

    public void setAerialWonPerGame(BigDecimal aerialWonPerGame) {
        this.aerialWonPerGame = aerialWonPerGame;
    }

    public Integer getManOfTheMatch() {
        return manOfTheMatch;
    }

    public void setManOfTheMatch(Integer manOfTheMatch) {
        this.manOfTheMatch = manOfTheMatch;
    }
}
