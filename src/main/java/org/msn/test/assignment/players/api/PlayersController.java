package org.msn.test.assignment.players.api;

import io.swagger.annotations.ApiParam;
import org.msn.test.assignment.players.exception.NotFoundException;
import org.msn.test.assignment.players.model.PlayerDetails;
import org.msn.test.assignment.players.model.PlayerStatistics;
import org.msn.test.assignment.players.service.PlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class PlayersController {

    private final PlayersService playersService;

    public PlayersController(@Autowired PlayersService playersService) {
        this.playersService = playersService;
    }

    @RequestMapping(value = "/players", method = RequestMethod.GET)
    public List<PlayerStatistics> playersList() {
        return playersService.getPlayers();
    }

    @RequestMapping(value = "/player/{playerId}", method = RequestMethod.GET)
    public PlayerDetails playerById(@ApiParam(defaultValue = "0") @PathVariable long playerId) {
        return playersService.getPlayer(playerId);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleNotFoundError(NotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handleAll(Throwable e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
