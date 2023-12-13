package pl.juniortesterjava.project.speakjokes.controller;

import pl.juniortesterjava.project.speakjokes.api.chucknorrisjokes.ChuckNorrisJokesApiResponse;
import pl.juniortesterjava.project.speakjokes.service.ChuckNorrisJokesService;

import java.util.logging.Logger;

public class ChuckNorrisJokesController {
    private static final Logger LOGGER = Logger.getLogger(ChuckNorrisJokesController.class.getName());

    private final ChuckNorrisJokesService chuckNorrisJokesService;

    public ChuckNorrisJokesController(ChuckNorrisJokesService chuckNorrisJokesService) {
        this.chuckNorrisJokesService = chuckNorrisJokesService;
    }
    public ChuckNorrisJokesApiResponse randomJoke() {
        LOGGER.info("randomJoke()");
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesService.randomJoke();
        LOGGER.info("randomJoke(...) = " + null);
        return chuckNorrisJokesApiResponse;
    }
}
