import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Csvfiles {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.csv");
		
		PrintWriter f1=new PrintWriter(f);
		StringBuilder st=new StringBuilder();
		st.append("id");
        st.append('\t');
        st.append("Name");
        st.append('\t');
        st.append("Path");
        st.append('\n');
		    st.append("1");
		    st.append('\t');
            st.append("abc.csv");
            st.append('\t');
            st.append("C:\\Users\\My Pc\\Desktop\\Assignments\\Collections_1_Iterator_and_Lists\\abc.csv");
            st.append("\n");
            st.append("2");
		    st.append('\t');
            st.append("ab.csv");
            st.append('\t');
            st.append("C:\\Users\\My Pc\\Desktop\\Assignments\\Collections_1_Iterator_and_Lists\\ab.csv");
            st.append("\n");
            st.append("3");
		    st.append('\t');
            st.append("a.csv");
            st.append('\t');
            st.append("C:\\Users\\My Pc\\Desktop\\Assignments\\Collections_1_Iterator_and_Lists\\a.csv");
            st.append("\n");
            f1.write(st.toString());
            f1.close();
            
	}

}