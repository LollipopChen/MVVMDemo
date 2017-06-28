package viewModel;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.mvvmdemo.MainActivity;

/**
 * Created by TS-YFZX-CQE on 2017/6/15.
 */

public class MainViewModel {
    private String userName;
    private String nickname;
    private int age;
    private View.OnClickListener onClickListener;

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    public MainViewModel() {//无参构造方法
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MainViewModel(String userName, String nickname, int age) {//有参构造方法
        this.userName = userName;
        this.nickname = nickname;
        this.age = age;
    }
}
