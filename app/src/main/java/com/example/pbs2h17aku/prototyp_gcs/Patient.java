package com.example.pbs2h17aku.prototyp_gcs;

import android.nfc.Tag;
import android.util.Log;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by pbs2h17asc on 27.11.2018.
 */

public class Patient {

    String visualReaction;
    String verbalReaction;
    String physicalReaction;
    int value;

    public Patient(List<String> cases) {
        this.visualReaction = cases.get(0);
        this.verbalReaction = cases.get(1);
        this.physicalReaction = cases.get(2);

        this.value = 0;
        this.value += PatientBlocks.listVisual.indexOf(visualReaction);
        this.value += PatientBlocks.listVerbal.indexOf(verbalReaction);
        this.value += PatientBlocks.listMotor.indexOf(physicalReaction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(visualReaction).append(verbalReaction).append(physicalReaction);
        return sb.toString();
    }

    public int getGcsValue()
    {
        return this.value;
    }
}


