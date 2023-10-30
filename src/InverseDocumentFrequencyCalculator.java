import java.util.Collection;
import java.util.TreeMap;

public class InverseDocumentFrequencyCalculator implements IInverseFreq {

    @Override
    public TreeMap<String, Double> getInverseDocumentFrequency(TreeMap<String, String> songLyrics) {
        TreeMap<String, Double> result = new TreeMap<String, Double> ();
        
        for(String songTitle: songLyrics.keySet())
        {
            // current lyrics
            String lyric = songLyrics.get(songTitle);
            String[] words = lyric.split(" ");
            
            // Calculate the Inverse Document Frequency (IDF) Values here
            // You might need to introduce other methods and additional variables
            
            // IDF for term X is calculated as log of N/T where N is total number of songs
            // and T is the number of songs having term X
            
            ////////////////////////////
            // Creator: Samuel Fickett
            final double SONGS = songLyrics.keySet().size(); //"N" from N/T
            /*
             * These for loops cycle through all of the words,
             * looking through each song to check if the desired word 
             * is in the current song. A counter is added to for each occurance.
             */
            for (int i = 0; i < words.length; ++i) {
            	int totSongs = 0;
            	for (String title: songLyrics.keySet()) {
            		if (songLyrics.get(title).contains(words[i])) {
            			++totSongs; // "T" from N/T
            		}
            	}
            	result.put(words[i], Math.log10(SONGS/totSongs));
            }
            //////////////////////////
        }
        return result;
    }
}
