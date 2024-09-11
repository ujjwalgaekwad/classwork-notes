public class arrays {
    public static void main(String[] args){
        //Arrays
        String[] names = new String[3];
        names[0] = "Ujjwal";
        names[1] = "Dhvanit";
        names[2] = "Riya";
        System.out.println(names[2]);

        //length
        System.out.println(names.length);

        //Arrays
        int[] marks = {97,75,78,96,43,34};
        System.out.println(marks[0]);
        //length
        System.out.println(marks.length);

        //2D Arrays
        int[][] finalMarks = {{97,75,78,96,43,34},{99,89,70,29,78,99}};
        System.out.println(finalMarks.length);
        System.out.println(finalMarks[0][5]); //first student first marks
        System.out.println(finalMarks[1][5]); //second student second marks
    }
}
