package Message;

/**
 * 作者：fan on 2018/1/24 16:21
 * 邮箱：fanyanlong1991@163.com
 *
 * 建立消息类
 */

public class MessageEvent {


    private  String Message;
    private  String Age;
    private  String Name;

    public MessageEvent(String message) {
        this.Message = message;
    }

    public MessageEvent(String message,String age,String name) {
        this.Message = message;
        this.Age=age;
        this.Name=name;

    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
