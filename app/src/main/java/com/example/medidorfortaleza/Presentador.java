package com.example.medidorfortaleza;

public class Presentador {
    private ValidationModel validationModel;
    private IPresentador iPresentador;

    public Presentador(IPresentador iPresentador) {

        this.validationModel = new ValidationModel();
        this.iPresentador = iPresentador;
    }

    public void levelSecurity(String password){
        validationModel.valuesLength(password);
        validationModel.getTextoColor();


    }
}
