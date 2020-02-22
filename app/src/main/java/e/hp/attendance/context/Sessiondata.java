package e.hp.attendance.context;

import android.app.Application;

import java.util.ArrayList;

import e.hp.attendance.bean.AttendanceBean;
import e.hp.attendance.bean.AttendanceSessionBean;
import e.hp.attendance.bean.FacultyBean;
import e.hp.attendance.bean.StudentBean;

public class Sessiondata extends Application {
    private FacultyBean facultyBean;
    private AttendanceSessionBean attendanceSessionBean;
    private ArrayList<StudentBean> studentBeanList;
    private ArrayList<AttendanceBean> attendanceBeanList;

    public FacultyBean getFacultyBean() {
        return facultyBean;
    }

    public void setFacultyBean(FacultyBean facultyBean) {
        this.facultyBean = facultyBean;
    }

    public AttendanceSessionBean getAttendanceSessionBean() {
        return attendanceSessionBean;
    }

    public void setAttendanceSessionBean(AttendanceSessionBean attendanceSessionBean) {
        this.attendanceSessionBean = attendanceSessionBean;
    }

    public ArrayList<StudentBean> getStudentBeanList() {
        return studentBeanList;
    }

    public void setStudentBeanList(ArrayList<StudentBean> studentBeanList) {
        this.studentBeanList = studentBeanList;
    }

    public ArrayList<AttendanceBean> getAttendanceBeanList() {
        return attendanceBeanList;
    }

    public void setAttendanceBeanList(ArrayList<AttendanceBean> attendanceBeanList) {
        this.attendanceBeanList = attendanceBeanList;
    }


}
