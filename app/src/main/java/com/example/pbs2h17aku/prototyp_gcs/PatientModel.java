package com.example.pbs2h17aku.prototyp_gcs;

/**
 * Created by pbs2h17asc on 04.12.2018.
 */
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PatientModel {

    private final Random RANDOM = new Random();
    private final List<List<String>> mPatientLists;

    public PatientModel() {
        List<List<String>> listOfCases = new ArrayList<>();
        listOfCases.add(PatientBlocks.listVisual);
        listOfCases.add(PatientBlocks.listVerbal);
        listOfCases.add(PatientBlocks.listMotor);

        this.mPatientLists = Collections.unmodifiableList(listOfCases);
    }

    private Patient getPatient(int[] indices) {
        //Fehlerbehandlung missing
        List<String> cases = new ArrayList<String>();

        for (int i = 0; i < mPatientLists.size(); i++) {
            cases.add(mPatientLists.get(i).get(indices[i]));
        }

        //Konstruktor fehlt
        return new Patient(cases);
    }

    public Patient getRandomPatient() {

        int[] randomIndices = new int[mPatientLists.size()];

        for (int i = 0; i < randomIndices.length; i++) {
            randomIndices[i] = RANDOM.nextInt(mPatientLists.get(i).size());
        }

        return getPatient(randomIndices);
    }
}
