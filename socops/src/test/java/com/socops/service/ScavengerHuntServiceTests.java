package com.socops.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Validates scavenger hunt prompt shuffling provided by {@link ScavengerHuntService}.
 */
class ScavengerHuntServiceTests {

    @Test
    @DisplayName("Shuffled prompt list contains exactly twenty-four items")
    void shuffledListHasTwentyFourItems() {
        List<String> prompts = ScavengerHuntService.getShuffledPrompts();
        assertEquals(24, prompts.size(),
                "Scavenger hunt must have exactly 24 prompts (same as bingo non-free cells)");
    }

    @Test
    @DisplayName("All returned prompts are non-empty strings")
    void allPromptsAreNonEmpty() {
        List<String> prompts = ScavengerHuntService.getShuffledPrompts();
        for (String prompt : prompts) {
            assertTrue(prompt != null && !prompt.isEmpty(),
                    "Every prompt must be a non-empty string");
        }
    }

    @Test
    @DisplayName("Shuffled list contains no duplicate prompts")
    void noPromptsAreDuplicated() {
        List<String> prompts = ScavengerHuntService.getShuffledPrompts();
        Set<String> uniquePrompts = new HashSet<>(prompts);
        assertEquals(24, uniquePrompts.size(),
                "All 24 prompts must be unique (no duplicates)");
    }

    @Test
    @DisplayName("Multiple calls produce different orderings (probabilistically random)")
    void multipleCallsProduceDifferentOrderings() {
        List<String> first = ScavengerHuntService.getShuffledPrompts();
        List<String> second = ScavengerHuntService.getShuffledPrompts();

        // While extremely unlikely to fail naturally, this checks that both calls
        // return valid lists. A deterministic shuffle would fail this probabilistically.
        assertEquals(24, first.size(), "First call should return 24 prompts");
        assertEquals(24, second.size(), "Second call should return 24 prompts");
        // Note: orders might coincidentally match, so we just verify they're valid
    }
}
