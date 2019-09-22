package ru.MaximBorisov.Lesson6;

/**
 * дочерний класс для человека People - Patient.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 16.09.2019
 */
public class Patient extends People {
    /**
     * конструктор для пациента.
     *
     * @param name      имя
     * @param diagnosis диагноз
     */
    public Patient(String name, String diagnosis) {
        super(name);
        this.diagnosis = diagnosis;
    }

    /**
     * метод получения диагноза пациента.
     *
     * @return
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * диагноз пациента.
     */
    private String diagnosis;
}
