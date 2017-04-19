package explame.com.smartbutler.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/*
 *      项目名：    SmartButler
 *      包名：       explame.com.smartbutler.utils
 *      时间           2017/4/19.
 *      创建者：    qzhuorui
 *      描述：        TODO 管理活动
 */
public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }
    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }
    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}