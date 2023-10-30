import java.io.IOException;
/*
@Author Jere Perisic
@version October 30, 2023
 */
public class lab6 {
    public static void main(String[] args) throws IOException {
        String path_to_directory = "Queen";
        LyricsReader LR = new LyricsReader(path_to_directory);
        TermFrequencyCalculator TFC = new TermFrequencyCalculator();
        InverseDocumentFrequencyCalculator IDFC = new InverseDocumentFrequencyCalculator();
        SearchEngine SE = new SearchEngine(LR, TFC, IDFC);

        String input = "All we hear is";


        }

    }
}