package ru.lainer.joshuabloch.article71;

public class Ex3 {
    /*
      Идиома однократной проверки - может вызывать повторную инициализацию
     */
    private volatile FieldType field;

    public FieldType getField(){
        FieldType result = field;
        if (result == null){
            field = result = computeFieldValue();
        }
        return result;
    }

    public FieldType computeFieldValue(){
        return new FieldType();
    }
}
