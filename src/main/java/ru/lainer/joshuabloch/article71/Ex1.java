package ru.lainer.joshuabloch.article71;

public class Ex1 {
    /*
     Идеома двойной проверки для отложенной инициализации
     поля экземпляра
     */
    private volatile FieldType field;

    public FieldType getField() {
        FieldType result = field;
        if (result == null){
            synchronized (this){
                result = field;
                if (result == null){
                    field = result = computeFieldValue();
                }
            }
        }
        return result;
    }

    public FieldType computeFieldValue(){
        return new FieldType();
    }
}
