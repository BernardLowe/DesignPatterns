package jieachan.adapter.defaultadapter;

/**
 * @author jieachan
 * @create 2020/9/2
 */
public class DefaultAdapterPatternTest {
    public static void main(String[] args) {
        PowerTarget target = new PowerAdapter(new PowerAdaptee());
        target.output5V();
    }
}