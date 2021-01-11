package com.example.medidorfortaleza;

public class ValidationModel {
    private int min;
    private int med;
    private int max;
    private String color;
    private String textoColor;

    public String getTextoColor() {
        return textoColor;
    }

    public String valuesLength(String values) {
        if (values.length() < 5) {
            this.textoColor = "débil";
            return "#FF0000";
        }
        if (values.length() >= 5) {
            if (values.equals(values.toLowerCase())) {
                this.textoColor = "medio";
                return "#FFFF00";
            } else {
            }
            this.textoColor = "fuerte";
            return "#00FF00";

        }
             else{
                 return "";
            }

        }
    }
