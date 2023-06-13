public class Activity_3 {
    public static void number_check() {
        Act3_Pos_Neg obj = new Act3_Pos_Neg();
        obj.checker();
    }

    public static void grade_check() {
        Act3_Grading_System gradingSystem = new Act3_Grading_System();
        gradingSystem.calculateGrades();
    }

    public static void main(String[] args){
        grade_check();
        number_check();
    }

}
