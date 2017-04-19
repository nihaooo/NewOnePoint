package explame.com.smartbutler.BeanBmob;

import cn.bmob.v3.BmobObject;

/*
 *      项目名：    SmartButler
 *      包名：       explame.com.smartbutler.BeanBmob
 *      时间           2017/4/19.
 *      创建者：    qzhuorui
 *      描述：        TODO
 */
public class Lost extends BmobObject {
    private String title;//标题
    private String describe;//描述
    private String phone;//联系手机
    private String time;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
