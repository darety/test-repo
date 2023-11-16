package org.olukotun;

public class SpeakerFactory {
    public static Speakers getSpeaker(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("SONY")) {
            return new SonarSpeaker();
        }
        if (type.equalsIgnoreCase("BOSE")) {
            return new BoseSpeakers();
        }
        return null;
    }
}
