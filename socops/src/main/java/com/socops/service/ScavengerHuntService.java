package com.socops.service;

import com.socops.data.IcebreakerPrompts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Service for scavenger hunt game mode.
 * Provides shuffled list of prompts for checklist-based gameplay.
 */
public final class ScavengerHuntService {

    private ScavengerHuntService() {
        /* static helper — never instantiated */
    }

    /**
     * Return a shuffled list of all 24 icebreaker prompts for use in scavenger hunt mode.
     */
    public static List<String> getShuffledPrompts() {
        var shuffled = new ArrayList<>(IcebreakerPrompts.ALL_PROMPTS);
        Collections.shuffle(shuffled);
        return shuffled;
    }
}
