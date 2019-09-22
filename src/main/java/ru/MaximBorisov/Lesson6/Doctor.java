package ru.MaximBorisov.Lesson6;

/**
 * дочерний класс для человека People - Doctor.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 16.09.2019
 */
public class Doctor extends People {
    /**
     * диплом интренатуры.
     */
    private String internshipDiploma;


    /**
     * диплом университета.
     */
    private String universityDiploma;

    /**
     * специальность.
     */
    private String specialty;
    /**
     * наличие ученой степени.
     */
    private boolean scienseDegree;

    /**
     * конструктор.
     *
     * @param name              имя
     * @param universityDiploma диплом университета
     * @param internshipDiploma диплом интернатуры
     * @param specialty         специальность
     * @param scienseDegree     научная степень
     */
    public Doctor(String name, String universityDiploma, String internshipDiploma, String specialty, boolean scienseDegree) {
        super(name);
        this.universityDiploma = universityDiploma;
        this.internshipDiploma = internshipDiploma;
        this.specialty = specialty;
        this.scienseDegree = scienseDegree;
    }

    /**
     * метод получения сосояния наличия ученой степени.
     *
     * @return scienseDegree научная степень
     */
    public boolean isScienseDegree() {
        return this.scienseDegree;
    }

    /**
     * метод получения университетского диплома.
     *
     * @return universityDiploma университетский диплом
     */
    public String getUniversityDiploma() {
        return universityDiploma;
    }

    /**
     * метод получения диплома интернатуры.
     *
     * @return internshipDiploma диплом интернатуры
     */
    public String getInternshipDiploma() {
        return this.internshipDiploma;
    }

    /**
     * метод получения специальности.
     *
     * @return specialty специальность
     */
    public String getSpecialty() {
        return this.specialty;
    }

    /**
     * метод доктор лечит человека.
     *
     * @param people человек объект
     */
    public void healPeople(People people) {
        System.out.println("доктор " + this.getName() + " лечит " + people.getName());
    }

}