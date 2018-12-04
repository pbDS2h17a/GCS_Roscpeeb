package com.example.pbs2h17aku.prototyp_gcs;

/**
 * Created by pbs2h17asc on 04.12.2018.
 */

public class PatientRepository {
    PatientModel mPatientModel;
    Patient currentPatient;

    public PatientRepository() {
        mPatientModel = new PatientModel();
        currentPatient = mPatientModel.getRandomPatient();
    }

    public String getCurrentPatient() {
        return this.currentPatient.toString();
    }

    public String getRandomPatient() {
        this.currentPatient = mPatientModel.getRandomPatient();
        return this.currentPatient.toString();
    }

    public int getGcsValue() {
        return this.currentPatient.getGcsValue();
    }
}
