package org.msn.test.assignment.players.util;

import org.msn.test.assignment.players.model.PlayerDetails;
import org.msn.test.assignment.players.model.PlayerStatistics;

public class PlayerConvertor {

    private PlayerConvertor() {
        // To prevent instantiation of this utility class
    }

    public static PlayerStatistics playerStatisticsFromPlayerDetails(PlayerDetails player) {

        PlayerStatistics playerStatistics = new PlayerStatistics(player.getPlayerId());

        playerStatistics.setAerialWonPerGame(player.getAerialWonPerGame());
        playerStatistics.setAssistTotal(player.getAssistTotal());
        playerStatistics.setGoal(player.getGoal());
        playerStatistics.setManOfTheMatch(player.getManOfTheMatchCount());
        playerStatistics.setMinsPlayed(player.getMinsPlayed());
        playerStatistics.setName(player.getName());
        playerStatistics.setRanking(player.getRanking());
        playerStatistics.setRating(player.getRating());
        playerStatistics.setRedCard(player.getRedCard());
        playerStatistics.setShotsPerGame(player.getShotsPerGame());
        playerStatistics.setPassSuccess(player.getPassSuccess());
        playerStatistics.setYellowCard(player.getYellowCard());
        playerStatistics.setPlayedPositionsShort(player.getPlayedPositionsShort());

        return playerStatistics;
    }
}
