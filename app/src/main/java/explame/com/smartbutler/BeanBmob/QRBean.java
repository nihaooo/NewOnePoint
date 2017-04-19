package explame.com.smartbutler.BeanBmob;

import cn.bmob.v3.BmobObject;

/*
 *      项目名：    SmartButler
 *      包名：       explame.com.smartbutler.BeanBmob
 *      时间           2017/4/19.
 *      创建者：    qzhuorui
 *      描述：        TODO
 */
public class QRBean extends BmobObject {
    private String studentclass;
    private String studentid;

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }
}