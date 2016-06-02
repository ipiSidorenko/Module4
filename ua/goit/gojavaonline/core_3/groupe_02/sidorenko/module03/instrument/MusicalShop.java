package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module03.instrument;

import java.util.List;

public class MusicalShop {
    private List<MusicalInstrument> musicalInstruments;
    private int item;

    public List<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(List<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    public void addMusicalInstrument(MusicalInstrument musicalInstrument) {
        this.musicalInstruments.add(musicalInstrument);
    }

}