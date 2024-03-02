package ru.lainer.joshuabloch.article71;

public class Ex2 {
    /*
     Идеома отложенной инициализации класса для статического поля
     */
    private static class FieldHolder {
        static final  FieldType field = computeFieldValue ();
    }

    public static FieldType computeFieldValue(){
        return new FieldType();
    }

    public static FieldType getField(){
        return FieldHolder.field;
    }
}
