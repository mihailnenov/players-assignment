package org.msn.test.assignment.players.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import net.sf.jsefa.csv.annotation.CsvDataType;
import net.sf.jsefa.csv.annotation.CsvField;
import org.msn.test.assignment.players.util.JsonBigDecimalSerializer;

import java.math.BigDecimal;

@CsvDataType
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PlayerDetails extends Player {

    // ranking,seasonId,seasonName,tournamentId,tournamentRegionId,tournamentRegionCode,regionCode,tournamentName,
    // tournamentShortName,firstName,lastName,playerId,isActive,isOpta,teamId,teamName,playedPositions,age,height,
    // weight,positionText,apps,subOn,minsPlayed,rating,goal,assistTotal,yellowCard,redCard,shotsPerGame,
    // aerialWonPerGame,manOfTheMatchCount,name,isManOfTheMatch,playedPositionsShort,passSuccess

    @CsvField(pos = 1)
    private Integer ranking;

    @CsvField(pos = 2)
    private Long seasonId;

    @CsvField(pos = 3)
    private String seasonName;

    @CsvField(pos = 4)
    private Long tournamentId;

    @CsvField(pos = 5)
    private Long tournamentRegionId;

    @CsvField(pos = 6)
    private String tournamentRegionCode;

    @CsvField(pos = 7)
    private String regionCode;

    @CsvField(pos = 8)
    private String tournamentName;

    @CsvField(pos = 9)
    private String tournamentShortName;

    @CsvField(pos = 10)
    private String firstName;

    @CsvField(pos = 11)
    private String lastName;

    @CsvField(pos = 12)
    private Long playerId;

    @CsvField(pos = 13)
    private Boolean isActive;

    @CsvField(pos = 14)
    private Boolean isOpta;

    @CsvField(pos = 15)
    private Long teamId;

    @CsvField(pos = 16)
    private String teamName;

    @CsvField(pos = 17)
    private String playedPositions;

    @CsvField(pos = 18)
    private Integer age;

    @CsvField(pos = 19)
    private Integer height;

    @CsvField(pos = 20)
    private Integer weight;

    @CsvField(pos = 21)
    private String positionText;

    @CsvField(pos = 22)
    private Long apps;

    @CsvField(pos = 23)
    private Integer subOn;

    @CsvField(pos = 24)
    private Integer minsPlayed;

    @CsvField(pos = 25)
    @JsonSerialize(using = JsonBigDecimalSerializer.class)
    private BigDecimal rating;

    @CsvField(pos = 26)
    private Integer goal;

    @CsvField(pos = 27)
    private Integer assistTotal;

    @CsvField(pos = 28)
    private Integer yellowCard;

    @CsvField(pos = 29)
    private Integer redCard;

    @CsvField(pos = 30)
    @JsonSerialize(using = JsonBigDecimalSerializer.class)
    private BigDecimal shotsPerGame;

    @CsvField(pos = 31)
    @JsonSerialize(using = JsonBigDecimalSerializer.class)
    private BigDecimal aerialWonPerGame;

    @CsvField(pos = 32)
    private Integer manOfTheMatchCount;

    @CsvField(pos = 33)
    private String name;

    @CsvField(pos = 34)
    private Boolean isManOfTheMatch;

    @CsvField(pos = 35)
    private String playedPositionsShort;

    @CsvField(pos = 36)
    @JsonSerialize(using = JsonBigDecimalSerializer.class)
    private BigDecimal passSuccess;

    public PlayerDetails() {
        // needed for deserialization
    }

    public PlayerDetails(Long playerId) {
        this.playerId = playerId;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
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

    @Override
    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
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

    public Integer getManOfTheMatchCount() {
        return manOfTheMatchCount;
    }

    public void setManOfTheMatchCount(Integer manOfTheMatchCount) {
        this.manOfTheMatchCount = manOfTheMatchCount;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getManOfTheMatch() {
        return isManOfTheMatch;
    }

    public void setManOfTheMatch(Boolean manOfTheMatch) {
        isManOfTheMatch = manOfTheMatch;
    }
}
