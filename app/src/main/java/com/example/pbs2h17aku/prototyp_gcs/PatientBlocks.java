package com.example.pbs2h17aku.prototyp_gcs;

/**
 * Created by pbs2h17asc on 04.12.2018.
 */
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class PatientBlocks {
    public static final List<String> listVisual = Collections.unmodifiableList(
            new ArrayList<String>() {{
                add("Der Patient öffnet die Augen nicht, ");
                add("Der Patient öffnet die Augen auf Schmerzreiz, ");
                add("Der Patient öffnet die Augen auf Aufforderung, ");
                add("Der Patient öffnet die Augen spontan, ");
            }});

    public static final List<String> listVerbal = Collections.unmodifiableList(
            new ArrayList<String>() {{
                add("zeigt keine verbale Reaktion ");
                add("gibt unverständliche Laute von sich ");
                add("sagt unzusammenhängende Worte ");
                add("ist konversationsfähig, jedoch desorientiert ");
                add("ist konversationsfähig und orientiert ");
            }});

    public static final List<String> listMotor = Collections.unmodifiableList(
            new ArrayList<String>() {{
                add(" und zeigt keine Reaktion auf Schmerzreize.");
                add(" und reagiert auf Schmerz mit Strecksynergismen.");
                add(" und reagiert auf Schmerz mit Beugesynergismen.");
                add(" und wehrt Schmerz ungezielt ab.");
                add(" und wehrt Schmerz gezielt ab.");
                add(" und befolgt Aufforderungen motorisch.");
            }});
}
