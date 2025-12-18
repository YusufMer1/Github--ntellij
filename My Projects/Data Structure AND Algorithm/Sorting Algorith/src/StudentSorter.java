public class StudentSorter {
    boolean byGrade;
    public void InsertionSort(Student[] st,boolean byGrade){
        for(int i = 1;i<st.length;i++){
            Student key = st[i];
            int j = i -1;

            if(byGrade){
                while(j>=0 && key.grade < st[j].grade){
                    st[j+1] = st[j];
                    j--;
                }
            }
            else{
                while(j>=0 && key.studentID < st[j].studentID){
                    st[j+1] = st[j];
                    j--;
                }
            }
            st[j+1] = key;

        }
    }
}
