package cn.mrxccc.adapter.objectadapter;

/**
 * @author mrxccc
 * @create 2020/9/2
 */
public class ObjectAdapterPatternTest {
    public static void main(String[] args) {
        PowerTarget target = new PowerAdapter(new PowerAdaptee());
        target.output5V();
    }
}
