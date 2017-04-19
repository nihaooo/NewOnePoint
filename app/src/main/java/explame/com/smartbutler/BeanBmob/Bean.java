package explame.com.smartbutler.BeanBmob;

import cn.bmob.v3.BmobUser;

/*
 *      项目名：    SmartButler
 *      包名：       explame.com.smartbutler.BeanBmob
 *      时间           2017/4/19.
 *      创建者：    qzhuorui
 *      描述：        TODO
 */
public class Bean extends BmobUser {
    private String name;
    private int studentid;
    private int pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }
}

