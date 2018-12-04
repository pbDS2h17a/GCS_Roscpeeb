package com.example.pbs2h17aku.prototyp_gcs;

/**
 * Created by pbs2h17asc on 04.12.2018.
 */
import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

public class TrainingActivityViewModel extends Object {
        private PatientRepository repository;

        public TrainingActivityViewModel(@NonNull Application application) {
            super(application);
            repository = new PatientRepository();
        }

        public String getCurrentPatient() {
            return repository.getCurrentPatient();
        }

        public String getRandomPatient() {
            return repository.getRandomPatient();
        }

    public int getGcsValue() {
        return this.repository.getGcsValue();
    }
}
