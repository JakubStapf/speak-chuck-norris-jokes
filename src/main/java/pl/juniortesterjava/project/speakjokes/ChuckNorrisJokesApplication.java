import pl.juniortesterjava.project.speakjokes.controller.ChuckNorrisJokesController;
import pl.juniortesterjava.project.speakjokes.api.chucknorrisjokes.ChuckNorrisJokesApiResponse;
import pl.juniortesterjava.project.speakjokes.service.ChuckNorrisJokesService;

public class ChuckNorrisJokesApplication {
    public static void main(String[] args) {
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService();
        ChuckNorrisJokesController chuckNorrisJokesController = new ChuckNorrisJokesController(chuckNorrisJokesService);

        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesController.randomJoke();
        String joke = chuckNorrisJokesApiResponse.getValue();

    }
}
