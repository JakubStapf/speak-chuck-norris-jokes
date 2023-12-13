package pl.juniortesterjava.project.speakjokes.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.juniortesterjava.project.speakjokes.api.chucknorrisjokes.ChuckNorrisJokesApiResponse;
import pl.juniortesterjava.project.speakjokes.service.ChuckNorrisJokesService;

class ChuckNorrisJokesControllerTest {

    @Test
    void randomJoke() {
        // given
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService();
        ChuckNorrisJokesController chuckNorrisJokesController = new ChuckNorrisJokesController(chuckNorrisJokesService);

        // when
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesController.randomJoke();

        // then
        Assertions.assertNotNull(chuckNorrisJokesApiResponse, "response is NULL");
    }
}