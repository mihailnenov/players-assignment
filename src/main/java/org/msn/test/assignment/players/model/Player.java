package org.msn.test.assignment.players.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Player {

    Integer ranking;

    String name;

    Long playerId;

    Boolean isManOfTheMatch;

    String playedPositionsShort;

    Float passSuccess;

    public Player() {
        // needed for deserialization
    }

    public Player(Long playerId) {
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

    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public Boolean getManOfTheMatch() {
        return isManOfTheMatch;
    }

    public void setManOfTheMatch(Boolean manOfTheMatch) {
        isManOfTheMatch = manOfTheMatch;
    }

    public String getPlayedPositionsShort() {
        return playedPositionsShort;
    }

    public void setPlayedPositionsShort(String playedPositionsShort) {
        this.playedPositionsShort = playedPositionsShort;
    }

    public Float getPassSuccess() {
        return passSuccess;
    }

    public void setPassSuccess(Float passSuccess) {
        this.passSuccess = passSuccess;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(playerId, player.playerId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(playerId)
                .toHashCode();
    }

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public static class Statistics {

        Integer minsPlayed;

        Float rating;

        Integer goal;

        Integer assistTotal;

        Integer yellowCard;

        Integer redCard;

        Float shotsPerGame;

        Float aerialWonPerGame;

        Integer manOfTheMatch;

        public Integer getMinsPlayed() {
            return minsPlayed;
        }

        public void setMinsPlayed(Integer minsPlayed) {
            this.minsPlayed = minsPlayed;
        }

        public Float getRating() {
            return rating;
        }

        public void setRating(Float rating) {
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

        public Float getShotsPerGame() {
            return shotsPerGame;
        }

        public void setShotsPerGame(Float shotsPerGame) {
            this.shotsPerGame = shotsPerGame;
        }

        public Float getAerialWonPerGame() {
            return aerialWonPerGame;
        }

        public void setAerialWonPerGame(Float aerialWonPerGame) {
            this.aerialWonPerGame = aerialWonPerGame;
        }

        public Integer getManOfTheMatch() {
            return manOfTheMatch;
        }

        public void setManOfTheMatch(Integer manOfTheMatch) {
            this.manOfTheMatch = manOfTheMatch;
        }
    }

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public static class Details {

        String firstName;

        String lastName;

        Long seasonId;

        String seasonName;

        Long tournamentId;

        Long tournamentRegionId;

        String tournamentRegionCode;

        String regionCode;

        String tournamentName;

        String tournamentShortName;

        Boolean isActive;

        Boolean isOpta;

        Long teamId;

        String teamName;

        String playedPositions;

        Integer age;

        Integer height;

        Integer weight;

        String positionText;

        Long apps;

        Integer subOn;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Long getSeasonId() {
            return seasonId;
        }

        public void setSeasonId(Long seasonId) {
            this.seasonId = seasonId;
        }

        public String getSeasonName() {
            return seasonName;
        }

        public void setSeasonName(String seasonName) {
            this.seasonName = seasonName;
        }

        public Long getTournamentId() {
            return tournamentId;
        }

        public void setTournamentId(Long tournamentId) {
            this.tournamentId = tournamentId;
        }

        public Long getTournamentRegionId() {
            return tournamentRegionId;
        }

        public void setTournamentRegionId(Long tournamentRegionId) {
            this.tournamentRegionId = tournamentRegionId;
        }

        public String getTournamentRegionCode() {
            return tournamentRegionCode;
        }

        public void setTournamentRegionCode(String tournamentRegionCode) {
            this.tournamentRegionCode = tournamentRegionCode;
        }

        public String getRegionCode() {
            return regionCode;
        }

        public void setRegionCode(String regionCode) {
            this.regionCode = regionCode;
        }

        public String getTournamentName() {
            return tournamentName;
        }

        public void setTournamentName(String tournamentName) {
            this.tournamentName = tournamentName;
        }

        public String getTournamentShortName() {
            return tournamentShortName;
        }

        public void setTournamentShortName(String tournamentShortName) {
            this.tournamentShortName = tournamentShortName;
        }

        public Boolean getActive() {
            return isActive;
        }

        public void setActive(Boolean active) {
            isActive = active;
        }

        public Boolean getOpta() {
            return isOpta;
        }

        public void setOpta(Boolean opta) {
            isOpta = opta;
        }

        public Long getTeamId() {
            return teamId;
        }

        public void setTeamId(Long teamId) {
            this.teamId = teamId;
        }

        public String getTeamName() {
            return teamName;
        }

        public void setTeamName(String teamName) {
            this.teamName = teamName;
        }

        public String getPlayedPositions() {
            return playedPositions;
        }

        public void setPlayedPositions(String playedPositions) {
            this.playedPositions = playedPositions;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getPositionText() {
            return positionText;
        }

        public void setPositionText(String positionText) {
            this.positionText = positionText;
        }

        public Long getApps() {
            return apps;
        }

        public void setApps(Long apps) {
            this.apps = apps;
        }

        public Integer getSubOn() {
            return subOn;
        }

        public void setSubOn(Integer subOn) {
            this.subOn = subOn;
        }
    }
}
