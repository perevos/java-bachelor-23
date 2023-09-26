package lab2.service;

import lab2.model.ActionStatus;

/**
 * Интерфейс сервиса для студентов
 */
public interface StudentService {

    /**
     * Регистрация студента на курс. Регистрация возможна при следующих условиях:
     * - курс еще не начался;
     * - курс предназначен для категории данного студента (магистра/бакалавра);
     * - студент прошел все обязательные курсы, необходимые для посещения данного курса;
     * - в курсе есть свободные места.
     *
     * @param studentId идентификатор студента
     * @param courseId идентификатор курса, соответствующий CourseInstance.id
     * @return результат выполнения регистрации
     */
    ActionStatus subscribe(long studentId, long courseId);

    /**
     * Отмена регистрации студента на курс, которая возможна только в том случае, когда
     * курс еще не начался.
     *
     * @param studentId идентификатор студента
     * @param courseId идентификатор курса, соответствующий CourseInstance.id
     * @return результат выполнения отмены регистрации
     */
    ActionStatus unsubscribe(long studentId, long courseId);

    /**
     * @param studentId идентификатор студента
     * @return список всех курсов, на которые записан студент
     */
    CourseInstance[] findAllSubscriptionsByStudentId(long studentId);
    
}
