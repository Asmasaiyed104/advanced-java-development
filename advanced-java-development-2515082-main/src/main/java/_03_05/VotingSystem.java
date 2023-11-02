package _03_05;

import java.util.LinkedHashMap;
import java.util.Map;

public class VotingSystem {

    private final LinkedHashMap<String, Integer> votes = new LinkedHashMap<>();

    public void vote(String contestant) {
        // If the contestant is already in the map, increment their vote count
        // If not, add them to the map with 1 vote
        votes.merge(contestant, 1, Integer::sum);
    }

    public LinkedHashMap<String, Integer> getVotes() {
        // Return the map with the contestants and their votes
        return votes;
    }

    // If you want to test the VotingSystem class
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();
        
        // Simulate voting
        system.vote("Contestant A");
        system.vote("Contestant B");
        system.vote("Contestant A");
        
        // Get the votes and print them
        LinkedHashMap<String, Integer> currentVotes = system.getVotes();
        for (Map.Entry<String, Integer> entry : currentVotes.entrySet()) {
            System.out.println(entry.getKey() + " has " + entry.getValue() + " vote(s).");
        }
    }
}
