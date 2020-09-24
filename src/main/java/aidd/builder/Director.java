package aidd.builder;

/**
 * 〈〉
 *
 * @author jieachan
 * @create 2020/9/1
 */
public class Director {
    private Builder builder;
    public Director(Builder builder)
    {
        this.builder=builder;
    }
    //产品构建与组装方法
    public Product construct()
    {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
