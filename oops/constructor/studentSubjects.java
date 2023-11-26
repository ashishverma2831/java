package oops.constructor;

public class studentSubjects {
    public static void main(String[] args) {
        subjects sub[] = new subjects[3];
        sub[0]=new subjects(123, "ashish verma", 99);
        sub[1]=new subjects(345, "sfnasnfa", 0);
        sub[2]=new subjects(687, "ashish ", 100);

        for (subjects subjects : sub) {
            System.out.println(subjects.toString());
        }
    }
}

class subjects{
    private int subjectId;
    private String name;
    private double maxMarks;
    private double marksObtain;

    public subjects(int subjectId,String name,double maxMarks){
        this.subjectId=subjectId;
        this.name=name;
        this.maxMarks=maxMarks;
    }

    public int getSubjectId(){
        return subjectId;
    }
    public String getName(){
        return name;
    }
    public double getMaxMarks(){
        return maxMarks;
    }
    public double getMarksObtain(){
        return marksObtain;
    }
    public void setMaxMarks(double maximumMarks){
        maxMarks=maximumMarks;
    }
    public void setMarksObtain(double marks){
        marksObtain=marks;
    }
    public String toString(){
        // return "\n Subject ID "+subjectId+"\n Name "+name+"\n Marks Obtain "+marksObtain+"\n Maximum Marks "+maxMarks;
        return "\n Subject ID "+subjectId+"\n Name "+name+"\n Maximum Marks "+maxMarks;

    }
}

// class student{
//     private int rollNo;
//     private String name;
//     private String department;
//     private String subject;

//     public int getRollNo(){
//         return rollNo;
//     }
//     public String getName(){
//         return name;
//     }
//     public String getDepartment(){
//         return department;
//     }
//     public String getSubject(){
//         return subject;
//     }
// }