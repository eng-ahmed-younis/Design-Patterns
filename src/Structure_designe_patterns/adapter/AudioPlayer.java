package Structure_designe_patterns.adapter;

//AudioPlayer can play mp3 format audio files by default.
/** AudioPlayer uses the adapter class MediaAdapter passing it the desired audio type
 *  without knowing the actual class which can play the desired format.
 * AdapterPatternDemo, our demo class will use AudioPlayer class to play various formats.
 * */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        //inbuilt support to play mp3 music files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        else{
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}