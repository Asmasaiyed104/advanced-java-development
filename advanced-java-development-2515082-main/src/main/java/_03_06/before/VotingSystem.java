package _03_06.before;

import java.util.LinkedHashMap;

public class VotingSystem {

    private LinkedHashMap<String, Integer> votes = new LinkedHashMap<>();

    void vote(String contestant) {
        // If the contestant is not in the map, this puts them with 1 vote.
        // If they are already there, it increments their current number of votes by one.
        votes.merge(contestant, 1, Integer::sum);
    }

    // This method now specifies the return type with generic type parameters.
    public LinkedHashMap<String, Integer> getVotes() {
        return votes;
    }

    // Optionally, if you want to ensure that the LinkedHashMap cannot be modified,
    // you can return an unmodifiable view of the map.
    public LinkedHashMap<String, Integer> getUnmodifiableVotes() {
        return new LinkedHashMap<>(votes);
    }
}
