package com.example.medidorfortaleza;

public class ValidationModel {
    private int min;
    private int med;
    private int max;

    public String getColor() {
        return color;
    }

    private String color;
    private String textoColor;



    public String getTextoColor() {
        return textoColor;
    }

    public void valuesLength(String values) {
        if (values.length() < 5) {
            this.textoColor = "Contraseña débil";
            this.color = "#FF0000";
        }
        if (values.length() >= 5) {
            if (values.equals(values.toLowerCase())) {
                this.textoColor = "Contraseña medio";
                this.color = "#FFFF00";
            } else {
            }
            this.textoColor = "Contraseña fuerte";
            this.color = "#00FF00";

        }


        }
    }
